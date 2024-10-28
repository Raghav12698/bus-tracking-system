package com.fiercefalcons.bustracking.repositories;
import com.fiercefalcons.bustracking.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    // Custom method to check if a username exists
    boolean existsByUsername(String username);
}
