package com.exception.customexception;

public class Main {

	public static void main(String[] args) throws AgeInvalidException {
		System.out.println("Strated...");//starting...
		try {
			int n1=10;
			int n2=2;
			System.out.println("we have got two numbers...");
			int result = n1/n2;
			System.out.println("Division is "+result);
			
			if(n2<10) {
				throw new AgeInvalidException("My age is invalid");
			}
			
		}catch(ArithmeticException e) {
			System.out.println("n2 can not be 0!!");
			System.out.println(e.getMessage());
		}catch(NumberFormatException e) {
			System.out.println("Invalid Numbers!!");
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally{
			//always get executed
			System.out.println("i am in finally block");
			System.out.println("closing all the resources");
			
		}
		System.out.println("terminated..");



	}

}
