# SpringEventExamples

Events are one of the more overlooked functionalities in the framework but also one of the more useful. And – like many other things in Spring – event publishing is one of the capabilities provided by ApplicationContext.

There are a few simple guidelines to follow:

    the event should extend ApplicationEvent
    the publisher should inject an ApplicationEventPublisher object
    the listener should implement the ApplicationListener interface

---------------------------------------
Types of Events in Spring:

  Aynchronous events
 
  Asynchronous events
 
  Framework events
 
  Transaction Bound events
 
 --------------------------------------
 
 events can be annotation driven so we dont need to implement ApplicationListener.
 
 we can use Spring Expresion Language , so an event runs if condition is true.
 
 It is also possible to dispatch events with generics information
