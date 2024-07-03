package com.dauphine.eventmanagement.repositories;

import com.dauphine.eventmanagement.models.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FeedbackRepository extends JpaRepository<Feedback, Integer> {
    List<Feedback> findByEventid(int eventId);
}
