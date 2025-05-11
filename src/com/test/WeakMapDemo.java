package com.test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.WeakHashMap;

public class WeakMapDemo {

	
	public static void main(String[] args) {
		WeakHashMap hm = new WeakHashMap();
		Temp t = new Temp();
		
		hm.put(t, "sunil");
		hm.put("dd", "tt");
		
		System.out.println(hm);
		t=null;
		System.gc();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(hm);
		
		TreeMap tm = new TreeMap();
		
		tm.put(110, "sunil01");
		tm.put(102, "sunil02");
		tm.put(103, "sunil03");
		tm.put(104, "sunil04");
		tm.put(105, "sunil05");
		//tm.put(null, null);
		
		System.out.println(tm);
		
		System.out.println(tm.firstKey());
		System.out.println(tm.lastKey());
		System.out.println(tm.headMap(103));
		System.out.println(tm.tailMap(103));
		System.out.println(tm.subMap(103,105));
		System.out.println(tm.comparator());
		
		Set s = tm.entrySet();
		System.out.println(s);
		
		TreeMap tm1 = new TreeMap(new myTreeComparator());
		tm1.put(new StringBuffer("trupti01").hashCode(), "sunil01");
		tm1.put(new StringBuffer("trupti04").hashCode(), "sunil02");
		tm1.put(new StringBuffer("01trupti01").hashCode(), "sunil03");
		tm1.put(new StringBuffer("02trupti01").hashCode(), "sunil04");
		tm1.put(new StringBuffer("03trupti01").hashCode(), "sunil05");
		
		System.out.println(tm1);
		
		Hashtable ht = new Hashtable();
		
		ht.put(100, null);
		
	}
}

class Temp{
	public String toString() {
		return "temp";
	}
	
	public void finalize() {
		System.out.println("finalze method called");
	}
}