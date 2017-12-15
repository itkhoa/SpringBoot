package com.cmc.dashboard.util;

public class ResultUtil<T> {
	private T obj;
	private String message;

	public ResultUtil(T obj, String message) {
		super();
		this.obj = obj;
		this.message = message;
	}

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
