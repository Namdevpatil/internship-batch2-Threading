package com.howToSetAndGetJavaThreadObjectsPriority;

public class Example3 extends Thread
{
	
	//overrides java.lang.Thread.run()
	public void run()
	{
		for(int i = 1; i <= 5; i++)
		{
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
