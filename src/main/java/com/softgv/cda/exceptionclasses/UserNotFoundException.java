package com.softgv.cda.exceptionclasses;

public class UserNotFoundException extends RuntimeException {

	private String message;

	public UserNotFoundException() {
	}

	public UserNotFoundException(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return this.message;
	}

}
