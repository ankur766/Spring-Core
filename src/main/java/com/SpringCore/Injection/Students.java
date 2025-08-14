package com.SpringCore.Injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Students {
	
	// This is java bean class which has private field , public getter setter  and default constructor
	@Value("101")
	private int id;
	@Value("Ankur Kumar")
	private String name;
	@Autowired
	private Address address;
	
	@Autowired
	@Qualifier("IndianPhoneNumber")
	private PhoneNumberService ph;
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Students(int id, String name) {
		super();
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
	

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public PhoneNumberService getPh() {
		return ph;
	}

	public void setPh(PhoneNumberService ph) {
		this.ph = ph;
	}

	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", address=" + address + ", ph=" + ph + "]";
	}

	
	
	
	


}
