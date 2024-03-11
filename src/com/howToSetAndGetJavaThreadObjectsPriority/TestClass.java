package com.howToSetAndGetJavaThreadObjectsPriority;

public class TestClass {

	public static void main(String[] args) 
	{

		//5 - 5
		Example1 example1 = new Example1();
		example1.setPriority(Thread.MIN_PRIORITY);//1
		
		example1.start();

		//8 - 5 = 3 //3 
		Example2 example2 = new Example2();
		example2.setPriority(Thread.NORM_PRIORITY);//5
		example2.start();
		
		//12 - 5 = 7// 7-3 = 4
		Example3 example3 = new Example3();
		example3.setPriority(Thread.MAX_PRIORITY);//10
		
		example3.start();


	}

}
