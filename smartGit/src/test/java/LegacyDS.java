
/**
 * Vector is Synchronized and Array List is Non-Synchronized
 * 
 * Synchronized means thread-safe which means only one thread
 * can access to DS but Non-Synchronized means not-thread-safe
 * which means multiple thread can access to DS 
 * 
 * old DS are mostly Synchronized
 * 
 * this files is used with both enumerator and iterator
 * 
 */

import java.util.BitSet;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;

public class LegacyDS {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		/* Enumeration Interface and Vector Class */

		Enumeration days;
		Vector dayNames = new Vector(6, 1);
		dayNames.add("Sunday");
		dayNames.add("Monday");
		dayNames.add("Tuesday");
		dayNames.add("Wednesday");
		dayNames.add("Thursday");
		dayNames.add("Friday");
		System.out.println("Capacity after six additions: " + dayNames.capacity());
		dayNames.add("Saturday");
		System.out.println("Capacity after seven additions: " + dayNames.capacity());
		days = dayNames.elements();

		while (days.hasMoreElements()) {
			System.out.println(days.nextElement());
		}

		/* BitSet Class */

		BitSet bits1 = new BitSet(16);
		BitSet bits2 = new BitSet(16);

		// set some bits
		for (int i = 0; i < 16; i++) {
			if ((i % 2) == 0)
				bits1.set(i);
			if ((i % 2) != 0)
				bits2.set(i);
		}

		System.out.println("Initial pattern in bits1: ");
		System.out.println(bits1);
		System.out.println("\nInitial pattern in bits2: ");
		System.out.println(bits2);

		// AND bits
		bits2.and(bits1);
		System.out.println("\nbits2 AND bits1: ");
		System.out.println(bits2);

		// OR bits
		bits2.or(bits1);
		System.out.println("\nbits2 OR bits1: ");
		System.out.println(bits2);

		// XOR bits
		bits2.xor(bits1);
		System.out.println("\nbits2 XOR bits1: ");
		System.out.println(bits2);

		/* Stack class <- Vector sub Class */

		System.out.println("Stack class ");

		Stack s = new Stack();
		s.push(1);
		s.push(2);
		System.out.println(s);
		s.pop();
		System.out.println(s);

		/* Dictionary Class - obsolete - use MAP interface instead */

		System.out.println("/n Dictionary class ");

		Dictionary<String, String> dict = new Hashtable<String, String>();

		dict.put("A", "First");
		dict.put("B", "Second");
		Enumeration N;
		N = dict.elements(); // or dict.keys();
		while (N.hasMoreElements()) {
			System.out.println(N.nextElement());
		}

		/* Hashtable Class - use Hash MAP interface instead @ collections framework */

		Hashtable balance = new Hashtable();
		balance.put("Zara", new Double(3434.34));
		balance.put("Mahnaz", new Double(123.22));

		N = balance.keys();

		while (N.hasMoreElements()) {
			String str = (String) N.nextElement();
			System.out.println(str + ": " + balance.get(str));
		}
		System.out.println();
		
		/* Properties Class - subclass of Hashtable */
		
		Properties capitals = new Properties();
		Set states;
		String str;

		capitals.put("Illinois", "Springfield");
		capitals.put("Missouri", "Jefferson City");

		states = capitals.keySet();
		Iterator itr = states.iterator();

		while (itr.hasNext()) {
			str = (String) itr.next();
			System.out.println("The capital of " + str + " is " + capitals.getProperty(str) + ".");
		}
		System.out.println();
	}
}
