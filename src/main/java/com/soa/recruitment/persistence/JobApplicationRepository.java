package com.soa.recruitment.persistence;

import com.soa.recruitment.model.JobApplication;

public interface JobApplicationRepository {

    public JobApplication findById(Long id);

    public void deleteById(Long id);

    public JobApplication save(JobApplication jobApplication);


}
