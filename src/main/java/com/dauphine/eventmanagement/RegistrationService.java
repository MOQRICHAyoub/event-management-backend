package com.dauphine.eventmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistrationService {
    @Autowired
    private RegistrationRepository registrationRepository;

    public List<Registration> getAllRegistrations() {
        return registrationRepository.findAll();
    }

    public List<Registration> getRegistrationsByEventId(int eventid) {
        return registrationRepository.findByEventid(eventid);
    }

    public Registration saveRegistration(Registration registration) {
        return registrationRepository.save(registration);
    }

    public boolean isUserRegistered(int eventId, String userName) {
        return registrationRepository.existsByEventidAndUsername(eventId, userName);
    }
}
