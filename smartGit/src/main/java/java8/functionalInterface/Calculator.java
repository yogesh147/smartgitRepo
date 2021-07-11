package java8.functionalInterface;

/**
 * @FunctionalInterface
 * @author yogesh
 * This is functional Interface contain only one abstract method
 * but contain multiple default and static method
 * E.g. :-   Runnable -----> run()
 * 			Callable ------> call()
 * 			Comparable ----> campareTo()	
 * 			Comparator ----> campare()
 */

public interface Calculator {
//	void switchOn(); // abstract method
	int diff(int a, int b);
	default void getSum(int a, int b) {
		System.out.println("Sum is : "+( a + b));
	}

	default void getDifference(int a, int b) {
		System.out.println("Difference is : ");
	}

	static void getProduct(int a, int b) {
		System.out.println("Product is : ");
	}

}
