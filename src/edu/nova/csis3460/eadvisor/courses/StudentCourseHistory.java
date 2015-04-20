package edu.nova.csis3460.eadvisor.courses;

import java.util.LinkedList;

public class StudentCourseHistory {
	
	private String section;
	private String semester;
	private Character grade = null;
	private LinkedList<Course> courseHistory = new LinkedList<Course>();
	
	public void addCourseToHistory(Course course){
		
	}
	/* Return the grade for a course when we pass a "course number" and a "prefix" (example: 3000, MATH -- meaning MATH3000). 
	 * It can return null if no grade for the course number exists
	 */
	public Character getGrade(Integer courseNumber, String prefix) {
		return grade;
    }
}
