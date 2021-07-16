package java8.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Optional Class uses to handle null pointer exception public final class
 * Optional<T> extends Object We have three way to create optional object i.e.
 * empty(), of(T value), ofNullable(T value) return Optional<T value> obj.
 * 
 */
public class OptionalDemo {

	public static void main(String[] args) {

		User user = new User(0, "A", "10", "1", null, Arrays.asList("121211", "weqeqw"));

		Optional<Object> empty = Optional.empty();
//		System.out.println(empty);

//		Optional<String> of = Optional.of(user.getEmail());
//		System.out.println(of);

		Optional<String> emptyOf = Optional.ofNullable(user.getEmail());
//		if(emptyOf.isPresent()) {
//			System.out.println(emptyOf.get());
//		}

//		System.out.println(emptyOf.orElse("default@g.com"));

//		System.out.println(emptyOf.orElseThrow(() -> new IllegalArgumentException("email not found !!!")));
//		System.out.println(emptyOf.map(String::toUpperCase).orElseGet(() -> "default email ..."));
		System.out.println(getUserByEmail("ram@g.com"));
	}

	// Now we use Optional With Stream API

	public static User getUserByEmail(String email) {
		return UserService.getStreamUsers()
				.stream()
				.filter(u -> u.getEmail().equals(email))
				.findAny()
				.orElseThrow(() -> new IllegalArgumentException("email not found !!"));
	}

}
