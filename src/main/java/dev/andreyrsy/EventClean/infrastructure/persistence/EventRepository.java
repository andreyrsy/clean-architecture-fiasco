package dev.andreyrsy.EventClean.infrastructure.persistence;

import jdk.jfr.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<EventoEntity, Integer> {
}
