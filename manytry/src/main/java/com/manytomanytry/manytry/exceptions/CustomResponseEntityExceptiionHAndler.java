package com.manytomanytry.manytry.exceptions;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestController 
@ControllerAdvice //share something between all components(contains all controllers)
public class CustomResponseEntityExceptiionHAndler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(Exception.class) //handle all exceptions
	public final ResponseEntity<Object> handleAllException(Exception ex, WebRequest request) {
		ModelExceptionResponse exceptionResponse = new ModelExceptionResponse(new Date().toString(), ex.getMessage(), request.getDescription(false));
		return new ResponseEntity<Object>(exceptionResponse,HttpStatus.INTERNAL_SERVER_ERROR);
	
	}
	
	@ExceptionHandler(DataNotFoundException.class) 
	public final ResponseEntity<Object> handleDataNotFoundException(DataNotFoundException ex, WebRequest request) {
		ModelExceptionResponse exceptionResponse = new ModelExceptionResponse(new Date().toString(), ex.getMessage(), request.getDescription(false));
		return new ResponseEntity<Object>(exceptionResponse,HttpStatus.NOT_FOUND);
		
	}
	
	
	
}
