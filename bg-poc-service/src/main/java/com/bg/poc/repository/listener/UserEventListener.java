package com.bg.poc.repository.listener;

import com.bg.poc.eventlog.service.EventLogService;
import com.bg.poc.model.User;
import com.bg.poc.model.UserCreatedEvent;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.annotation.HandleAfterCreate;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@RepositoryEventHandler
public class UserEventListener {

    @Autowired
    private EventLogService eventLogService;

    @HandleAfterCreate
    public void handleUserCreate(User user) throws JsonProcessingException {
        eventLogService.logEvent(new UserCreatedEvent(new Date(), user));
    }

}
