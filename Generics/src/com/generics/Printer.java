package com.generics;
//use extends for interface also for bounded generic
public class Printer<T extends Animal,V> { // this is bounded generic
	T thingToPrint;
	V otherThing;
	public Printer(T thingToPrint) {
		this.thingToPrint=thingToPrint;
	}
	public void print() {
		thingToPrint.eat();
		System.out.println(thingToPrint);
	}
}
