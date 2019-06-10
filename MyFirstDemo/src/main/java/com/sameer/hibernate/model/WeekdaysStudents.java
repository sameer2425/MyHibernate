package com.sameer.hibernate.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="weekdaystudents")
public class WeekdaysStudents extends CurrentStudents {

	private String qualification ;
	private String percentage ;
	private int yop ;
	public WeekdaysStudents() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WeekdaysStudents(String sname, String city, String status, double totalfee, double feebal, String timings,
			String branch, String qualification, String percentage, int yop) {
		super(sname, city, status, totalfee, feebal, timings, branch);
		this.qualification = qualification;
		this.percentage = percentage;
		this.yop = yop;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getPercentage() {
		return percentage;
	}
	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}
	public int getYop() {
		return yop;
	}
	public void setYop(int yop) {
		this.yop = yop;
	}
	@Override
	public String toString() {
		return "WeekdaysStudents [qualification=" + qualification + ", percentage=" + percentage + ", yop=" + yop + "]";
	}
}
