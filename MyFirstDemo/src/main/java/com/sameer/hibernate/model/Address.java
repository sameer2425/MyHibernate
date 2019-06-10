package com.sameer.hibernate.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="aid")
	private int aid ;
	private String street ;
	private String city ;
	private String state ;
	
	@OneToOne
	@JoinColumn(name="aid")
	private MyCustomer myCustomer ;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String street, String city, String state) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
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
	public MyCustomer getMyCustomer() {
		return myCustomer;
	}
	public void setMyCustomer(MyCustomer myCustomer) {
		this.myCustomer = myCustomer;
	}
	@Override
	public String toString() {
		return "Address [aid=" + aid + ", street=" + street + ", city=" + city + ", state=" + state + ", myCustomer="
				+ myCustomer + "]";
	}
}
