package com.bg.poc.eventlog.service;

import com.bg.poc.eventlog.model.DomainEvent;
import com.bg.poc.eventlog.model.EventLog;
import com.bg.poc.eventlog.repository.EventLogRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class EventLogService {

    @Autowired
    private EventLogRepository eventLogRepository;

    public <T> void logEvent(DomainEvent<T> event) throws JsonProcessingException {
        eventLogRepository.save(new EventLog(new Date(), event.serialize()));

    }
}
