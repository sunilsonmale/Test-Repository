package com.test;

import java.util.Comparator;

public  class myComparator implements Comparator<Object>{

	@Override
	public int compare(Object obj1, Object obj2) {
		
		//Integer i1 = (Integer) obj1;
		
		//Integer i2 = (Integer) obj2;
		
		myEmployee e1 = (myEmployee) obj1;
		myEmployee e2 = (myEmployee) obj2;
		
		
		
		return -e1.empName.compareTo(e2.empName);
		
		
	}
	
}
