package com.soa.recruitment.web.controller;

import com.soa.recruitment.model.JobListing;
import com.soa.recruitment.service.JobListingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/recruitment/jobs/listing", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
public class JobListingController {

    private final JobListingService jobListingService;

    @Autowired
    public JobListingController(JobListingService jobListingService) {
        this.jobListingService = jobListingService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<JobListing> all() {
        return jobListingService.findAll();
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public JobListing save(@RequestBody JobListing category){
        return jobListingService.save(category);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id){
        jobListingService.delete(id);
    }



}
