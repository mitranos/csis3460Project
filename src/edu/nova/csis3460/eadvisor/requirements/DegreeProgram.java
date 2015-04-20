package edu.nova.csis3460.eadvisor.requirements;

public class DegreeProgram {
	public final String NAME;
	private final DegreeRequirements DEGREE_REQUIREMENTS;
	
	public DegreeProgram(String n, DegreeRequirements r) {
		NAME = n;
		DEGREE_REQUIREMENTS = r;
	}
	
	public RequirementsGroup getDegreeRequirements() throws CloneNotSupportedException {
		return DEGREE_REQUIREMENTS.clone();
	}
}
