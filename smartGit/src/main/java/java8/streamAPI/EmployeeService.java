package java8.streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class EmployeeService {

	public static List<Employee> getAllEmployee() {
		return Arrays.asList(new Employee(0, "ABS", "A", 100.12), new Employee(3, "ABSDF", "B", 10055.12),
				new Employee(2, "ABDDS", "A", 100.12), new Employee(1, "ABDDS", "C", 100),
				new Employee(3, "ABS", "A", 100));
	}

	public static List<Employee> get1000Employees() {
		List<Employee> emps = new ArrayList<>();
		for (int i = 0; i < 1000; i++) {
			emps.add(new Employee(i, "Emp" + i, "A" + i, Double.valueOf(new Random().nextInt(1000 * 100))));
		}
		return emps;
	}

}
