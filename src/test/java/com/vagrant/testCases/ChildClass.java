package com.vagrant.testCases;

public class ChildClass extends ParentClass {
	
	public ChildClass(int i) {
		System.out.println("Parametrized constructor of child class " + i);
	}
	
	
	public ChildClass() {
		System.out.println("default constructor of child class");
	}


	private void m1() {
		System.out.println("Child class M1 method");
	}

	public void m3() {
		System.out.println("Child class m3 method");
	}
	/*
	 * public static void main(String args[]) {
	 * 
	 * ChildClass cObjCref = new ChildClass();
	 * 
	 * cObjCref.m1();// local method is calling
	 * 
	 * cObjCref.m2();// since m2 is not available in child directly but using
	 * inheritance its // available and calling from parent.
	 * 
	 * cObjCref.m3();// calling overridden method
	 * 
	 * ParentClass cObjPref = new ChildClass(); // cObjPref.m1();// compilation
	 * error since private method can't be overridden
	 * 
	 * cObjPref.m2();
	 * 
	 * cObjPref.m3();
	 * 
	 * ParentClass pObjPref = new ParentClass(); // pObjPref.m1();// compilation
	 * error since method is private so its invisible
	 * 
	 * pObjPref.m2();
	 * 
	 * pObjPref.m3();
	 * 
	 * }
	 */
}
