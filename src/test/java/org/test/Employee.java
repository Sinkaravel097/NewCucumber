package org.test;

public class Employee {

	private int age; // 40 assigned here
	private String name;
	private long phNo;
	
	
	public int getAge() {
		return age; // 40 getting here
	}
	
	//                  40 stored here
	public void setAge(int age) { 
		this.age = age; // 40 applied here
		
		// this is represent current class property
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public long getPhNo() {
		return phNo;
	}
	
	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}	 
	 
}
