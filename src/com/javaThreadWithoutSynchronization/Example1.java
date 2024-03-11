package com.javaThreadWithoutSynchronization;

public class Example1 extends Thread
{
	ThreadOperations operations;//field

	public Example1(ThreadOperations operations) 
	{
		this.operations = operations;
	}
	
	public void run()
	{
		operations.getOperation();
	}
	
}
