package com.fiercefalcons.bustracking.models;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class RecommendationType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type; // Example values: "Food Stop", "Place to Visit", "Toll", "Petrol Pump"

    // Getters and Setters
    // Default constructor for JPA
    public RecommendationType() {}

    // Parameterized constructor for setting all fields except id
    public RecommendationType(String type) {
        this.type = type;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

