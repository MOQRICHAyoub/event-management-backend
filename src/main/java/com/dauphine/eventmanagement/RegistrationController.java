package com.dauphine.eventmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/registrations")
public class RegistrationController {
    @Autowired
    private RegistrationService registrationService;

    @GetMapping
    public List<Registration> getAllRegistrations() {
        return registrationService.getAllRegistrations();
    }

    @GetMapping("/event/{eventid}")
    public List<Registration> getParticipants(@PathVariable int eventid) {
        return registrationService.getRegistrationsByEventId(eventid);
    }

    @PostMapping
    public Registration register(@RequestBody Registration registration) {
        return registrationService.saveRegistration(registration);
    }

    @GetMapping("/event/{eventId}/user/{userName}")
    public boolean isUserRegistered(@PathVariable int eventId, @PathVariable String userName) {
        return registrationService.isUserRegistered(eventId, userName);
    }
}
