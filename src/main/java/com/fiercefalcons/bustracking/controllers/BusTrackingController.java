package com.fiercefalcons.bustracking.controllers;

import com.fiercefalcons.bustracking.models.User;
import com.fiercefalcons.bustracking.models.Role;
import com.fiercefalcons.bustracking.models.Ticket;
import com.fiercefalcons.bustracking.models.Recommendation;
import com.fiercefalcons.bustracking.services.UserService;
import com.fiercefalcons.bustracking.services.TicketService;
import com.fiercefalcons.bustracking.services.RecommendationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api")
public class BusTrackingController {

    @Autowired
    private UserService userService;

    @Autowired
    private TicketService ticketService;

    @Autowired
    private RecommendationService recommendationService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    // User registration
    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userService.saveUser(user);
        return ResponseEntity.ok("User registered successfully");
    }

    // User login - handled by Spring Security, no need for a custom login endpoint

    // Admin-only endpoint to add new destinations and recommendations
    @PostMapping("/admin/addDestination")
    public ResponseEntity<String> addDestination(@RequestBody Recommendation recommendation) {
        recommendationService.saveRecommendation(recommendation);
        return ResponseEntity.ok("Destination added successfully");
    }

    // Book a ticket
    @PostMapping("/ticket/book")
    public ResponseEntity<String> bookTicket(@RequestBody Ticket ticket) {
        ticketService.saveTicket(ticket);
        return ResponseEntity.ok("Ticket booked successfully");
    }

    // View booked tickets for a user
    @GetMapping("/tickets/{userId}")
    public ResponseEntity<List<Ticket>> getTicketsByUser(@PathVariable Long userId) {
        List<Ticket> tickets = ticketService.findTicketsByUserId(userId);
        return ResponseEntity.ok(tickets);
    }

    // Get recommendations (e.g., food stops, places to visit)
    @GetMapping("/recommendations/{routeId}")
    public ResponseEntity<List<Recommendation>> getRecommendations(@PathVariable Long routeId) {
        List<Recommendation> recommendations = recommendationService.findRecommendationsByRouteId(routeId);
        return ResponseEntity.ok(recommendations);
    }
}
