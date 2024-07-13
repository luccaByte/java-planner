package com.lucca.planner.link;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface LinkRepository extends JpaRepository<Link, UUID> {
    public List<Link> findByTripId(UUID tripId);
}
