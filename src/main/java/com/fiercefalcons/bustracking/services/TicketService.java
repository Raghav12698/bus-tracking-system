package com.fiercefalcons.bustracking.services;


import com.fiercefalcons.bustracking.models.Ticket;
import com.fiercefalcons.bustracking.repositories.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    // Save a ticket
    public Ticket saveTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    // Find tickets by user ID
    public List<Ticket> findTicketsByUserId(Long userId) {
        return ticketRepository.findByUserId(userId);
    }

    // Find a ticket by its ID
    public Optional<Ticket> findTicketById(Long ticketId) {
        return ticketRepository.findById(ticketId);
    }

    // Delete a ticket by its ID
    public void deleteTicket(Long ticketId) {
        ticketRepository.deleteById(ticketId);
    }
}
