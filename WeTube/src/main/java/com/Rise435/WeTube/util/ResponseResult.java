package com.Rise435.WeTube.util;

import java.io.Serializable;

public class ResponseResult<T> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer state;//SUCCESS==200
	
	private String message;
	
	private T data;

	public ResponseResult(Integer state, String message, T data) {
		super();
		this.state = state;
		this.message = message;
		this.data = data;
	}
	public ResponseResult() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ResponseResult(Integer state) {
		super();
		this.state = state;
	}
	public ResponseResult(Integer state, T data) {
		super();
		this.state = state;
		this.data = data;
	}
	
	
	//setter and getter
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	
	
	
	
	
	
}
