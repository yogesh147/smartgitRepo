package java8.streamAPI;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {

	public static void main(String[] args) {

//		System.out.println(UserService.getUsers());
//		System.out.println("====================================");
//		System.out.println(UserService.getStreamUsers());

		List<User> users = UserService.getStreamUsers();

		List<String> mails = users.stream().map(u -> u.getEmail()).collect(Collectors.toList());
		List<List<String>> phones = users.stream().map(u -> u.getPhoneNos()).collect(Collectors.toList());
		System.out.println("phones :- " + phones);
		System.out.println("====================================");
		// so use flat map to get phone no in single list -> bu sing (list.getPropoerty).stream method
		List<String> flatPhones = users.stream().flatMap(u -> u.getPhoneNos().stream()).collect(Collectors.toList());
		System.out.println("flatPhones :- " + flatPhones);
		System.out.println("====================================");
		
	}

}
