package com.exception.customexception;

public class AgeInvalidException extends Exception {
	public AgeInvalidException() {
		super("Age is invalid !");
	}
	AgeInvalidException(String message){
		super(message);
	}
}
