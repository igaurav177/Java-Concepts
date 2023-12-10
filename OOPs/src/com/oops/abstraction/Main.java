package com.oops.abstraction;

public class Main {
	public static void main(String args[]) {
		Car car = new Car();
		car.start();
		
		
		Vehicle v = new Car();
		v.start();
		
		Scooter s = new Scooter();
		s.start();
		
		Vehicle scooter = new Scooter();
		scooter.start();
		
		
		Vehicle v1= new Scooter();
		v1.show();
		
	}

}
