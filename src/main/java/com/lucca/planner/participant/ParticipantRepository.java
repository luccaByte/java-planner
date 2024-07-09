package com.lucca.planner.participant;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ParticipantRepository extends JpaRepository<Participant, UUID> {

}
