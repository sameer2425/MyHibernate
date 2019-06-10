package com.sameer.hibernate.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.Version;

import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.Proxy;

@Entity
@Table(name="CUSTOMERS")
//@Immutable
@Proxy(lazy=true)
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cid")
	private int cid;

	@Column(name = "cname")
	private String cname;

	//@Transient
	@Column(name = "email")
	private String email;

	@Column(name = "phone")
	private Long phone;
	
	@Column(name = "city")
	private String city ;
	
	private String state ;
	
	/*@Version
	private int version ;*/
	
	@Version
	@Temporal(TemporalType.TIMESTAMP)
	private Date timestamp ;
	
	Customer(){
		
	}

	public Customer(String cname, String email, Long phone, String city, String state) {
		super();
		this.cname = cname;
		this.email = email;
		this.phone = phone;
		this.city = city;
		this.state = state ;
	}

	
	public Customer(int cid, String cname, String email, Long phone, String city, String state) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.email = email;
		this.phone = phone;
		this.city = city;
		this.state = state;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
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
		return "Customer [cid=" + cid + ", cname=" + cname + ", email=" + email + ", phone=" + phone + ", city=" + city
				+ ", state=" + state + ", timestamp=" + timestamp + "]";
	}
}
