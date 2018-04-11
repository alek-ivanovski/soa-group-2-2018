package com.soa.recruitment.service;

import com.soa.recruitment.model.JobListing;

import javax.xml.ws.ServiceMode;
import java.util.Optional;

@ServiceMode
public interface JobListingService {

    Optional<JobListing> findOne(Long id);
    JobListing save(JobListing jobListing);

    Iterable<JobListing> findAll();

    void delete(Long id);
}
