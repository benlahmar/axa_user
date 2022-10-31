package com.example.demo.exceptions;

public class NoSuchCustomerExistsException
extends RuntimeException {

	private static final long serialVersionUID = 1L;
private String message;

public NoSuchCustomerExistsException() {}

public NoSuchCustomerExistsException(String msg)
{
    super(msg);
    this.message = msg;
}
}