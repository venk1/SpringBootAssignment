package com.curd.assignment.aspect;

import java.io.Serializable;

public class FieldErrorMessage implements Serializable {

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getDefaultMessage() {
		return defaultMessage;
	}

	public void setDefaultMessage(String defaultMessage) {
		this.defaultMessage = defaultMessage;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private static final long serialVersionUID = 1L;
	private String fieldName;
	private String defaultMessage;

	public FieldErrorMessage(String fieldName, String defaultMessage) {
		this.fieldName = fieldName;
		this.defaultMessage = defaultMessage;
	}



}
