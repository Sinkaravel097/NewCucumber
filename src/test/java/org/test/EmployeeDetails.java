package org.test;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EmployeeDetails extends Employee {
	
	public static void main(String[] args) {
		
		EmployeeDetails e = new EmployeeDetails();
		e.setAge(40); // 40 passed here
		e.setName("Naveen");
		e.setPhNo(42345676543456l);
		
		EmployeeDetails e1 = new EmployeeDetails();
		e1.setAge(40); 
		e1.setName("Surya");
		e1.setPhNo(123456676543456l);
		
		
		// User Defined Map
		
		Map<Integer, EmployeeDetails> m = new LinkedHashMap<Integer, EmployeeDetails>();
		m.put(1, e);
		m.put(2, e1);
		
		Set<Entry<Integer, EmployeeDetails>> en = m.entrySet();
		
		for (Entry<Integer, EmployeeDetails> data : en) {
			
			System.out.println("Employee No : " + data.getKey());
			System.out.println(data.getValue().getAge());
			System.out.println(data.getValue().getName());
			System.out.println(data.getValue().getPhNo());
			
		}
		
	}
	

}
