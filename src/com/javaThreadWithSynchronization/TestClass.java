package com.javaThreadWithSynchronization;

public class TestClass 
{

	public static void main(String[] args) 
	{

		ThreadOperations operations = new ThreadOperations();
		
		Example1 example1 = new Example1(operations);

		example1.start();

		Example2 example2 = new Example2(operations);

		example2.start();
		
		Example3 example3 = new Example3(operations);

		example3.start();


	}

}
