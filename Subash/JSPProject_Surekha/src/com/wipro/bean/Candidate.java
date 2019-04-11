package com.wipro.bean;

public class Candidate {
	private int candID;
	private String candName;
	private String course;
	public Candidate() {
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
	@Override
	public String toString() {
		return "Candidate [candID=" + candID + ", candName=" + candName + ", course=" + course + "]";
	}
	
}
