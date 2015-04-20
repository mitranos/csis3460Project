package edu.nova.csis3460.eadvisor.requirements;

import java.util.*;

import edu.nova.csis3460.eadvisor.*;

public class DegreeRequirements extends RequirementsGroup {

	public DegreeRequirements(String name) {
		super(name);
	}
	
	public DegreeRequirements clone() throws CloneNotSupportedException {
		return (DegreeRequirements) super.clone();
	}

}
