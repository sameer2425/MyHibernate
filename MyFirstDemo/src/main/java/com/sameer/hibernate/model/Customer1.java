package com.sameer.hibernate.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="CUSTOMER1")
public class Customer1 {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="cid")
	private int cid ;
	private String name ;
	
	@Embedded
	@AttributeOverrides(value= {
			@AttributeOverride(name="street",column=@Column(name="mystreet")),
			@AttributeOverride(name="city",column=@Column(name="mycity"))
	})
	private Address1 address1;

	public Customer1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer1(String name, Address1 address1) {
		super();
		this.name = name;
		this.address1 = address1;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address1 getAddress1() {
		return address1;
	}

	public void setAddress1(Address1 address1) {
		this.address1 = address1;
	}

	@Override
	public String toString() {
		return "Customer1 [cid=" + cid + ", name=" + name + ", address1=" + address1 + "]";
	}
}
