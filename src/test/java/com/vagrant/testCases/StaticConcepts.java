package com.vagrant.testCases;

public class StaticConcepts {
	
	
	/* 
	  first variables will be declared and initialized value with 0; then it will assign given value like 10, 20, 
	  then static block. then static main method. static variables and static block will be loaded sequencely .
	*/
	 
	public static int i =10;

	
	static {
		
		System.out.println(i);
		
		m1();
	}

	public static void main(String[] args) {
	
		System.out.println(j);
		m1();
	}
	
	public static void m1() {
		System.out.println("I am m1");
		System.out.println(j);
	}

	public static int j =20;
	
}




