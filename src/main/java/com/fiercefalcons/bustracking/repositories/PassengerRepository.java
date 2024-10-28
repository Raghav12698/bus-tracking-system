package com.fiercefalcons.bustracking.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.fiercefalcons.bustracking.models.Passenger;
public interface PassengerRepository extends JpaRepository<Passenger, Long> {}


