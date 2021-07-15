package java8.streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UserService {

	static List<User> getUsers() {
		List<User> user = new ArrayList<>();

		user.add(new User(1, "RAM", "Ram1", "10", "ram@g.com", Arrays.asList("9876543210", "1234567895")));
		user.add(new User(2, "LAL", "LAL1", "11", "lal@g.com", Arrays.asList("9876543220", "1234567896")));
		user.add(new User(5, "PAL", "PAL1", "15", "pal@g.com", Arrays.asList("9876543230", "1234567897")));
		user.add(new User(6, "HAL", "HAL1", "12", "hal@g.com", Arrays.asList("9876543240", "1234567898")));

		return user;
	}

	static List<User> getStreamUsers() {

		return Stream
				.of(new User(1, "RAM", "Ram1", "10", "ram@g.com", Arrays.asList("9876543210", "1234567895")),
						new User(2, "LAL", "LAL1", "11", "lal@g.com", Arrays.asList("9876543220", "1234567896")),
						new User(5, "PAL", "PAL1", "15", "pal@g.com", Arrays.asList("9876543230", "1234567897")),
						new User(6, "HAL", "HAL1", "12", "hal@g.com", Arrays.asList("9876543240", "1234567898")))
				.collect(Collectors.toList());
	}

}
