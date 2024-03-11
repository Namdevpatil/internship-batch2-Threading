package com.howToSetAndGetJavaThreadObjectsName;

public class TestClass {

	public static void main(String[] args) {

		Example1 example1 = new Example1();
		example1.setName("Ganesh Kumar-(Thread-0)");
		example1.start();

		Example2 example2 = new Example2();
		example2.setName("Arun Reddy-(Thread-1)");
		example2.start();
		
		Example3 example3 = new Example3();
		example3.setName("Rajesh kumar-(Thread-2)");

		example3.start();


	}

}
