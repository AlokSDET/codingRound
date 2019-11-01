package javaLearning;

public interface InterfaceA {

	
	default void add() {
		System.out.println("interface A");
	}
	
	static void sub() {
		System.out.println("sub static method Interface A");
	}
}
