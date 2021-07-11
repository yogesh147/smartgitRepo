package java8.streamAPI;

import java.util.Arrays;
import java.util.List;

/**
 * Consumer Functional Interface use in For Each loop
 */
public class ConsumerDemo {

	public static void main(String[] args) {
//		Consumer<Integer> consumer = i -> System.out.println(i);
//		consumer.accept(10);
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6);
		nums.stream().forEach(i -> System.out.println(i));
		
	}

}
