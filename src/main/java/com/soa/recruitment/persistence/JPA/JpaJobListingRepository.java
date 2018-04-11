package com.soa.recruitment.persistence.JPA;

import com.soa.recruitment.model.JobListing;
import com.soa.recruitment.persistence.JobListingRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.data.repository.Repository;

@Profile("jpa")
public interface JpaJobListingRepository extends JobListingRepository, Repository<JobListing, Long>
{
}
