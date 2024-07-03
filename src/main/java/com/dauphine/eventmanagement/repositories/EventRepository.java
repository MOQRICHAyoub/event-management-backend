package com.dauphine.eventmanagement.repositories;

import com.dauphine.eventmanagement.models.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, Integer> {
}
