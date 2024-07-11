package com.lucca.planner.activity;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityRepository extends JpaRepository<Activity, UUID>{

}
