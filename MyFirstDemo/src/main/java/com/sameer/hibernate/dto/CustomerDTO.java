package com.sameer.hibernate.dto;

public class CustomerDTO {

	private int cid ;
	private String cname ;
	private String email ;
	private long phone ;
	private String city ;
	private String state ;
	public CustomerDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomerDTO(String cname, String email, long phone, String city, String state) {
		super();
		this.cname = cname;
		this.email = email;
		this.phone = phone;
		this.city = city;
		this.state = state;
	}
	public CustomerDTO(int cid, String cname, String email, long phone, String city, String state) {
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
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
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
		return "CustomerDTO [cid=" + cid + ", cname=" + cname + ", email=" + email + ", phone=" + phone + ", city="
				+ city + ", state=" + state + "]";
	}
}
