package com.UST.api.Exception;

public class UserNotFoundException extends Exception {
	private static final long serialversionUID=1L;
	
	public UserNotFoundException(String message) {
		super(message);
	}

}
