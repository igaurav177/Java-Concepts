package com.exception.userdefineexception;

// runtime exception or unchecked
public class UnderAgeUncheckedException extends RuntimeException{
	public UnderAgeUncheckedException() {
		super("you are under age");
	}
	UnderAgeUncheckedException(String msg){
	super(msg);
	}
}
