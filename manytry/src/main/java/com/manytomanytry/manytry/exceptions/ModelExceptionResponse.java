package com.manytomanytry.manytry.exceptions;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ModelExceptionResponse {

	private String date;
	private String message;
	private String details;
	public ModelExceptionResponse(String date, String message, String details) {
		this.date = date;
		this.message = message;
		this.details = details;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	
	
}
