package com.UST.api.Advice;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.UST.api.Exception.UserNotFoundException;

@RestControllerAdvice
public class ApplicationExceptionHandler {
/*	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String,String>handleInvalidArgument(MethodArgumentNotValidException ex){
		Map<String,String>errormap =new HashMap<>();
	//	ex.getBindingResult().getFieldError().forEach(error ->{
		//	errormap.put(error.getField(),error.getDefaultMessage());
	//	});
		return errormap;
	}*/
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(UserNotFoundException.class)
	public Map<String,String>handleBusinessException(UserNotFoundException ex){
		Map<String,String>errormap =new HashMap<>();
		errormap.put("error", ex.getMessage());
		return errormap;
	}
	
	
	

}
