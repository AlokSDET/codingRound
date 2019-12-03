package com.vagrant.testCases;

public class GrandChild extends ChildClass{

	
	public GrandChild(String s) {
		super(10);
	// Either call parameterized constructor of parent class if only parameterized constructor is defined in parent class.
		//or define default constructor for parent class explicitly.
		
		// There should be linking in constructor in all parent to child classes.when child class constructor is called then automatically parent class 
		// default constructor will be called. if parent class default constructor is not defined and only parameterized constructor is defined then 
		// parameterized constructor of parent class should be called explicitly.
		// if none (default or parameterized constructor) is defined then no issues.
		
		System.out.println("Parametrized constructor of Grand child class " + s);
	}
	public static void main(String[] args) {
		
		GrandChild obj1 = new GrandChild("Alok");
		

	}

}
