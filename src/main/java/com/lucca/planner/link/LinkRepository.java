package com.lucca.planner.link;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkRepository extends JpaRepository<Link, UUID> {

}
