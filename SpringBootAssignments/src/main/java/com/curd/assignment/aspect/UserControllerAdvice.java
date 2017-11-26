package com.curd.assignment.aspect;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class UserControllerAdvice extends ResponseEntityExceptionHandler{


	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		final String message = "Please enter the correct information";

		List<FieldErrorMessage> errors = ex.getBindingResult().getFieldErrors().stream()
				.map(fieldError -> new FieldErrorMessage(fieldError.getField(), fieldError.getDefaultMessage()))
				.collect(Collectors.toList());
		GenericErrorMessage genericMessage = new GenericErrorMessage(message, HttpStatus.BAD_REQUEST);
		genericMessage.setFieldErrors(errors);
		return new ResponseEntity<Object>(genericMessage, HttpStatus.BAD_REQUEST);
	
	}
}
