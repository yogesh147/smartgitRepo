/*              Info
  extends keyword, the subclasses will be able to inherit all the 
  properties of the superclass except for the private properties of
  the superclass.
  
  With the use of the extends keyword, the subclasses will be able 
  to inherit all the properties of the superclass except for the 4
  private properties of the superclass.

  IS-A Relationship
  IS-A is a way of saying: This object is a type of that object.

  */

/* Single Inheritance */

/* class Main {
	int a = 1;
	int b = 2;

	void getSuperData(int a) {
		System.out.println("Main a " + a + " b " + b);
	}

	void getSuperData() {
		System.out.println(a);
	}

	Main(int x) {
		this.a = x;
		System.out.println(a);
	}
}

public class Inheritance extends Main {
	int a = 3;

	void getSuperData() {
		System.out.println(a);
	}

	Inheritance() {
		super(50);
		super.getSuperData(super.a);
		super.getSuperData(this.a);
		super.getSuperData();
	}

	public static void main(String[] args) {
		Inheritance i = new Inheritance();
		System.out.println("i IS-A Main");
		System.out.println(i instanceof Main);
	}

}  */

/* Multilevel Inheritance */

/*class A {
	int a = 100;
}

class B extends A {
	int b = 200;
}

class Inheritance extends B {
	int c = 300;

	public static void main(String args []) {
		Inheritance i = new Inheritance();
		System.out.println(i.a + i.b + i.c);
	}
}
*/

//Hierarchical Inheritance 
/*class A {
	int a = 100;
}

class B extends A {
	int b = 200;
}

class Inheritance extends A {
	int c = 300;

	public static void main(String args []) {
		Inheritance i = new Inheritance();
		B b = new B();
		System.out.println(i.a + b.b + i.c);
	}
}*/

//Multiple Inheritance 
/* interface  A {
	int a = 100;
}

interface B extends A {
	int b = 200;
}

class Inheritance implements A, B {
	int c = 300;

	public static void main(String args[]) {
		Inheritance i = new Inheritance();
		System.out.println(i.a + i.b + i.c);
	}
}
*/

/*
 * HAS-A relationship These relationships are mainly based on the usage. This
 * determines whether a certain class HAS-A certain thing
 */
class A {
}

class B {
	int b = 10;
}

public class Inheritance {
	static B b = new B();

	public static void main(String args[]) {
		System.out.println(b.b);
	}
}
