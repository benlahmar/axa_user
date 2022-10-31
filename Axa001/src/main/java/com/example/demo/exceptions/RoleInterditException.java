package com.example.demo.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoleInterditException extends RuntimeException{


	private static final long serialVersionUID = 1L;
	String msg;

	
	
}
