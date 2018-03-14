package soa.group2.soagroup2.persistance.jpa;

import org.aspectj.apache.bcel.util.Repository;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import soa.group2.soagroup2.model.Event;
import soa.group2.soagroup2.persistance.EventRepository;

@Profile("jpa")
public interface JpaEventRepository extends EventRepository, Repository<Event, Long> {



}
