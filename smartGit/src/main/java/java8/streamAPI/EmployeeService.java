package java8.streamAPI;

import java.util.Arrays;
import java.util.List;

public class EmployeeService {

	public static List<Employee> getAllEmployee() {
		return Arrays.asList(new Employee(0, "ABS", "A", 100.12), 
							 new Employee(3, "ABSDF", "B", 10055.12),
							 new Employee(2, "ABDDS", "A", 100.12), 
							 new Employee(1, "ABDDS", "C", 100),
							 new Employee(3, "ABS", "A", 100));
	}

}
