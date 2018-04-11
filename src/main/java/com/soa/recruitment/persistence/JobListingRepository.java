package com.soa.recruitment.persistence;

import com.soa.recruitment.model.JobListing;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface JobListingRepository {

    Optional<JobListing> findByTitle(String title);

    Iterable<JobListing> findAll();

    void delete(Long id);

    JobListing save(JobListing jobListing);

    JobListing findById(Long id);

}

