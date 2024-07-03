package com.dauphine.eventmanagement.controllers;

import com.dauphine.eventmanagement.models.Feedback;
import com.dauphine.eventmanagement.services.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/feedbacks")
public class FeedbackController {
    @Autowired
    private FeedbackService feedbackService;

    @GetMapping
    public List<Feedback> getAllFeedbacks() {
        return feedbackService.getAllFeedbacks();
    }

    @GetMapping("/event/{eventId}")
    public List<Feedback> getFeedbacks(@PathVariable int eventId) {
        return feedbackService.getFeedbacksByEventId(eventId);
    }

    @PostMapping
    public Feedback addFeedback(@RequestBody Feedback feedback) {
        return feedbackService.saveFeedback(feedback);
    }
}
