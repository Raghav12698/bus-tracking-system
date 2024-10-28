package com.fiercefalcons.bustracking.repositories;

import com.fiercefalcons.bustracking.models.Recommendation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecommendationRepository extends JpaRepository<Recommendation, Long> {

    // Custom query to find recommendations by route ID
    List<Recommendation> findByRouteId(Long routeId);

    // Custom query to find recommendations by destination name
    List<Recommendation> findByDestination(String destination);
}
