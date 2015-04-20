package edu.nova.csis3460.eadvisor.plans;

public class EAdvisorException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	protected String errorMessage;

	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String error_message) {
		this.errorMessage = error_message;
	}
}
