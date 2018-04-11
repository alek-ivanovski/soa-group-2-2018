package com.soa.recruitment.service;

import com.soa.recruitment.model.JobApplication;

public interface JobApplicationService {

    public JobApplication getApplication(Long id);

    public void deleteApplication(Long id);

    public JobApplication create(JobApplication jobApplication);
}
