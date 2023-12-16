package com.exception.userdefineexception;
// for making checked exception we extends Exception class
public class UnderAgeCheckedException extends Exception {  
	public UnderAgeCheckedException() {
		super("You are under age");
	}
	public UnderAgeCheckedException(String msg) {
		super(msg);
	}

}
