package org.letsupgrade.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<Object> handleUserNotFoundException(UserNotFoundException ex, WebRequest request) {
		ErrorResponse errorResponse = new ErrorResponse(new Date(), ex.getMessage(), request.getDescription(false));
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
	}
}
