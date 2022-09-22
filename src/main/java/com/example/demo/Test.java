package com.example.demo;

import java.io.FileInputStream;
import java.io.InputStream;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test=new Test();
		test.method();

	}
	
	public void method() {
		byte[] array = new byte[100];

	    try {
	      InputStream input = new FileInputStream("C:\\Users\\Admin\\Desktop\\Test.txt");

	      System.out.println("Available bytes in the file: " + input.available());

	      // Read byte from the input stream
	      input.read(array);
	      System.out.println("Data read from the file: ");

	      // Convert byte array into string
	      String data = new String(array);
	     // System.out.println(data);

	      // Close the input stream
	      System.out.println("hello"+input.read());
	      input.close();
	    } catch (Exception e) {
	      e.getStackTrace();
	    }
	}

}
