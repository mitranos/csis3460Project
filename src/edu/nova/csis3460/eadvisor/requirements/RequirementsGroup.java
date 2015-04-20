package edu.nova.csis3460.eadvisor.requirements;

import java.util.*;

import edu.nova.csis3460.eadvisor.core.*;
import edu.nova.csis3460.eadvisor.courses.*;
import edu.nova.csis3460.eadvisor.plans.*;

public class RequirementsGroup extends Requirement {
	
	private List<Requirement> andRequirements = new LinkedList<Requirement>();
	private List<Requirement> orRequirements = new LinkedList<Requirement>();
	
	private Boolean isMet = null;
	
	
	public RequirementsGroup(String name) {
		super(name);
	}
	
	public void add_AND_Requirement(Requirement addMe) {
		andRequirements.add(addMe);
	}
	
	public void add_OR_Requirement(Requirement addMe) {
		orRequirements.add(addMe);
	}
	
	public boolean isMet(Student theStudent) {
		if(isMet != null) return isMet;
		
		//process all sub-requirements
		for(Requirement r : orRequirements) {
			if(r.isMet(theStudent)) return isMet = true;
		}
		for(Requirement r : andRequirements) {
			if(!r.isMet(theStudent)) return isMet = false;
		}
		
		return isMet = true;
	}
	
	public RequirementsGroup clone() throws CloneNotSupportedException {
		RequirementsGroup copy = new RequirementsGroup(this.getName());
		for(Requirement r : orRequirements) {
			copy.add_OR_Requirement(r.clone());
		}
		for(Requirement r : andRequirements) {
			copy.add_AND_Requirement(r.clone());
		}
		return copy;
	}
	
	protected void buildCourseList(List<Course> ret) {
		for(Requirement r : orRequirements) {
			r.buildCourseList(ret);
		}
		for(Requirement r : andRequirements) {
			r.buildCourseList(ret);
		}
	}
	
	public List<Course> getCourseList() {
		List<Course> ret = new LinkedList<Course>();
		buildCourseList(ret);
		return ret;
	}
}
