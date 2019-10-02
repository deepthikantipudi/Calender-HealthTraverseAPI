package com.mss.calender.exceptionHandling;

public class EventNotFoundException extends RuntimeException{
	
	public EventNotFoundException() {
        super();
    }

    public EventNotFoundException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public EventNotFoundException(final String message) {
        super(message);
    }

    public EventNotFoundException(final Throwable cause) {
        super(cause);
    }
}
