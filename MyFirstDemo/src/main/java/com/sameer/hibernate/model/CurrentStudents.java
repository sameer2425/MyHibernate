package com.sameer.hibernate.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="currentstudents")
public class CurrentStudents extends MyStudent {

	@Column(name="feebal")
	private double feebal ;
	@Column(name="timings")
	private String timings ;
	@Column(name="branch")
	private String branch ;
	
	public CurrentStudents() {
		
	}

	public CurrentStudents(String sname, String city, String status, double totalfee, double feebal, String timings,
			String branch) {
		super(sname, city, status, totalfee);
		this.feebal = feebal;
		this.timings = timings;
		this.branch = branch;
	}

	public double getFeebal() {
		return feebal;
	}

	public void setFeebal(double feebal) {
		this.feebal = feebal;
	}

	public String getTimings() {
		return timings;
	}

	public void setTimings(String timings) {
		this.timings = timings;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "CurrentStudents [feebal=" + feebal + ", timings=" + timings + ", branch=" + branch + "]";
	}
}
