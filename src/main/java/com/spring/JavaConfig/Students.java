package com.spring.JavaConfig;

public class Students {
	
	// This is java bean class which has private field , public getter setter  and default constructor 
	private int id;
	private String name;
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Students(int id, String name) {
		
		this.id = id;
		this.name = name;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + "]";
	}
	
	


}
