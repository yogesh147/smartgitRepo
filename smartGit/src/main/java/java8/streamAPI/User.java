package java8.streamAPI;

import java.util.ArrayList;
import java.util.List;

public class User {

	private int id;
	private String name;
	private String age;
	private String rollNo;
	private String email;
	private List<String> phoneNos = new ArrayList<>();

	User() {
		super();
	}

	public User(int id, String name, String age, String rollNo, String email, List<String> phoneNos) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.rollNo = rollNo;
		this.email = email;
		this.phoneNos = phoneNos;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", rollNo=" + rollNo + ", email=" + email
				+ ", phoneNos=" + phoneNos + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getPhoneNos() {
		return phoneNos;
	}

	public void setPhoneNos(List<String> phoneNos) {
		this.phoneNos = phoneNos;
	}
	
}
