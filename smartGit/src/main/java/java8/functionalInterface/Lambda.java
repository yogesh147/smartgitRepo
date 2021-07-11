package java8.functionalInterface;

/**
 * syntax is () -> { } Use lambda's expression by calling anonymous function
 * (without name, return type and prefix), helps in reducing code length (no
 * need to write boilerPlate code or repeative syntax) so, lambda expression
 * convert functional interface's abstract method to anonymous method
 */

public class Lambda {
	public static void main(String[] args) {

//		Calculator cal = ()-> System.out.println("Switch ON ");
//		cal.switchOn();
		Calculator cal = (a, b) -> {
			if (b < a)
				throw new RuntimeException("b must be grater than a");
			return b - a;
		};
		cal.getSum(10, 20);
		System.out.println(cal.diff(1, 5));
	}
}