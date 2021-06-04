package com.example.restAPI.exception;

import org.springframework.http.HttpStatus;

public class exceptionPayload {
	private final String message;
	private final HttpStatus status;
	public String getMessage() {
		return message;
	}

	public exceptionPayload(String message, HttpStatus status) {
		super();
		this.message = message;
		this.status = status;
	}

	public HttpStatus getStatus() {
		return status;
	}
}
