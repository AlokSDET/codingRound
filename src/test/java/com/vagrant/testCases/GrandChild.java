package com.vagrant.testCases;

import java.util.ArrayList;
import java.util.List;

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
		
		ParentClass p = new ChildClass();
	
		ChildClass [] carray = new ChildClass[10];

		// casting child class array to parent class array 
		ParentClass [] parray = carray;
		
		parray[0] = new ChildClass();
		// casting from parent class list to child class list
		//List<ChildClass> pl = (ArrayList<ChildClass>) ((ArrayList<?>)ParentClass);
		
		System.out.println(varArgsConcept(10,20));

		System.out.println(varArgsConcept(10,20, 40));
		
		System.out.println(varArgsConcept(10,20, 50,60));
		
		System.out.println(varArgsConcept1(new int[]{1, 3, 4}));
		
		//Each method can only have one varargs parameter
		//The varargs argument must be the last parameter
		
	}
	
	
	public static int varArgsConcept(int ...a) {
		
		int sum = 0;
		for(int var : a ) {
			sum = sum + var;
		}
		return sum;
	}
	
	public static int varArgsConcept1(int a []) {
		
		int sum = 0;
		for(int var : a ) {
			sum = sum + var;
		}
		return sum;
	}

}
