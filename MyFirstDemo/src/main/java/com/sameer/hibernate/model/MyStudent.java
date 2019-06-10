package com.sameer.hibernate.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="mystudents")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class MyStudent {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="sid")
	private int sid ;
	
	@Column(name="sname")
	private String sname ;
	
	@Column(name="city")
	private String city ;
	
	@Column(name="status")
	private String status ;
	
	@Column(name="totalfee")
	private double totalfee ;
	
	public MyStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyStudent(String sname, String city, String status, double totalfee) {
		super();
		this.sname = sname;
		this.city = city;
		this.status = status;
		this.totalfee = totalfee;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getTotalfee() {
		return totalfee;
	}

	public void setTotalfee(double totalfee) {
		this.totalfee = totalfee;
	}

	@Override
	public String toString() {
		return "MyStudent [sid=" + sid + ", sname=" + sname + ", city=" + city + ", status=" + status + ", totalfee="
				+ totalfee + "]";
	}
}
