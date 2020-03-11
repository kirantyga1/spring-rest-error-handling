package com.mkyong.exception;

public class BookNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2939141488729399476L;

	public BookNotFoundException(Long id) {
		super("Book id not found : " + id);
	}

}