package edu.nova.csis3460.eadvisor.requirements;

import java.util.*;

import edu.nova.csis3460.eadvisor.courses.*;
import edu.nova.csis3460.eadvisor.core.*;


/**
 * Class to build Course Groups (which extendes requirements)
 * @author Team1 - Winter 2015
 *
 */
public class CourseGroup extends Requirement {
	//A CourseGroup will contain a list of Courses and two flags: minCourses, minCredits which are used
	//to determine if a courseGroup has been met.
	List<StudentCourse> courses;
	Map<StudentCourse, Boolean> courseCompletionStatus = new HashMap<StudentCourse, Boolean>();
	int minCourses;
	int minCredits;
	
	Boolean isMet;
	
	/**
	 * Constructor for CourseGroup
	 * @param name - Name of the group
	 * @param courses - This is a List<Courses> which has all the courses in the group
	 * @param minCourses - This is minimum number of Courses that must be taken in the group for it to be considered "met"
	 * @param minCredits - This is minimum number of Credits that must be taken in the gorup for it to be consideter "met"
	 */
	public CourseGroup(String name, List<StudentCourse> courses, int minCourses, int minCredits) {
		super(name);
		this.courses = courses;
		for(StudentCourse c : courses) {
			this.courseCompletionStatus.put(c, false);
		}
		this.minCourses = minCourses;
		this.minCredits = minCredits;
	}
	
	/**
	 * Clone functionality for CourseGroup
	 */
	public CourseGroup clone() {
		List<StudentCourse> courses = new LinkedList<StudentCourse>();
		
		for(StudentCourse c : this.courses) {
			courses.add(c.clone());
		}
		
		return new CourseGroup(super.getName(), courses, minCourses, minCredits);
	}
	
	/**
	 * This method checks if the CourseGroup has been met
	 */
	public boolean isMet(Student theStudent) {
		if(isMet != null) return isMet;
		
		StudentCourseHistory history = theStudent.getCourseHistory();
		
		int coursesRemaining = minCourses;
		int creditsRemaining = minCredits;
		
		for(StudentCourse c : history.getEntireHistory()) {
			if(history.getGrade(c.getCourse().getCourseNumber(), c.getCourse().getPrefix()) > 'C') continue;
			else {
				//this course counts
				courseCompletionStatus.put(c, true);
				coursesRemaining--;
				creditsRemaining -= c.getCourse().getCredits();
			}
		}
		
		if(coursesRemaining <= 0 && creditsRemaining <= 0) return isMet = true;
		else return isMet = false;
	}
	
	/**
	 * This method checks if the buildCourseList
	 */
	/*
	protected void buildCourseList(List<Course> ret) {
		ret.addAll(courses);
	}
	*/
	public String toString(){
		StringBuilder sb = new StringBuilder().append("Requirement "+this.getName()+" is "+(isMet!=null?(isMet==true?"":"not"):"not")+" met\n");
		Iterator<StudentCourse> iter = this.courses.iterator();
		if(courses.size() > 0){
			StudentCourse first;
			sb.append((first = iter.next())+" "+((courseCompletionStatus.get(first))?"is":"not")+" passed\n");
			while(iter.hasNext()){
				sb.append((first = iter.next())+" "+((courseCompletionStatus.get(first))?"is":"not")+" passed\n");
				
			}
		}
		//return String
		return sb.toString();
	}
	
	public void print(){
		System.out.println(this);
	}
	/*
	public static void test(){
		List<Course> courseList = new LinkedList<>();
		courseList.add(new Course(2100, "MATH", 4, false));
		courseList.add(new Course(2200, "MATH", 4, false));
		courseList.add(new Course(3300, "MATH", 3, false));
		courseList.add(new Course(4500, "MATH", 3, false));
		courseList.add(new Course(2400, "PHYS", 4, false));
		courseList.add(new Course(2500, "PHYS", 4, false));
		CourseGroup myCoursesGroup = new CourseGroup("Test",courseList,3,0);
		myCoursesGroup.print();
		
	}*/
	
	public static void main (String args[]){
		//test();
	}
	
}
