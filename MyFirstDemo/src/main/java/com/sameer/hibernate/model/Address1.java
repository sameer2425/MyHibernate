package com.sameer.hibernate.model;

import javax.persistence.Embeddable;

@Embeddable
public class Address1 {
	
	private String street ;
	private String city ;
	public Address1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address1(String street, String city) {
		super();
		this.street = street;
		this.city = city;
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
	@Override
	public String toString() {
		return "Address1 [street=" + street + ", city=" + city + "]";
	}
}
