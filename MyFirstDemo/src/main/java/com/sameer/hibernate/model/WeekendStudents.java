package com.sameer.hibernate.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="weekendstudents")
public class WeekendStudents extends CurrentStudents {

	private String wcompany ;
	private String wcemail ;
	private double wctc ;
	public WeekendStudents() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WeekendStudents(String sname, String city, String status, double totalfee, double feebal, String timings,
			String branch, String wcompany, String wcemail, double wctc) {
		super(sname, city, status, totalfee, feebal, timings, branch);
		this.wcompany = wcompany;
		this.wcemail = wcemail;
		this.wctc = wctc;
	}
	public String getWcompany() {
		return wcompany;
	}
	public void setWcompany(String wcompany) {
		this.wcompany = wcompany;
	}
	public String getWcemail() {
		return wcemail;
	}
	public void setWcemail(String wcemail) {
		this.wcemail = wcemail;
	}
	public double getWctc() {
		return wctc;
	}
	public void setWctc(double wctc) {
		this.wctc = wctc;
	}
	@Override
	public String toString() {
		return "WeekendStudents [wcompany=" + wcompany + ", wcemail=" + wcemail + ", wctc=" + wctc + "]";
	}
}
