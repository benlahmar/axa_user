package com.example.demo.exceptions;

import java.time.LocalDate;

//Class to handle exception Globally

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value= NoSuchCustomerExistsException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public @ResponseBody ErrorResponse	handleException(NoSuchCustomerExistsException ex)
	{
		return new ErrorResponse(
			HttpStatus.NOT_FOUND.value(), ex.getMessage(), LocalDate.now());
	}
	
	@ExceptionHandler(value= NullPointerException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public @ResponseBody ErrorResponse	handleException2(NullPointerException ex)
	{
		return new ErrorResponse(
				HttpStatus.NOT_FOUND.value(), ex.getMessage(), LocalDate.now());
	}
	
	
	@ExceptionHandler(value = RoleInterditException.class)
	public ErrorResponse handlerExceptionrole(RoleInterditException exp)
	{
		return new ErrorResponse(454,"" , LocalDate.now());
	}
}
