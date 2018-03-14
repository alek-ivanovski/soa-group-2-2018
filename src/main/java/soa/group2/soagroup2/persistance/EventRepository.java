package soa.group2.soagroup2.persistance;

import soa.group2.soagroup2.model.Event;
import soa.group2.soagroup2.model.User;

import java.util.Optional;

public interface EventRepository {
    Event save(Event event);
    Optional<Event> findOne(Long id);
    boolean delete(Long id);

    Iterable<Event> findByUserId(Long userId);
}
