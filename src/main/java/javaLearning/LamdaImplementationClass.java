package javaLearning;

public class LamdaImplementationClass  implements InterfaceLamda{

	// Just to implement a method we created this class so this can be overcome by creating anonymous inner class.
	@Override
	public void show(int i) {
	System.out.println(i + " overriden show method from implemented class");
		
	}

}
