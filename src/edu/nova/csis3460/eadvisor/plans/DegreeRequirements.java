package edu.nova.csis3460.eadvisor.plans;

import java.util.ArrayList;

public class DegreeRequirements {
	
	private Boolean isMet = null;

	/* List of courses */
	ArrayList<Requirement> degreeRequirements = new ArrayList<Requirement>();
	
	public DegreeRequirements() {
	}
	
	public ArrayList<Requirement> getDegreeRequirements() {
		return degreeRequirements;
	}

	public void setDegreeRequirements(ArrayList<Requirement> degreeRequirements) {
		this.degreeRequirements = degreeRequirements;
	}

	public Boolean getIsMet() {
		return isMet;
	}
	public void setIsMet(Boolean isMet) {
		this.isMet = isMet;
	}
}

