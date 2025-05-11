package com.test;

import java.util.Comparator;

public class myTreeComparator implements Comparator<Object>{

	@Override
	public int compare(Object obj1, Object obj2) {
	
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		
		return s2.compareTo(s1);
	}

	/*
	 * @Override public int compare(T o1, T o2) { // TODO Auto-generated method stub
	 * return 0; }
	 */

}
