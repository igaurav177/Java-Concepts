package com.generics;

public class Cat extends Animal{
	private String litterPreference;
	public String name;
	public int age;
	
	public Cat(String name) {
		this.name=name;
		
	}
	public String getLitterPreference() {
		return litterPreference;
	}
	
	public void setLitterPreference(String litterPreference) {
		try {
			this.litterPreference=litterPreference;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
