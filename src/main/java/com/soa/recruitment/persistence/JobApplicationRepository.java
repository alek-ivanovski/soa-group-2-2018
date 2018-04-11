package com.soa.recruitment.persistence;

import com.soa.recruitment.model.JobApplication;

public interface JobApplicationRepository {

    public JobApplication findById(Long id);

}
