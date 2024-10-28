package com.fiercefalcons.bustracking.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.fiercefalcons.bustracking.models.Ticket;
import java.util.List;
public interface TicketRepository extends JpaRepository<Ticket, Long> {
    // Custom method to find tickets by user ID
    List<Ticket> findByUserId(Long userId);
}
