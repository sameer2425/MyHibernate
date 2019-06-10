package com.sameer.hibernate.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student1 {

	@Id
	@Column(name = "sid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer sid;
	private String sname;
	private String email;
	private long phone;

	@ManyToMany
	@JoinTable(name = "stu_cou", joinColumns = @JoinColumn(name = "sid", referencedColumnName = "sid"), inverseJoinColumns = @JoinColumn(name = "cid", referencedColumnName = "cid"))
	private Set<Course> courses;

	public Student1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student1(String sname, String email, long phone) {
		super();
		this.sname = sname;
		this.email = email;
		this.phone = phone;
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
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

	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Student1 [sid=" + sid + ", sname=" + sname + ", email=" + email + ", phone=" + phone + ", courses="
				+ courses + "]";
	}
}
