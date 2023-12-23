package com.oops.interfaces;
/** Interface : points to Remember
 *  Any Service Requirement specification
 *  Any contract b/w client and service provider is interface
 *  Every method of interface is abstract 
 *  100% pure abstract class but after 8 version it not follow 
 * 	we use implements to give implementation of interface class 
 *  
 *  
 * 
 */
public class Main {
	public static void main(String[] args) {
		Test t = new Test();
		t.display();
		t.show();
		Test.run();
		
		I1 i = new Test();
		i.show();
		i.display();
				
		I2 i2 = new Test();
		i2.show1();
		
		
		
		// I1.run();
		
		
		
	}
}
