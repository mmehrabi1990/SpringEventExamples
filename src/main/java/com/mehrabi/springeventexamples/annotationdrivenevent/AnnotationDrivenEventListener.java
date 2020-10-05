package com.mehrabi.springeventexamples.annotationdrivenevent;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class AnnotationDrivenEventListener {
    //if we want async with annotation
//    @Async
    @EventListener
    public void handleContextStart(ContextStartedEvent cse) {
        log.info("Handling context started event.");
    }
}