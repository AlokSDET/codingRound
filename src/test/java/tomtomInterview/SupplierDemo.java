package tomtomInterview;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
/*
public class SupplierDemo implements Supplier<String> {

	@Override
	public String get() {
		return "Hi Alok";
	}

	public static void main(String[] args) {
		Supplier<String> supplier = new SupplierDemo();
		System.out.println(supplier.get());
	}
}
*/

// above code can be replaced as below :

public class SupplierDemo {

	public static void main(String[] args) {

		Supplier<String> supplierDemo = () -> {
			return "Hi Alok";
		};
		System.out.println(supplierDemo.get());

		// coode can be optimized further more.
		Supplier<String> supplierDemo1 = () -> "Hi Chitransh";
		System.out.println(supplierDemo1.get());
		
		List<String> list = Arrays.asList( "PHP","Java");
		
		System.out.println(list.stream().findFirst().orElseGet(supplierDemo1));//chitransh if list is empty
	}
	
	

}