package com.example.restAPI.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class apiExceptions extends RuntimeException{

	private static final long serialVersionUID = 5365411287120186709L;

	public apiExceptions(String message) {
		super(message);
	}

}
