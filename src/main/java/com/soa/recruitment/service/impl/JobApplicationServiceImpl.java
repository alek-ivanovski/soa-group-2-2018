package com.soa.recruitment.service.impl;

import com.soa.recruitment.model.JobApplication;
import com.soa.recruitment.persistence.JobApplicationRepository;
import com.soa.recruitment.service.JobApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobApplicationServiceImpl {

    private JobApplicationRepository jobApplicationRepository;

    @Autowired
    public JobApplicationServiceImpl(JobApplicationRepository jobApplicationRepository){
        this.jobApplicationRepository = jobApplicationRepository;
    }

    public JobApplication getApplication(Long id) {
        return jobApplicationRepository.findById(Long id);
    }

}
