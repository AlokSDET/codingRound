package tomtomInterview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class Java8 {

	public static void main(String[] args) {

		streamLearning();
		
		
	}

	public static void streamLearning() {

		int arr[] = { 1, 2, 3, 4 };

		Map<String, Integer> mp = new HashMap<String, Integer>();
		mp.put("empId", 12345);
		mp.put("sal", 10000);

		Set<Integer> list1 = new HashSet(Arrays.asList(1, 2, 3, 4));

		Set<Integer> sqr = list1.stream().map(i -> i * i).collect(Collectors.toSet());
		System.out.println(sqr);

		Map<Integer, Integer> mpSqr = list1.stream().collect(Collectors.toMap(i -> i, i-> i*i));
		
		mpSqr.forEach((i, j) -> System.out.println(j));
		
		System.out.println(mpSqr);
		Set<Entry<Integer, Integer>> e =  mpSqr.entrySet();
		
			
		List<Entry<Integer, Integer>> mapList = e.stream().filter(i -> i.getKey()>3).collect(Collectors.toList());
		
		System.out.println(mapList);
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4);

		list.stream().filter(i -> i % 2 == 0).forEach(System.out::println);

		List<Integer> even = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(even);
		
		// Java8 from came scala language.
		
		////////////////////////////  functional interface ///////////////////////////////////
		
		ABC obj = () ->  System.out.println("Learning java 8");
		
	
		obj.show();
		String firstName = "Alok";
		String lastName = "Shrivastava";
		
		System.out.printf("First Name: %s\nLast Name: %s",firstName, lastName);
		
		Map<Integer, String> mp1 = new HashMap<Integer, String>();
		
		mp1.put(1, "Mysore");
		mp1.put(2, "Bangalore");
		mp1.put(3, "Pune");
		mp1.put(4, "Gwalior");
		mp1.put(5, "Indore");
		mp1.entrySet().stream().forEach(obj1 -> System.out.println(obj1));

		mp1.entrySet().stream().filter(k->k.getKey()%2==0).forEach(i->System.out.println(i));
		
		

	//	System.out.printf(format, firstName, lastName);
	// Functional Interface will have only one abstract method.it can have many default method.
		// Method overriding is possible in functional interface.
		// if same default method are in both interface then will get diamond problem.will have to override only in child class .
		// but what if we need to call interface method. then can use 
		// InterfaceName.super.methodname();
		
	}



	/*1. Consumer interface : it is functional interface, it has only one abstract method that is accept. 
	 * its return type is void and accept only one parameter.It has one default method.
	 * 
	 * 2. predicate functional interface: it has 'test' abstract method. Its return type is boolean.
	 * it takes one method argument. it will be used in conditions statement.
	 * 
	 * 3. Supplier functional interface : there is no input and output is expected.
	 * 
	 * T get(); : it does not accept any parameter and return as class type of generic.
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
}


