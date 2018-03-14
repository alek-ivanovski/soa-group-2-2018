package soa.group2.soagroup2.service;

import soa.group2.soagroup2.model.Event;
import soa.group2.soagroup2.model.User;

import java.util.List;

public interface CalendarService {

    public void createEvent(Event event);
    public void updateEvent(Event event);
    public void deleteEvent(long eventID);

    public List<Event> showEvents(User user);


}
