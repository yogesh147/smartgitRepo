package java8.streamAPI;

import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreamDemo {

	public static void main(String[] args) {
		long start, end = 0;
//		start = System.currentTimeMillis();
//		IntStream.range(0, 100).forEach(System.out::print);
//		end = System.currentTimeMillis();
//		System.out.println();
//		System.out.println("Plain stream took time " + (end - start) + " ms");
//
//		// parallel stream
//
//		long start1, end1 = 0;
//		start1 = System.currentTimeMillis();
//		IntStream.range(0, 100).parallel().forEach(System.out::print);
//		end1 = System.currentTimeMillis();
//		System.out.println();
//		System.out.println("Parallel stream took time " + (end1 - start1) + " ms");
//
//		// core behavior
//
//		IntStream.range(0, 10).forEach(i -> {
//			System.out.println("Thread : " + Thread.currentThread().getName() + " : " + i);
//		});
//
//		IntStream.range(0, 10).parallel().forEach(i -> {
//			System.out.println("Thread : " + Thread.currentThread().getName() + " : " + i);
//		});

		// use Employee class

		List<Employee> emps = EmployeeService.get1000Employees();
		start = System.currentTimeMillis();
		double avg = emps.stream().map(Employee::getSalary).mapToDouble(i -> i).average().getAsDouble();
		end = System.currentTimeMillis();
		System.out.println();
		System.out.println("Plain stream took time " + (end - start) + " ms and avg is " + avg);

		List<Employee> emps1 = EmployeeService.get1000Employees();
		start = System.currentTimeMillis();
		double avg1 = emps1.parallelStream().map(Employee::getSalary).mapToDouble(i -> i).average().getAsDouble();
		end = System.currentTimeMillis();
		System.out.println();
		System.out.println("Parallel stream took time " + (end - start) + " ms and avg is " + avg1);

	}
}
