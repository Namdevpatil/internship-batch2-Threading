package com.howToSetAndGetJavaThreadObjectsPriority;

public class Example1 extends Thread
{

	public void run()
	{
		for(int i = 1; i <= 5; i++)
		{
			//Returns a reference to the currently executing thread object.
			System.out.println(i+" : "+" Name - "+Thread.currentThread().getName()+", Priority: "+Thread.currentThread().getPriority());
			try
			{
				Thread.sleep(200);
			}
			catch(Exception e)
			{
				
			}
		}
	}
	
}
