package edu.nova.csis3460.eadvisor.requirements;

import edu.nova.csis3460.eadvisor.courses.*;
import edu.nova.csis3460.eadvisor.core.*;

import java.util.*;

public class Requirement implements Cloneable {
	private Boolean isMet = null;
	private String requirementName;
	private Integer minCredits = null;
	private List<String> coursePrefixes = null;
	private Integer minLevel = null;

	protected Requirement(String name) {
		this.requirementName = name;
	}
	
	public static Requirement newCreditRequirement(String name, int minCredits, List<String> prefix, int minLevel) throws DataInputError {
		if(name == null || prefix == null) throw new DataInputError("Input arguments cannot be null.");
		return new Requirement(name)
									.setMinCredits(minCredits)
									.setCoursePrefixes(prefix)
									.setMinLevel(minLevel);
	}
	
	public Requirement clone() throws CloneNotSupportedException {
			try {
				return Requirement.newCreditRequirement(requirementName, minCredits, coursePrefixes, minLevel);
			} catch (DataInputError e) {
				throw new CloneNotSupportedException("How the heck did this happen?");
			}
	}


	private Requirement setMinCredits(Integer minCredits) {
		this.minCredits = minCredits;
		return this;
	}

	private Requirement setCoursePrefixes(List<String> coursePrefix) {
		this.coursePrefixes = coursePrefix;
		return this;
	}
	
	private Requirement setMinLevel(int level) {
		this.minLevel = level;
		return this;
	}
	
	
	private boolean isCreditRequirementMet(StudentCourseHistory history) {
		List<StudentCourse> courses;
		if(coursePrefixes == null) courses = history.getEntireHistory();
		else {
			courses = new LinkedList<StudentCourse>();
			for(String prefix : coursePrefixes) {
				for(StudentCourse c : history.getCoursesWithPrefix(prefix)) {
					courses.add(c);
				}
			}
		}
			
		int creditsRemaining = minCredits;
		for(StudentCourse c : courses) {
			if(c.getCourse().getCourseNumber() < minLevel) continue;
			else creditsRemaining -= c.getCourse().getCredits();
		}
		return creditsRemaining <= 0;
	}
	
	public boolean isMet(Student theStudent) {
		if(isMet != null) return isMet;
		
		StudentCourseHistory history = theStudent.getCourseHistory();
		
		if(isCreditRequirementMet(history)) return isMet = true;
		else return isMet = false;
	}
	
	public String getName() {
		return ""+this.requirementName;
	}
	
	protected void buildCourseList(List<Course> ret) {
		for(String prefix : coursePrefixes) {
			ret.add(new Course(minLevel, prefix, minCredits, true));
		}
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Requirement: "+this.getName()+"\n");
		sb.append(this.minCredits+" credits at least "+this.minLevel+" level from these prefixes:\n");
		Iterator<String> iter = this.coursePrefixes.iterator();
		sb.append(iter.next());
		while(iter.hasNext()) {
			sb.append(" or "+iter.next());
		}
		return sb.toString();
	}
	
}
