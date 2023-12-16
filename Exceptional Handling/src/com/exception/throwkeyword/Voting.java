package com.exception.throwkeyword;

import java.util.Scanner;

public class Voting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		//if we are not using throws then we need to create try and catch block for handling
		/*
		 * throw keyword is used for user defined exception but we can use predefine exception
		 * but we mainly used throw keyword for user define exception
		 */
		try {
		if(age<18) {
			throw new YongerAgeException("you are not eligible to vote");
			// no code will run after throw 
//			System.out.println("after throw we can't print next line");
			
		}else {
			System.out.println("right to vote");
		}
		}catch(YongerAgeException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("hello");
		
	}
}
