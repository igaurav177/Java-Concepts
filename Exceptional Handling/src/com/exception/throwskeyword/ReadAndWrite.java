package com.exception.throwskeyword;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ReadAndWrite {
	/*
	 * throws keyword never handle the exception 
	 * it only gives you the which exception is going to occur
	 * 
	 * throws keyword is used to declare only for the checked exception
	 * throws keyword is always used for compile time and checked exception
	 * 
	 */
	void readFile() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("d:/abc.txt");
		//statement
	}
	void saveFile() throws FileNotFoundException {
		String text = "this is demo txt";
		FileOutputStream fos = new FileOutputStream("d:/xyz.txt");
		//statement
	}
}
