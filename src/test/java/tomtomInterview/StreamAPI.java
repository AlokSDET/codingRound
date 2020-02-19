package tomtomInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPI {
	/*
	 * Stream is not colection/data structure, its API, sequence of objects. we can
	 * convert collection/arrays to stream.
	 * 
	 * we can achieve functional programming using functional interface. code
	 * reduced by lamda expression, we can do method chaining.
	 * 
	 * if we have to process huge data then we can use stream.Bulk operation
	 * 
	 * filter and for each. // stream sources can be created from collections, list
	 * ,set, numbers, longs,
	 * 
	 * intermediate operations: filter, map, sort, : it can be zero or more.
	 * anyMatch, distinct, filter, findFirst,flatMap, map, skip, sorted
	 * 
	 * terminal operations: for each, reduce, collect,. one terminal operational is
	 * allowed. it collects the elements in collection. count , min , max, reduce,
	 * summaryStatistics
	 * 
	 * 
	 * for very large data set we can use parallel stream to enable multiple
	 * threads.
	 * 
	 * 
	 */

	public static void main(String[] args) {

		List<String> names = new ArrayList<String>();

		names.add("Rushikesh");
		names.add("Tushar");
		names.add("Manu");
		names.add("Monika");
		names.add("Sudarshan");

		for (String name : names) {
			System.out.println(name);
		}

		Consumer<String> consumer = (t) -> System.out.println("printing names " + t);
		names.forEach(consumer);

		names.forEach(t -> System.out.println(t));

		Map<Integer, String> mp = new HashMap<Integer, String>();

		mp.put(1, "Mysore");
		mp.put(2, "Bangalore");
		mp.put(3, "Pune");
		mp.put(4, "Gwalior");
		mp.put(5, "Indore");

		mp.forEach((k, v) -> System.out.println("key is " + k + " and value is " + v));
		mp.entrySet().stream().forEach(obj -> System.out.println(obj));

		Consumer<String> consumer1 = t -> System.out.println(t);

		consumer1.accept("Java Hero");

		for (Map.Entry<Integer, String> nameEntry : mp.entrySet()) {
			consumer1.accept(nameEntry.getValue());
		}

		System.out.println(names.stream().filter(t -> t.startsWith("M")).collect(Collectors.toList()));
		names.stream().filter(t -> t.startsWith("M")).forEach(t -> System.out.println(t));

		// 1. 10 is non inclusive
		IntStream.range(1, 10).forEach(System.out::print);
		System.out.println();

		// 2. n no of leading elements to skip
		IntStream.range(1, 10).skip(5).forEach(x -> System.out.println(x));

		// 3. sum
		System.out.println(IntStream.range(1, 10).sum());

		// 4.
		Stream.of("Monu", "Chitransh", "Ankita", "Tuklu", "Gitli").sorted().findFirst().ifPresent(System.out::println);

		// 5. Stream use Using Array: same as stream.of
		String[] cityNames = { "Pune", "Gaheli", "Mihona", "Gwalior", "Indore", "Varganva", "Mysore", "Bangalore" , "Pahadi"};
		Arrays.stream(cityNames).filter(x-> x.startsWith("P")).sorted().forEach(System.out::println);
		//6. avg of sqr in array 
		Arrays.stream(new int[] {1,2,3,4,5,6}).map(x -> x*x).average().ifPresent(System.out::println);
		// 7. 
		List<String> peopleNames = Arrays.asList("Alok", "Nilesh", "Tushar", "Manasi", "Sushma","Sneha");
		
		peopleNames.stream().map(String::toLowerCase).filter(x->x.startsWith("s")).forEach(x->System.out.println(x));
		
		Arrays.stream(new int[] {1,2,3,4,5,6}).map(x -> x+x).forEach(x-> System.out.println(x));
		
		String[] capitalNames = { "Pune", "Gaheli", "Mihona", "Gwalior", "Indore", "Varganva", "Mysore", "Bangalore" , "Pahadi"};
		Map<String, String> map = Arrays.stream(capitalNames).filter(k->k.startsWith("P")).collect(Collectors.toMap(k-> k, v-> v+"City"));
		System.out.println(map);
		
		// converting an object one type to another then mapper can be used.
		names.stream().map(MapperExample.user:: new).forEach(k-> System.out.println(k.toString()));
		names.stream().map(name -> new MapperExample.user(name)).forEach(k-> System.out.println(k.toString()));
		
		names.stream().map(MapperExample.user:: new).collect(Collectors.toList()).forEach(i -> System.out.println(i));
		
	}

}
