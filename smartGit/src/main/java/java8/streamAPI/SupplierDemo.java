package java8.streamAPI;

import java.util.Arrays;
import java.util.List;

/**
 * Supplier Functional Interface used in orElseGet method of findAny
 */
public class SupplierDemo {
	public static void main(String[] args) {
//		Supplier<String> supplier = () -> "String Not Found !!";
//		System.out.println(supplier.get());

		List<String> nums = Arrays.asList("1", "2", "3", "4", "5", "6");
		System.out.println(nums.stream().filter(n -> n == "7").findAny().orElseGet(() -> "String Not Found !!"));
	}

}
