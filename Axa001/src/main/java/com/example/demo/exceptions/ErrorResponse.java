package com.example.demo.exceptions;

import java.time.LocalDate;

public class ErrorResponse {
 
    private int statusCode;
    private String message;
    private LocalDate date;
   
 
    public ErrorResponse(int statusCode, String message, LocalDate date) {
		super();
		this.statusCode = statusCode;
		this.message = message;
		this.date = date;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public ErrorResponse(String message)
    {
        super();
        this.message = message;
    }

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ErrorResponse(int statusCode, String message) {
		super();
		this.statusCode = statusCode;
		this.message = message;
	}

	public ErrorResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}