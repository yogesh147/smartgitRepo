package java8.streamAPI;

import java.util.Arrays;
import java.util.List;

/**
 * Predicate Functional Interface used in filter
 */

public class PredicateDemo {

	public static void main(String[] args) {

		/*
		 * Predicate<Integer> predicate = i -> i % 2 == 0;
		 * System.out.println(predicate.test(5));
		 */
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6);
		nums.stream().filter(i -> i %2 ==0).forEach( n -> System.out.println("Even no is "+ n));
 
	}
}
