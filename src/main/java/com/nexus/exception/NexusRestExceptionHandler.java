package com.nexus.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;




@ControllerAdvice
public class NexusRestExceptionHandler extends ResponseEntityExceptionHandler{
	@ExceptionHandler(NexusException.class)
	public final ResponseEntity<Object> handleExceptions(NexusException nexusException){
		NexusAPIError apiError=new NexusAPIError(nexusException.getMessage());
		return new ResponseEntity<Object>(apiError,HttpStatus.NOT_FOUND);
		
	}
}
