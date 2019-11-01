package javaLearning;

public class Java8 {

	

	public static void main(String[] args) {
		
	
		ClassC obj = new ClassC() ;
		
		obj.add();
		
		InterfaceA.sub();
		
		InterfaceB.sub();
		// can not call sub method from ClassC class if we dont write in ClassC even if SUB method is available in interface and class is implementing interface.
		// if we dont write override annotation then sub method would belong to the class only.
		obj.sub();
		
	}

	
	/* 1.2 - JAVA COLLECTION 
	 -FUNCTIONAL PROGRAMMING - C# ,SCALA SUPPORTS , Now Java Supports
	 -1.8 - Stream API, Lamda expression, define methods in interface , 
	 -imperative(what and how to do)  and declarative programming (what to do )
	 -to share the variable in multi threaded programming we can use stream API. It helps to achieve functional programming and 
	  concurrency programming.
	 */
	
	
	/* Interface: Methods are by default public and abstract- till 1.7
	 -1.8 : if interface is having defined methods then it should be default.
	 -if class is implementing only one interface then no need to define /override default method in class but user can override if he needs but if class is implementing two interface
	 -to use multiple inheritance and default methods are same in both interface then its mandatory to define default methods in class to overcome diamond problem.
	 -default method is having lower priority than normal method, class method is having higher priority than interface method.
	  -can not override the object class methods in interface
	*/
	
	/* Static methods in Interface :
	-
	-
	-no need to create the instance of interface , directly with the name of interface can call static methods 
	-
	 */

	
	
	
	
}
