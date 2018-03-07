package soa.group2.soagroup2.web.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import soa.group2.soagroup2.service.CalendarService;

@RestController
@RequestMapping(value = "/api/calendar", produces = MediaType.APPLICATION_JSON_VALUE)
public class CalendarController {
    CalendarService calendarService;

    @Autowired
    public CalendarController(CalendarService calendarService){
        this.calendarService = calendarService;
    }
}
