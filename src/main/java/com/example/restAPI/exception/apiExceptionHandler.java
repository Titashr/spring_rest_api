package com.example.restAPI.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class apiExceptionHandler {

	@ExceptionHandler(apiExceptions.class)
	public ResponseEntity<?> apiExceptionHandlerMethod(apiExceptions e) {
		exceptionPayload exception = new exceptionPayload(e.getMessage(), HttpStatus.BAD_REQUEST);
		return new ResponseEntity<>(exception, HttpStatus.BAD_REQUEST);
		
	}
	
}
