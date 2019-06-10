package com.sameer.hibernate.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="oldstudents")
public class OldStudents extends MyStudent {

	private String ocompany ;
	private String ocemail ;
	private double octc ;
	
	public OldStudents() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OldStudents(String sname, String city, String status, double totalfee, String ocompany, String ocemail,
			double octc) {
		super(sname, city, status, totalfee);
		this.ocompany = ocompany;
		this.ocemail = ocemail;
		this.octc = octc;
	}
	public String getOcompany() {
		return ocompany;
	}
	public void setOcompany(String ocompany) {
		this.ocompany = ocompany;
	}
	public String getOcemail() {
		return ocemail;
	}
	public void setOcemail(String ocemail) {
		this.ocemail = ocemail;
	}
	public double getOctc() {
		return octc;
	}
	public void setOctc(double octc) {
		this.octc = octc;
	}
	@Override
	public String toString() {
		return "OldStudents [ocompany=" + ocompany + ", ocemail=" + ocemail + ", octc=" + octc + "]";
	}
	
}
