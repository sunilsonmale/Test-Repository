package com.test;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Random;

public class PriorityQueueDemo {

	
	public static void main(String[] args) {
		PriorityQueue q = new PriorityQueue( 15, new MyPQComparator());
		
		//System.out.println(q.peek());
		//System.out.println(q.element());
		//
		//Random r = new Random();
		
		
		//for(int i = 0;i<=10;i++) {
			
			q.offer("A");
			//System.out.println(q);
			q.offer("Z");
			//System.out.println(q);
			q.offer("L");
			//System.out.println(q);
			q.offer("B");
			//System.out.println(q);
			//q.offer("U");
			//q.offer("E");
			
			
			
			
		//}
		
		System.out.println(q);
		System.out.println("start"+q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println("end"+q.poll());
		/*
		 * System.out.println(q.remove()); System.out.println(q.poll());
		 * System.out.println(q); System.out.println(q.element());
		 * System.out.println(q);
		 */
	}
}


class MyPQComparator implements Comparator{

	@Override
	public int compare(Object obj1, Object obj2) {
		// TODO Auto-generated method stub
		
		String s1 = (String)obj1;
		String s2 = obj2.toString();
		/*
		 * System.out.println(s1); System.out.println(s2);
		 * System.out.println(s2.compareTo(s1));
		 */
		
		return s2.compareTo(s1);//Integer.parseInt(s2-s1);
	}
	
}