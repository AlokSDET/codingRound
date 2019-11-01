package javaLearning;

public interface InterfaceB {

	
	default void add() {
		System.out.println("interface B");
	}
	
	static void sub() {
		System.out.println("sub static method Interface B");
	}

}
