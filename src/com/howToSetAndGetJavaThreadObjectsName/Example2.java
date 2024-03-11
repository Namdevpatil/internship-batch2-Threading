package com.howToSetAndGetJavaThreadObjectsName;

public class Example2 extends Thread
{
	
	//overrides java.lang.Thread.run()
	public void run()
	{
		for(int i = 1; i <= 5; i++)
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
