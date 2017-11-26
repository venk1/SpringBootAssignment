package com.curd.assignment.aspect;

import java.util.List;

import org.springframework.http.HttpStatus;

public class GenericErrorMessage {
	private String errMsg;
	private HttpStatus status;
	private List<FieldErrorMessage> fieldErrors;
	
	public GenericErrorMessage(String errMsg, HttpStatus errorCode) {
		this.errMsg = errMsg;
		this.status = errorCode;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public List<FieldErrorMessage> getFieldErrors() {
		return fieldErrors;
	}

	public void setFieldErrors(List<FieldErrorMessage> fieldErrors) {
		this.fieldErrors = fieldErrors;
	}

}
