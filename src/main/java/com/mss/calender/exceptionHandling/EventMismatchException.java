package com.mss.calender.exceptionHandling;

public class EventMismatchException extends RuntimeException {
	  public EventMismatchException() {
	        super();
	    }

	    public EventMismatchException(final String message, final Throwable cause) {
	        super(message, cause);
	    }

	    public EventMismatchException(final String message) {
	        super(message);
	    }

	    public EventMismatchException(final Throwable cause) {
	        super(cause);
	    }
}
