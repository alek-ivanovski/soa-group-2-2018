package com.soa.recruitment.persistence.JPA;

import com.soa.recruitment.model.JobApplication;
import com.soa.recruitment.persistence.JobApplicationRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.data.repository.Repository;

@Profile("jpa")
public interface JpaJobApplicationRepository extends JobApplicationRepository, Repository<JobApplication, Long> {
}
