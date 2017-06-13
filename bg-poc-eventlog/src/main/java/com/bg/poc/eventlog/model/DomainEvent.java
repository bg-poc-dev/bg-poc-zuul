package com.bg.poc.eventlog.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;

import java.util.Date;

@Getter
public abstract class DomainEvent<T> {

    private final Date firedOn;
    private final T t;

    public DomainEvent(Date firedOn, T t) {
        this.firedOn = new Date(firedOn.getTime());
        this.t = t;
    }

    public String serialize() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(this);
    }
}
