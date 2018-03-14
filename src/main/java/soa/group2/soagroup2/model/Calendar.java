package soa.group2.soagroup2.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Calendar {

    @Id
    public String Year;

    @ManyToMany
    @JoinTable(name = "calendar_events")
    public List<Event> events = new ArrayList<Event>();


}
