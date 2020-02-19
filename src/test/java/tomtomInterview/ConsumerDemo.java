package tomtomInterview;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/*
public class ConsumerDemo implements Consumer<Integer> {

	@Override
	public void accept(Integer t) {

		System.out.println("printing an integer" + t);

	}

	
	public static void main(String args[]) {
	Consumer<Integer> consumer  = new ConsumerDemo();	
	consumer.accept(10);
	}
}*/
// Now above code can be replaced as below.
public class ConsumerDemo {

	public static void main(String[] args) {
		Consumer<Integer> consumer = t -> 
			System.out.println("printing an integer " + t);

		consumer.accept(10);
		
		// for each is having accept method.always accept arguments and does not return anything.
		// Stream api: for each method always accept consumer functional interface.	
		
		List<Integer> list = Arrays.asList(1,2,3,4);
		
		
		list.stream().forEach(consumer);
		
		list.stream().forEach(t -> System.out.println("printing an number " + t));
	}
	

	
	
	
}