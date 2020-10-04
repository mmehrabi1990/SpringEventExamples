package com.mehrabi.springeventexamples.customevnet;

import com.mehrabi.springeventexamples.customevnet.CustomSpringEventPublisher;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class RunEvents implements ApplicationListener<ContextRefreshedEvent> {

    CustomSpringEventPublisher customSpringEventPublisher;

    public RunEvents(CustomSpringEventPublisher customSpringEventPublisher) {
        this.customSpringEventPublisher = customSpringEventPublisher;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        customSpringEventPublisher.publishCustomEvent("Hello");
    }
}
