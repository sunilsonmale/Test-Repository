package com.test;

import java.util.TreeSet;

public class myTestCompComp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		myEmployee e1 = new myEmployee(100, "advik");
		myEmployee e2 = new myEmployee(101, "tadvik01");
		myEmployee e3 = new myEmployee(110, "padvik02");
		myEmployee e4 = new myEmployee(104, "sadvik02");
		
		TreeSet te = new TreeSet();
		te.add(e1);
		te.add(e2);
		te.add(e3);
		te.add(e4);
		
		System.out.println(te);
		
		
		TreeSet te1 = new TreeSet(new myComparator());
		te1.add(e1);
		te1.add(e2);
		te1.add(e3);
		te1.add(e4);
		
		System.out.println(te1);
		
	}

}
