package com.bg.poc.eventlog.config;


import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Import(AopConfig.class)
public @interface EnableEventLog {
}
