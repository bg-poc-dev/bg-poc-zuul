package com.bg.poc.eventlog.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Getter
@Setter
@Entity
public class EventLog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private Date firedOn;
    private String domainEvent;

    public EventLog(){}
    public EventLog(Date firedOn, String domainEvent) {
        this.firedOn = firedOn;
        this.domainEvent = domainEvent;
    }
}
