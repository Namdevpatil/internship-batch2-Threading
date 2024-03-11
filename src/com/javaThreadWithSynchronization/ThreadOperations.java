package com.javaThreadWithSynchronization;

public class ThreadOperations 
{
	//logic
	public synchronized void getOperation()
	{
		for(int i = 1; i <= 10; i++)
		{
			System.out.println(i+" - "+Thread.currentThread().getName());
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				
			}
		}
		
	}

}
