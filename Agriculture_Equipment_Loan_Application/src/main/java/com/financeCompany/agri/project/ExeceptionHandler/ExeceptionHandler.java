package com.financeCompany.agri.project.ExeceptionHandler;


import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExeceptionHandler
{
	@ExceptionHandler(NullPointerException.class)
	public ResponseEntity<String> nullPointerExeception()
	{
		return new ResponseEntity<String>("not valid",HttpStatus.BAD_REQUEST);
		
	}
	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<String> NoSuchElementException()
	{
		return new ResponseEntity<String>("Requested Element Do not Exist",HttpStatus.BAD_REQUEST);
		
	}

}
