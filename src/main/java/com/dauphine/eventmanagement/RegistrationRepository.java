package com.dauphine.eventmanagement;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration, Integer> {
    List<Registration> findByEventid(int eventid);
    boolean existsByEventidAndUsername(int eventId, String username);
}
