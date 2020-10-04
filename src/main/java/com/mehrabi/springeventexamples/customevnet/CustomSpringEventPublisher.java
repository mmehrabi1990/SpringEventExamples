package com.mehrabi.springeventexamples.customevnet;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Slf4j
@Component
	public class CustomSpringEventPublisher {
	    @Autowired
	    private ApplicationEventPublisher applicationEventPublisher;
	 
	    public void publishCustomEvent(final String message) {
	        log.info("Publishing custom event. ");
	        CustomSpringEvent customSpringEvent = new CustomSpringEvent(this, message);
	        applicationEventPublisher.publishEvent(customSpringEvent);
	    }
	}