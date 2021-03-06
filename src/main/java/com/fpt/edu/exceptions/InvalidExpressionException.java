package com.fpt.edu.exceptions;

public class InvalidExpressionException extends Exception {
	private long id;
	private String message;

	public InvalidExpressionException(String message) {
		super(message);
	}

	public InvalidExpressionException(long id, String message) {
		this.id = id;
		this.message = message;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}
