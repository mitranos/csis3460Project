package edu.nova.csis3460.eadvisor.requirements;

public class Prerequisites extends RequirementsGroup {

	public Prerequisites(String name) {
		super(name);
	}
	
	public Prerequisites clone() throws CloneNotSupportedException {
		return (Prerequisites) super.clone();
	}

}
