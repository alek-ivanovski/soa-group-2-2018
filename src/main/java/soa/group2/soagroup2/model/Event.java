package soa.group2.soagroup2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Event {

    @Id
    @GeneratedValue
    public Long id;

    public String title;

    public String description;

    public String location;

    public Date date;


}
