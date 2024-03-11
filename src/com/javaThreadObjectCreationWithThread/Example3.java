package com.javaThreadObjectCreationWithThread;

public class Example3 extends Thread
{
	
	//overrides java.lang.Thread.run()
	public void run()
	{
		for(int i = 1; i <= 100; i++)
		{
			System.out.println(i+" - "+Thread.currentThread().getName());
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
