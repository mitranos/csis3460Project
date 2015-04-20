package edu.nova.csis3460.eadvisor.requirements;

import java.util.*;

import edu.nova.csis3460.eadvisor.core.*;
import edu.nova.csis3460.eadvisor.courses.*;
import edu.nova.csis3460.eadvisor.plans.*;

public class CourseGroup extends Requirement {
	List<Course> courses;
	int minCourses;
	int minCredits;
	
	Boolean isMet;
	
	public CourseGroup(String name, List<Course> courses, int minCourses, int minCredits) {
		super(name);
		this.courses = courses;
		this.minCourses = minCourses;
		this.minCredits = minCredits;
	}
	
	public CourseGroup clone() {
		List<Course> courses = new LinkedList<Course>();
		
		for(Course c : this.courses) {
			courses.add(c.clone());
		}
		
		return new CourseGroup(super.getName(), courses, minCourses, minCredits);
	}

	public boolean isMet(Student theStudent) {
		if(isMet != null) return isMet;
		
		StudentCourseHistory history = theStudent.getCourseHistory();
		
		int coursesRemaining = minCourses;
		int creditsRemaining = minCredits;
		
		for(Course c : history.getEntireHistory()) {
			if(history.getGrade(c.courseNumber, c.prefix) > 'C') continue;
			else {
				//this course counts
				coursesRemaining--;
				creditsRemaining -= c.creditHours;
			}
		}
		
		if(coursesRemaining <= 0 && creditsRemaining <= 0) return isMet = true;
		else return isMet = false;
	}
	
	protected void buildCourseList(List<Course> ret) {
		ret.addAll(courses);
	}
	
}
