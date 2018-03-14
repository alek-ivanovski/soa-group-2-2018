package soa.group2.soagroup2.service.impl;

import org.springframework.stereotype.Service;
import soa.group2.soagroup2.model.Event;
import soa.group2.soagroup2.model.User;
import soa.group2.soagroup2.service.CalendarService;

import java.util.List;

@Service
public class CalendarServiceImpl implements CalendarService {
    @Override
    public void createEvent(Event event) {

    }

    @Override
    public void updateEvent(Event event) {

    }

    @Override
    public void deleteEvent(long eventID) {

    }

    @Override
    public List<Event> showEvents(User user) {
        return null;
    }
}
