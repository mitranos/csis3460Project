package edu.nova.csis3460.eadvisor.requirements;

import java.util.*;

import edu.nova.csis3460.eadvisor.courses.*;
import edu.nova.csis3460.eadvisor.core.*;

public class RequirementsGroup extends Requirement {
	
	protected List<Requirement> andRequirements = new LinkedList<Requirement>();
	protected List<Requirement> orRequirements = new LinkedList<Requirement>();
	
	protected Boolean isMet = null;
	
	
	public RequirementsGroup(String name) {
		super(name);
	}
	
	public void addANDRequirement(Requirement addMe) {
		andRequirements.add(addMe);
	}
	
	public void addORRequirement(Requirement addMe) {
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
			copy.addORRequirement(r.clone());
		}
		for(Requirement r : andRequirements) {
			copy.addANDRequirement(r.clone());
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
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Requirement temp;
		Iterator<Requirement> iter;
		sb.append("Requirement: "+this.getName()+"\n");
		if(orRequirements.size() > 0) {
			iter = orRequirements.iterator();
			Requirement first = iter.next();
			sb.append("--------------------\n");
			sb.append(first.toString()+"\n");
			sb.append("--------------------\n");
			while(iter.hasNext()) {
				sb.append("OR\n");
				sb.append("--------------------\n");
				sb.append(iter.next().toString()+"\n");
				sb.append("--------------------\n");
			}
		}
		
		if(andRequirements.size() > 0) {
			sb.append("OR\n");
			sb.append("--------------------\n");
			iter = andRequirements.iterator();
			sb.append("--------------------\n");
			sb.append(iter.next().toString()+"\n");
			sb.append("--------------------\n");
			while(iter.hasNext()) {
				sb.append("AND");
				sb.append("--------------------\n");
				sb.append(iter.next().toString()+"\n");
				sb.append("--------------------\n");
			}
			sb.append("--------------------\n");
		}
		
		//last line
		return sb.toString();
	}
}
