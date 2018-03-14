package soa.group2.soagroup2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Date;
import java.util.List;

@Entity
public class Event {

    @Id
    @GeneratedValue
    public long id;

    public String name;

    public String description;

    public String location;

    public Date date;

    public Integer priority;

    @ManyToMany
    List<User> participants;

    @ManyToMany
    List<User> organizers;




}
