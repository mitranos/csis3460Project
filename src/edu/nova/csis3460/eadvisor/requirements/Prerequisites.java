package edu.nova.csis3460.eadvisor.requirements;

public class Prerequisites extends RequirementsGroup {

	public Prerequisites(String name) {
		super(name);
	}
	
	public Prerequisites clone() throws CloneNotSupportedException {
		Prerequisites ret = new Prerequisites(this.getName());
		RequirementsGroup temp = super.clone();
		ret.andRequirements = temp.andRequirements;
		ret.orRequirements = temp.orRequirements;
		ret.isMet = temp.isMet;
		return ret;
	}
	
	public String toString() {
		return "Prerequisites\n"+super.toString();
	}

}
