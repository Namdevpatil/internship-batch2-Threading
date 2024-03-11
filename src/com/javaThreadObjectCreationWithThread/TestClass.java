package com.javaThreadObjectCreationWithThread;

public class TestClass 
{

	public static void main(String[] args) 
	{

		Example1 example1 = new Example1();

		example1.start();

		Example2 example2 = new Example2();

		example2.start();
		
		Example3 example3 = new Example3();

		example3.start();


	}

}
