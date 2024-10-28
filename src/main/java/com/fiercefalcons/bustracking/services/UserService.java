package com.fiercefalcons.bustracking.services;
import com.fiercefalcons.bustracking.models.User;
import com.fiercefalcons.bustracking.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    // Save a user (with password encoding)
    public User saveUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    // Find user by username
    public Optional<User> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    // Find user by ID
    public Optional<User> findById(Long userId) {
        return userRepository.findById(userId);
    }

    // Check if a user exists by username
    public boolean existsByUsername(String username) {
        return userRepository.existsByUsername(username);
    }
}
