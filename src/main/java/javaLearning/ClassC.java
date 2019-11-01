package javaLearning;

public class ClassC implements InterfaceA, InterfaceB{
	
	@Override
	public void add () {
		System.out.println("Class C");
		InterfaceB.super.add();
	}
	
	public void sub() {
		System.out.println("Class C sub method");
	}
	
	
	// can not override static method 
	/*
	 * @Override public void sub() { System.out.println("Class C sub method"); }
	 */
	
	
	
	
}
