package com.manytomanytry.manytry.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class DataNotFoundException extends RuntimeException {



	public DataNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;

}
