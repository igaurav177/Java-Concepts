package com.exception.throwskeyword;

import java.io.FileNotFoundException;

public class Main {
	public static void main(String[] args) {
		ReadAndWrite rw = new ReadAndWrite();
		try {
		rw.readFile();
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("hello");
	}
}
