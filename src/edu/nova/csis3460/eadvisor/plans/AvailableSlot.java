package edu.nova.csis3460.eadvisor.plans;

import java.util.*;

import edu.nova.csis3460.eadvisor.courses.Course;

public class AvailableSlot {
    	
    private int semesterCode;
    private int creditCount = 0;

    /* List of courses */
    ArrayList<Course> courses = new ArrayList<Course>(); 
    	
	public AvailableSlot( int semesterCode ) {
         this.semesterCode = semesterCode;
    }
    
    public void addCourse( Course course ) {
    	this.courses.add(course);
    }
    
    public void addCredits( int credits ) {
    	this.creditCount += credits;
    }

	public int getSemesterCode() {
		return semesterCode;
	}

	public void setSemesterCode(int semesterCode) {
		this.semesterCode = semesterCode;
	}

	public int getCreditCount() {
		return creditCount;
	}

	public void setCreditCount(int creditCount) {
		this.creditCount = creditCount;
	}

    public ArrayList<Course> getCourses() {
		return courses;
	}

	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}
}
