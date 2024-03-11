package com.javaThreadObjectCreationWithRunnable;

public class TestClass {

	public static void main(String[] args) {

		Example1 example1 = new Example1();
		Thread thread1 = new Thread(example1);
		
		thread1.start();

		Example2 example2 = new Example2();
		Thread thread2 = new Thread(example2);
		
		thread2.start();
		
		Example3 example3 = new Example3();
		Thread thread3 = new Thread(example3);
		
		thread3.start();


	}

}
