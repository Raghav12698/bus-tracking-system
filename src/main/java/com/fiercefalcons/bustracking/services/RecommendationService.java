package com.fiercefalcons.bustracking.services;

import com.fiercefalcons.bustracking.models.Recommendation;
import com.fiercefalcons.bustracking.repositories.RecommendationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RecommendationService {

    @Autowired
    private RecommendationRepository recommendationRepository;

    // Save a new recommendation (e.g., food stop, place to visit)
    public Recommendation saveRecommendation(Recommendation recommendation) {
        return recommendationRepository.save(recommendation);
    }

    // Retrieve recommendations by route ID
    public List<Recommendation> findRecommendationsByRouteId(Long routeId) {
        return recommendationRepository.findByRouteId(routeId);
    }

    // Retrieve recommendations by destination
    public List<Recommendation> findRecommendationsByDestination(String destination) {
        return recommendationRepository.findByDestination(destination);
    }

    // Admin: Delete a recommendation by ID
    public void deleteRecommendation(Long recommendationId) {
        recommendationRepository.deleteById(recommendationId);
    }
}
