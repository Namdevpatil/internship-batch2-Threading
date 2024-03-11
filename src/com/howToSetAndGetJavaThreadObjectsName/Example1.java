package com.howToSetAndGetJavaThreadObjectsName;

public class Example1 extends Thread
{

	public void run()
	{
		for(int i = 1; i <= 5; i++)
		{
			//Returns a reference to the currently executing thread object.
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
