package com.javaThreadWithSynchronization;

public class Example3 extends Thread
{
	ThreadOperations operations;

	public Example3(ThreadOperations operations) 
	{
		this.operations = operations;
	}
	
	public void run()
	{
		operations.getOperation();
	}
	
	
}
