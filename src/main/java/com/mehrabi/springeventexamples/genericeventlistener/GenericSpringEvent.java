package com.mehrabi.springeventexamples.genericeventlistener;

import org.springframework.context.ApplicationEvent;

public class GenericSpringEvent<T> extends ApplicationEvent {
    private final T what;
    protected boolean success;

    public GenericSpringEvent(T what, boolean success) {
        super(what);
        this.what = what;
        this.success = success;
    }

    public T getWhat() {
        return what;
    }

    public boolean isSuccess() {
        return success;
    }
}