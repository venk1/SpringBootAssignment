package com.curd.assignment.entity;

public class UserResponse {

	private Integer userId;
	private String resMsg;
	private String valErrors;

	public String getResMsg() {
		return resMsg;
	}
	public void setResMsg(String resMsg) {
		this.resMsg = resMsg;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getValErrors() {
		return valErrors;
	}
	public void setValErrors(String valErrors) {
		this.valErrors = valErrors;
	}
}
