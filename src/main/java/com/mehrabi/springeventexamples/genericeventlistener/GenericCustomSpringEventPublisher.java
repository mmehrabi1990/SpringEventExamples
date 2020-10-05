package com.mehrabi.springeventexamples.genericeventlistener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class GenericCustomSpringEventPublisher {
    private final ApplicationEventPublisher applicationEventPublisher;

    public GenericCustomSpringEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void publishCustomEvent(final boolean condition) {
        log.info("Publishing generic custom event. ");
        //if we set condition true conditional event will happen
        GenericSpringEvent<?> genericSpringEvent = new GenericSpringEvent(this, condition);
        applicationEventPublisher.publishEvent(genericSpringEvent);
    }
}