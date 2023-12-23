package com.generics;

import java.util.ArrayList;

/*
 * Generic don't work with premitive type
 */
public class GenericsExample {
	
	
	private static <T,V>void shout(T thingToShout,V otherThingToShout) {
		System.out.println(thingToShout+"!!!!!!");
		System.out.println( otherThingToShout+"!!!!");
	}
	
	
	public static void main(String[] args) {
	shout("hero",87);
	
		

		
//		ArrayList<Integer> al = new ArrayList<>();
//		al.add(12);
//		al.add(233);
//		al.add(12);
//		
//		for(int i=0;i<al.size();i++) {
//			System.out.println(al.get(i));
//		}
		
		
//		ArrayList<Cat> cats = new ArrayList<>();
//		cats.add(new Cat("miki"));
//		
//		for(int i=0;i<cats.size();i++) {
//			System.out.println(cats.get(i));
//		}
		
	}
}
