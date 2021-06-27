// Static and inner and method local inner and annonymous class

// 1) static nested class eg 

class Outer {
	static class Inner {
		public void main(String[] args) {
			System.out.println("outer.inner class called by static nested class eg :- ");
		}
	}
}

//2) inner class eg 

class Outer1 {
	class Inner {
		void print(String type) { // inner method
			System.out.println("outer.inner class called by ' " + type + " ' nested class eg :- ");
		}
	}

	void callInner(String type) { // inner method call by outside
		Inner inner = new Inner();
		inner.print(type);
	}
}

// 3) method local inner calss eg

class Outer2 {

	void callInner(String type) {

		class Inner {
			void print(String type) { // inner method
				System.out.println("outer.inner class called by ' " + type + " ' nested class eg :- ");
			}
		}

		Inner inner = new Inner();
		inner.print(type);
	}
}
//3) anonymous inner class eg

// An inner class declared without a class name is known as an anonymous inner class. 
// In case of anonymous inner classes, we declare and instantiate them at the same time. Generally, 
// they are used whenever you need to override the method of a class or an interface. 

//In the same way, you can override the methods of the concrete class as well as the interface using an anonymous inner class.

abstract class Anonymous {
	public abstract void callAnony();
}

//4) Anonymous Inner Class as Argument
//Generally, if a method accepts an object of an interface, an abstract class, or a concrete class, then we can implement the interface, extend the abstract class, and pass the object to the method. If it is a class, then we can directly pass it to the method.
//
//But in all the three cases, you can pass an anonymous inner class to the method

interface Message {
	String greet();
}

class AnonymousInnerClassByArgument {
	public void displayMessage(Message m) {
		System.out.println(m.greet() + ", This is an example of anonymous inner class as an argument");
	}
}

//driver method
public class NestedEg {

	public static void main(String[] args) {
		System.out.println("Main Class Called NestedEg :- ");
		new Outer.Inner().main(null); // 1) static nested class eg
		new Outer1().new Inner().print("inner without method"); // 2) inner nested class eg
		new Outer1().callInner("inner with method"); // 3) inner nested class eg
		new Outer2().callInner("method local inner"); // 4) method local inner nested class eg
		new Anonymous() {
			public void callAnony() {
				System.out.println("Anonymous class called by In nested class eg :- ");
			}
		}.callAnony(); // 4) anonymous inner nested class eg

		new AnonymousInnerClassByArgument().displayMessage(new Message() {
			public String greet() {
				return "Hello";
			}
		}); // 4.2 ) anonymous inner class By Argument inner nested class eg

	}

}
