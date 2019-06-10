package com.sameer.hibernate.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="mycustomer")
public class MyCustomer implements Serializable {

	@Id
	@Column(name="cid")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cid ;
	@Column(name="firstName")
	private String firstName ;
	private String lastName ;
	private String email ;
	private String phone;
	
	/*@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="aid")
	private Address address ;*/
	
	@OneToMany(mappedBy="myCustomer")
	private Set<Request> requests ;

	public MyCustomer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyCustomer(String firstName, String lastName, String email, String phone) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Set<Request> getRequests() {
		return requests;
	}

	public void setRequests(Set<Request> requests) {
		this.requests = requests;
	}

	@Override
	public String toString() {
		return "MyCustomer [cid=" + cid + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", phone=" + phone + ", requests=" + requests + "]";
	}

	/*public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}*/
}
