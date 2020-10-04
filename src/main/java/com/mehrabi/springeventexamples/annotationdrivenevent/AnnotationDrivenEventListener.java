package com.mehrabi.springeventexamples.annotationdrivenevent;

import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AnnotationDrivenEventListener {
    @EventListener(condition = "#cse.success")
    public void handleContextStart(ContextStartedEvent cse) {
        System.out.println("Handling context started event.");
    }
}