package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class mapLearning {



	public static void main(String[] args) {
		Map<String, String> mapS = new HashMap<String, String>();

		System.out.println(mapS.put("SS", "tRUPTI"));
		System.out.println(mapS);
		System.out.println(mapS.put("S", "RITKUPTI"));
		System.out.println(mapS);

		LinkedHashMap<String, String> mapSS = new LinkedHashMap<String, String>();
		
		Map m = Collections.synchronizedMap(mapS);
		
		ArrayList al = new ArrayList();
		
		List l = Collections.synchronizedList(al);
		mapSS.put("Advik", "adviki");

		mapS.putAll(mapSS);
		System.out.println(mapS);

		System.out.println(mapS.get("Advik"));
		System.out.println(mapS.get("Advik"));
		System.out.println(mapS);

		System.out.println(mapS.containsKey("SS"));
		System.out.println(mapS.containsValue("tUPTI"));
		System.out.println(mapS.isEmpty());
		System.out.println(mapS.size());
		System.out.println(mapS);
		//mapS.clear();
		System.out.println(mapS.keySet());
		System.out.println(mapS.values());
		System.out.println(mapS.entrySet());

		int ii=0;
		for (Entry<String, String> e:mapS.entrySet()){

			System.out.println(e.getKey()+":: "+e.setValue("test"+ii+""));
			ii++;
		}

		for(String ss : mapS.keySet()) {
			System.out.println(ss+" ::: "	+mapS.get(ss));
		}
		
		Set s1 = mapS.entrySet();
		
		Iterator itr = s1.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry e =  (Map.Entry) itr.next();
			
			System.out.println(e.getKey()+"=="+e.getValue());
			//System.out.println(e.getValue());
					
		}
		
		
		IdentityHashMap ht = new IdentityHashMap();
		Integer i1 = new Integer(11);
		Integer i2 = new Integer(11);
		ht.put(i1, "sunil");
		ht.put(i2, "sunil");
		
		System.out.println(i2==i1);
		System.out.println(i1.equals(i2));
		System.out.println(i2.compareTo(i1));
		
		System.out.println(ht);
		

	}
}


