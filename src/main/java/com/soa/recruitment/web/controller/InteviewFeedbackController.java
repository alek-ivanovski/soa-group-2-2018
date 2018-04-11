package com.soa.recruitment.web.controller;

import com.soa.recruitment.model.InterviewFeedback;
import com.soa.recruitment.service.InterviewFeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/interview-feedback")
public class InteviewFeedbackController {

    @Autowired
    private InterviewFeedbackService interviewFeedbackService;

    @GetMapping(value = "{id}")
    public InterviewFeedback getInterviewFeedback(@PathVariable Long id) {
        return this.interviewFeedbackService.getInterviewFeedback(id);
    }

    @DeleteMapping(value = "{id}")
    public void deleteInterviewFeedback(@PathVariable Long id) {
        this.interviewFeedbackService.deleteInterviewFeedback(id);
    }

    @PostMapping
    public void addInterviewFeedback(@RequestBody InterviewFeedback interviewFeedback) {
        this.interviewFeedbackService.addInterviewFeedback(interviewFeedback);
    }

}
