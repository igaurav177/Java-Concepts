package com.exception.userdefineexception;

public class VotingUnchecked {
	public static void main(String[] args) {
		int age=17;
	try {	
		if(age<18) {
			throw new UnderAgeUncheckedException("you can't vote becoz of under age limit");
		}
		
		else {
			System.out.println("right to vote");
		}
	}catch(UnderAgeUncheckedException e) {
		System.out.println(e.getMessage());
	}
		System.out.println("hello");
	}
}
