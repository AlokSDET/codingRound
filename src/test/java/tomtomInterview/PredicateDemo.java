package tomtomInterview;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
public class PredicateDemo implements java.util.function.Predicate<Integer> {

	@Override
	public boolean test(Integer t) {
		if (t % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	
	  public static void main(String[] args) { Predicate<Integer> predicate = new
	  PredicateDemo(); boolean check = predicate.test(7);//it always return true or
	  false; System.out.println(check); }
	  
	 */
	
	
	// above code can be replaced by below

public class PredicateDemo  {
	
	public static void main(String[] args) {
		
		Predicate<Integer> predicate = (t)	-> {
			if (t % 2 == 0) {
					return true;
				} else {
					return false;
				}
		}; 
		
		System.out.println(predicate.test(10));
		System.out.println(predicate.test(7));
		
		
		Predicate<Integer> predicate1 = t-> t%2==0;
		System.out.println(predicate1.test(10));
		System.out.println(predicate1.test(7));
		
		/////////////////////////////////////////////
		List<Integer> list = Arrays.asList(1,2,3,4);
		
	//	list.stream().filter(predicate1).forEach(t -> System.out.println("print even " + t));
		list.stream().filter(t-> t%2==0).forEach(t -> System.out.println("print even " + t));//use of predicate in stream API using filter.
		
		
	}
	
	// also above code can be optimized further more.filter and all can be used in predicate.
	
	

}
