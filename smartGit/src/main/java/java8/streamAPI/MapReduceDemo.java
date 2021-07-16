package java8.streamAPI;

import java.util.List;
import java.util.stream.Collectors;

public class MapReduceDemo {

	public static void main(String[] args) {
		// iterative approach

		List<Integer> marks = UserService.getStreamMarks().collect(Collectors.toList());
		int sum = 0;
		for (Integer m : marks) {
			sum = sum + m;
		}
		System.out.println("Iterative Approach " + sum);

		// functional approach

		// using map
		System.out.println("Functional Approach By map " + UserService.getStreamMarks().mapToInt(i -> i).sum());

		// using reduce
		System.out.println("Functional Approach By Reduce " + UserService.getStreamMarks().reduce(0, (a, b) -> a + b));

		// using method reference
		System.out.println("FA By Method Reference " + UserService.getStreamMarks().reduce(Integer::sum).get());

		// multiply
		System.out.println("FA By Multiply " + UserService.getStreamMarks().reduce((a, b) -> a * b).get());

		// max element
		System.out.println("FA By Max Element " + UserService.getStreamMarks().reduce(0, (a, b) -> a > b ? a : b));

		// max element using method reference
		System.out.println("FA By Method Reference " + UserService.getStreamMarks().reduce(Integer::max).get());

		// get longest string
		System.out.println("get longest string "
				+ UserService.getNames().reduce((w1, w2) -> w1.length() > w2.length() ? w1 : w2).get());
		
		// get AVG Salary of grade A Emp by filter, map, reduce
		System.out.println("get AVG Salary  --> " + EmployeeService
					.getAllEmployee()
					.stream()
					.filter(f -> f.getGrade().equalsIgnoreCase("c"))
					.map(m -> m.getSalary())
					.mapToDouble(i -> i)
					.average().getAsDouble());
		
		// get Sum Salary of grade A Emp by filter, map, reduce
				System.out.println("get Sum Salary  --> " + EmployeeService
							.getAllEmployee()
							.stream()
							.filter(f -> f.getGrade().equalsIgnoreCase("a"))
							.map(m -> m.getSalary())
							.mapToDouble(i -> i)
							.sum());
		
	}

}
