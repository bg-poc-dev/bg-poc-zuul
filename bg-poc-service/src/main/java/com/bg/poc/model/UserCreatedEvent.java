package com.bg.poc.model;

import com.bg.poc.eventlog.model.DomainEvent;
import lombok.Getter;

import java.util.Date;

/**
 * @author Alex Belikov
 */
@Getter
public class UserCreatedEvent extends DomainEvent<User> {

    public UserCreatedEvent(Date firedOn, User user) {
        super(firedOn, user);
    }
}
