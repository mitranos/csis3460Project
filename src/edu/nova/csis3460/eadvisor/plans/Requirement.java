package edu.nova.csis3460.eadvisor.plans;

import edu.nova.csis3460.eadvisor.courses.*;

public class Requirement {
	
	private Boolean isMet = null;
	Course course;
	
	public Requirement() {
	}
	
	public Requirement(Course course) {
		this.course = course;
	}
	
	public Boolean getIsMet() {
		return isMet;
	}
	
	public void setIsMet(Boolean isMet) {
		this.isMet = isMet;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
}
