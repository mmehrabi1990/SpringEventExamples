package com.mehrabi.springeventexamples.genericeventlistener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class RunGenericEvents implements ApplicationListener<ContextRefreshedEvent> {

    GenericCustomSpringEventPublisher genericCustomSpringEventPublisher;

    public RunGenericEvents(GenericCustomSpringEventPublisher genericCustomSpringEventPublisher) {
        this.genericCustomSpringEventPublisher = genericCustomSpringEventPublisher;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        genericCustomSpringEventPublisher.publishCustomEvent(false);
    }
}
