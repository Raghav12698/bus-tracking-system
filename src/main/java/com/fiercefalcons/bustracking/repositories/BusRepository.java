package com.fiercefalcons.bustracking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fiercefalcons.bustracking.models.Bus;

public interface BusRepository extends JpaRepository<Bus, Long> {}