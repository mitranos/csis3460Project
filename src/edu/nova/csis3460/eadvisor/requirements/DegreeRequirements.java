package edu.nova.csis3460.eadvisor.requirements;

import java.util.*;

import edu.nova.csis3460.eadvisor.courses.*;

public class DegreeRequirements extends RequirementsGroup {

	public DegreeRequirements(String name) {
		super(name);
	}
	
	public DegreeRequirements clone() throws CloneNotSupportedException {
		DegreeRequirements ret = new DegreeRequirements(this.getName());
		RequirementsGroup temp = super.clone();
		ret.andRequirements = temp.andRequirements;
		ret.orRequirements = temp.orRequirements;
		ret.isMet = temp.isMet;
		return ret;
	}

	public String toString() {
		return "Degree Requirements\n"+super.toString();
	}
	
	public static void test() {
		DegreeRequirements d = new DegreeRequirements("x");
		try {
			DegreeRequirements e = d.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("test complete!");
	}
	
	public static void main(String[] args) {
		test();
	}
}
