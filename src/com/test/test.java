package com.test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Timer;
import java.util.TreeSet;
import java.util.Vector;

//import jdk.internal.joptsimple.internal.SimpleOptionNameMap;

public class test {


	public static void main(String []args) {



		String s = new String("sunil");

		s = s.concat("advik");

		System.out.println(s);

		System.out.println(s);

		StringBuilder sb = new StringBuilder("sunil");

		sb.append("sonmale");

		System.out.println(sb);

		String s1 = new String ("sunil");                                                    

		String s2 = new String ("sunil");

		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));


		/*
		 * String y = "hello"; System.out.println(y); System.out.println(" advik");
		 */

		/*
		 * System.out.println(myDropdownOptions.ADVIK);
		 * 
		 * for(myDropdownOptions names : myDropdownOptions.values()) {
		 * System.out.println(names); System.out.println(); }
		 */


		List<String> test = new ArrayList<String>();

		test.add("advik");
		test.add("trupti");
		test.add("sunil");

		System.out.println(test);

		test.remove("sunil");
		System.out.println(test);
		test.remove(0);
		System.out.println(test);
		System.out.println(test.size());

		System.out.println(test.isEmpty());
		test.add(0, "rk trupti");
		System.out.println(test);
		List<String> test1 = new ArrayList<String>();

		test1.add("advik1");
		test1.add("trupti1");
		test1.add("sunil1");

		test.addAll(test1);



		System.out.println(test1);

		test.retainAll(test1);
		System.out.println(test);

		//test.removeAll(test1);
		//System.out.println(test);

		test.add(0, "xxx");

		System.out.println(test);

		//test.removeAll(test1);
		System.out.println(test);

		Iterator i = test.iterator();

		while(i.hasNext())
			System.out.println( i.next());
		//System.out.println( i.next());



		Object [] abc = test.toArray();

		System.out.println(abc.length);
		String ss =abc[0].toString();
		System.out.println(ss);
		System.out.println(test);
		System.out.println(test.containsAll(test1));
		System.out.println(test.contains("xxx"));

		//.contains(test1);

		Collections.sort(test);
		Collections.sort(test, Collections.reverseOrder());
		System.out.println(test);
		System.out.println(test.get(2));
		System.out.println(test.lastIndexOf("xxx"));

		ListIterator li = test.listIterator();
		while (li.hasNext())
			System.out.println(li.next());


		test.add(0, "trupti sss");

		System.out.println(test);
		test.addAll(0, test1);
		System.out.println(test);

		ArrayList ll = new ArrayList(500);
		System.out.println(ll.size());

		ArrayList lb= new ArrayList (test);

		System.out.println(lb);
		
		
		LinkedList ll1 = new LinkedList ();
		
		ll1.add("sunil");
		ll1.addFirst("trupti");
		ll1.addLast("advik");
		ll1.add(3, "rk");
		
		for (int ii = 0;ii<100005;ii++) {
			System.out.println("hi");
			ll1.add("suniltrupti"+ii);
		}
		
		//System.out.println(ll1);
		
		System.out.println(Calendar.getInstance().getTimeInMillis());
		System.out.println(ll1.get(100000));
		System.out.println(Calendar.getInstance().getTimeInMillis());
		
		
		Vector vv = new Vector();
		
		
		vv.add(10);
		vv.add("test456");
		vv.add("testsffs");

		Enumeration ev = vv.elements();
		//ev.nextElement();
		
		System.out.println(ev.getClass().getName());
		
		while(ev.hasMoreElements())
			System.out.println(ev.nextElement());
		
		Stack st = new Stack();
		
		st.push(0);
		st.push(4);
		st.push(8);
		
		System.out.println(st);
		
		System.out.println(st.peek());
		//System.out.println(st.pop());
		
		System.out.println(st.search("12"));
		System.out.println(st.search(4));
		
		System.out.println(s.isEmpty());
		
		Iterator itr = st.iterator();
		
		itr.hasNext();
		
		
		
		HashSet h = new LinkedHashSet();
		
		h.add(5);

		h.add(6);
		h.add(66);
		
		System.out.println(h);
		
		ArrayList dd = new ArrayList();
		
		dd.add(5);

		dd.add(5);
		dd.add(5);
		dd.add(5);
		
		System.out.println(dd);
		
		
		System.out.println(new HashSet(dd));
		
		
		TreeSet ts = new TreeSet ();
		
		ts.add("a");
		ts.add("sunil");
		ts.add("b");
		ts.add("B");
		
		System.out.println(ts);
		
		
		//Object Object;
		TreeSet ts1 = new TreeSet (new myComparator());
		
		ts1.add("Advik");
		ts1.add("Sunil");
		ts1.add("Trupti");
		
		
		System.out.println(ts1);
		
		System.out.println("aaa".compareTo("AAA"));
	
	}
	
}

	
	
	/*enum myDropdownOptions{

		TRUPTI,
		SUNIL,
		ADVIK,
		BHAVIK,
		REYU,
		CHINGI
	}*/





//}
