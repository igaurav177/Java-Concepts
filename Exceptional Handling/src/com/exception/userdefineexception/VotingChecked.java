package com.exception.userdefineexception;

public class VotingChecked {
	public static void main(String[] args) throws UnderAgeCheckedException {
		int age=17;
		// checked exception handle by try catch or throws keyword
		if(age<18) {
			throw new UnderAgeCheckedException("you can't vote becoz of under age limit");
		}
		
		else {
			System.out.println("right to vote");
		}
		
		
	}

}
