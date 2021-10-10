package org.test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class C {
	
	public static void main(String[] args) {
		
		Map<Integer, String> m = new LinkedHashMap<Integer, String>();
		m.put(10, "Google");
		m.put(30, "Hcl");
		
		System.out.println(m);
		
		Set<Entry<Integer, String>> entrySet = m.entrySet();
		System.out.println(entrySet);
		
	}

}
