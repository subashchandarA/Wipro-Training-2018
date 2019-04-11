package com.wipro.bean;

public class Candidate {

	private int candID;
	private String candName;
	private String course;
	public Candidate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Candidate(int candID, String candName, String course) {
		super();
		this.candID = candID;
		this.candName = candName;
		this.course = course;
	}
	public int getCandID() {
		return candID;
	}
	public void setCandID(int candID) {
		this.candID = candID;
	}
	public String getCandName() {
		return candName;
	}
	public void setCandName(String candName) {
		this.candName = candName;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
}
