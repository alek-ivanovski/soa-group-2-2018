package com.soa.recruitment.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class JobListing {

    @Id
    @GeneratedValue
    public long id;

    public String jobType;
    public String jobTitle;
    public String jobDescription;
    public int numPositionsOpen;
    public Long salaryRange;
    public LocalDate applicationDeadline;

}
