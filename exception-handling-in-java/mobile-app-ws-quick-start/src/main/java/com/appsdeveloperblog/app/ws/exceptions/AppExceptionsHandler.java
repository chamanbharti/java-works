package com.appsdeveloperblog.app.ws.exceptions;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.appsdeveloperblog.app.ws.ui.model.response.ErrorMessage;

//@ControllerAdvice
public class AppExceptionsHandler extends ResponseEntityExceptionHandler {
    
	// for any exception
//  @ExceptionHandler(value = {Exception.class})
//  public ResponseEntity<Object>handleAnyException(Exception ex, WebRequest request) {
//	  return new ResponseEntity<>(ex, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
//  }
	
	// for any exception
//	@ExceptionHandler(value = {Exception.class})
//	  public ResponseEntity<Object>handleAnyException(Exception ex, WebRequest request) {
//			ErrorMessage errorMessage = new ErrorMessage(new Date(), ex.getLocalizedMessage());
//		  return new ResponseEntity<>(errorMessage, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
//	  }
	
	// for any exception
//	@ExceptionHandler(value = {Exception.class})
//	  public ResponseEntity<Object>handleAnyException(Exception ex, WebRequest request) {
//			String errorMessageDescription = ex.getLocalizedMessage();
//			if(errorMessageDescription == null) errorMessageDescription = ex.toString();
////			if(errorMessageDescription == null) errorMessageDescription = "NullPointerException";
//			ErrorMessage errorMessage = new ErrorMessage(new Date(), errorMessageDescription);
//		  return new ResponseEntity<>(errorMessage, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
//	  }
	
	// for specific exception
//	@ExceptionHandler(value = {NullPointerException.class})
//	  public ResponseEntity<Object>handleNullPointerException(Exception ex, WebRequest request) {
//			String errorMessageDescription = ex.getLocalizedMessage();
//			if(errorMessageDescription == null) errorMessageDescription = ex.toString();
//			ErrorMessage errorMessage = new ErrorMessage(new Date(), errorMessageDescription);
//		  return new ResponseEntity<>(errorMessage, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
//	  }
//	
//	// for custom exception
//	@ExceptionHandler(value = {UserServiceException.class})
//	  public ResponseEntity<Object>handleUserServiceException(Exception ex, WebRequest request) {
//			String errorMessageDescription = ex.getLocalizedMessage();
//			if(errorMessageDescription == null) errorMessageDescription = ex.toString();
//			ErrorMessage errorMessage = new ErrorMessage(new Date(), errorMessageDescription);
//		  return new ResponseEntity<>(errorMessage, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
//	  }
	
	// for catch more than one exception with one method
//	@ExceptionHandler(value = {Exception.class,NullPointerException.class,UserServiceException.class})
//	  public ResponseEntity<Object>handleMultipleException(Exception ex, WebRequest request) {
//			String errorMessageDescription = ex.getLocalizedMessage();
//			if(errorMessageDescription == null) errorMessageDescription = ex.toString();
//			ErrorMessage errorMessage = new ErrorMessage(new Date(), errorMessageDescription);
//		  return new ResponseEntity<>(errorMessage, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
//	  }
	
//	@ExceptionHandler(value = {Exception.class,NullPointerException.class,UserServiceException.class})
//	  public ResponseEntity<Object>handleMultipleException(Exception ex, WebRequest request) {
//		List<String> details = new ArrayList<>();
//		details.add(ex.getLocalizedMessage());
//		ErrorResponse error = new ErrorResponse("Server Error", details);
//		return new ResponseEntity<Object>(error, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
//	  }
	
	//400 Bad Request
//	@ExceptionHandler()
//	  public ResponseEntity<Object>handleMultipleException(Exception ex, WebRequest request) {
//		List<String> details = new ArrayList<>();
//		details.add(ex.getLocalizedMessage());
//		ErrorResponse error = new ErrorResponse("Bad Request", details);
//		return new ResponseEntity<Object>(error, HttpStatus.BAD_REQUEST);
//	  }
	
	//400
	 @ExceptionHandler(value = ArithmeticException.class)
     public ResponseEntity<ErrorResponse> handleArithmeticException(ArithmeticException ex)
     {
		List<String> details = new ArrayList<>();
		details.add(ex.getLocalizedMessage());
		ErrorResponse error = new ErrorResponse("Arithmetic exception: ",details);
        return new ResponseEntity<ErrorResponse>(error, HttpStatus.BAD_REQUEST);
     }
   
	// 406
     @ExceptionHandler(value = NullPointerException.class)
     public ResponseEntity<ErrorResponse> handleNullPointerException(NullPointerException ex)
     {
        List<String> details = new ArrayList<>();
   		details.add(ex.getLocalizedMessage());
   		ErrorResponse error = new ErrorResponse("Null pointer exception: ",details);
        return new ResponseEntity<ErrorResponse>(error, HttpStatus.NOT_ACCEPTABLE);
     }

     //500
     @ExceptionHandler(value = Exception.class)
     public ResponseEntity<ErrorResponse> handleNullPointerException(Exception ex)
     {
        List<String> details = new ArrayList<>();
      	details.add(ex.getLocalizedMessage());
      	ErrorResponse error = new ErrorResponse("Exception: ",details);
        return new ResponseEntity<ErrorResponse>(error, HttpStatus.INTERNAL_SERVER_ERROR);
     }
     
   
	
    
}
