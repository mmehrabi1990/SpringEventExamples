package com.mehrabi.springeventexamples.asynchronusevent;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ApplicationEventMulticaster;
import org.springframework.context.event.SimpleApplicationEventMulticaster;
import org.springframework.core.task.SimpleAsyncTaskExecutor;

//if uncomment this the custom event will run in another thread async
@Configuration
public class AsynchronousSpringEventsConfig {
//	    @Bean(name = "applicationEventMulticaster")
//	    public ApplicationEventMulticaster simpleApplicationEventMulticaster() {
//	        SimpleApplicationEventMulticaster eventMulticaster =
//	          new SimpleApplicationEventMulticaster();
//
//	        eventMulticaster.setTaskExecutor(new SimpleAsyncTaskExecutor());
//	        return eventMulticaster;
//	    }
}