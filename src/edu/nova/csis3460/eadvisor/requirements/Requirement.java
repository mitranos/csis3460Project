package edu.nova.csis3460.eadvisor.requirements;

import edu.nova.csis3460.eadvisor.core.*;
import edu.nova.csis3460.eadvisor.courses.*;

import java.util.*;

public class Requirement implements Cloneable {
	private Boolean isMet = null;
	private String requirementName;
	private Integer courseNumber = null;
	private boolean isCourseRequirement = false;
	private boolean isCreditRequirement = false;
	private Integer minCredits = null;
	private String coursePrefix = null;
	private Integer minLevel = null;

	protected Requirement(String name) {
		this.requirementName = name;
	}
	
	public static Requirement newCourseRequirement(String name, String prefix, int courseNumber, int minCredits) throws DataInputError {
		if(name == null) throw new DataInputError("Input arguments cannot be null.");
		return new Requirement(name)
									.setCourseNumber(courseNumber)
									.setCoursePrefix(prefix)
									.setMinCredits(minCredits)
									.setIsCourseRequirement();
	}
	
	public static Requirement newCreditRequirement(String name, int minCredits, String prefix, int minLevel) throws DataInputError {
		if(name == null || prefix == null) throw new DataInputError("Input arguments cannot be null.");
		return new Requirement(name)
									.setMinCredits(minCredits)
									.setCoursePrefix(prefix)
									.setMinLevel(minLevel)
									.setIsCreditRequirement();
	}
	
	public Requirement clone() throws CloneNotSupportedException {
		if(isCourseRequirement) {
			try {
				return Requirement.newCourseRequirement(requirementName, coursePrefix, courseNumber, minCredits);
			} catch (DataInputError e) {
				throw new CloneNotSupportedException("How the heck did this happen?");
			}
		} else if (isCreditRequirement) {
			try {
				return Requirement.newCreditRequirement(requirementName, minCredits, coursePrefix, minLevel);
			} catch (DataInputError e) {
				throw new CloneNotSupportedException("How the heck did this happen?");
			}
		} else {
			throw new CloneNotSupportedException("Invalid requirement type!");
		}
	}

	private Requirement setCourseNumber(Integer courseNumber) {
		this.courseNumber = courseNumber;
		return this;
	}

	private Requirement setMinCredits(Integer minCredits) {
		this.minCredits = minCredits;
		return this;
	}

	private Requirement setCoursePrefix(String coursePrefix) {
		this.coursePrefix = coursePrefix;
		return this;
	}
	
	private Requirement setMinLevel(int level) {
		this.minLevel = level;
		return this;
	}
	
	private Requirement setIsCourseRequirement() {
		isCourseRequirement = true;
		return this;
	}
	
	private Requirement setIsCreditRequirement() {
		isCreditRequirement = true;
		return this;
	}
	
	private boolean isCourseRequirementMet(StudentCourseHistory history) {
		Character grade = history.getGrade(courseNumber, coursePrefix);
		if(grade == null || grade == 'F') return false;
		else return true;
	}
	
	private boolean isCreditRequirementMet(StudentCourseHistory history) {
		List<Course> courses = history.getCoursesWithPrefix(coursePrefix);
		int creditsRemaining = minCredits;
		for(Course c : courses) {
			if(c.courseNumber < minLevel) continue;
			else creditsRemaining -= c.creditHours;
		}
		return creditsRemaining <= 0;
	}
	
	public boolean isMet(Student theStudent) {
		if(isMet != null) return isMet;
		
		boolean courseRequirementMet = !isCourseRequirement;
		boolean creditRequirementMet = !isCreditRequirement;
		
		StudentCourseHistory history = theStudent.getCourseHistory();
		
		if(!courseRequirementMet) courseRequirementMet = isCourseRequirementMet(history);
		if(!creditRequirementMet) creditRequirementMet = isCreditRequirementMet(history);
		
		if(courseRequirementMet && creditRequirementMet) return isMet = true;
		else return isMet = false;
	}
	
	public String getName() {
		return ""+this.requirementName;
	}
	
	protected void buildCourseList(List<Course> ret) {
		if(isCreditRequirement) {
			ret.add(new Course(minLevel, coursePrefix, minCredits, true));
		}
		if(isCourseRequirement) {
			ret.add(new Course(courseNumber, coursePrefix, minCredits, false));
		}
	}
	
}
