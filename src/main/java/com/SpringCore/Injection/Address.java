package com.SpringCore.Injection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	@Value("5001B")
	private String street;
	@Value("Patna")
	private String city;
	@Value("Bihar")
	private String state;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [steet=" + street + ", city=" + city + ", state=" + state + "]";
	}
	
	
	
}
