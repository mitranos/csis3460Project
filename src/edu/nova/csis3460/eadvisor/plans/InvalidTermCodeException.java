package edu.nova.csis3460.eadvisor.plans;

public class InvalidTermCodeException extends EAdvisorException {

	private static final long serialVersionUID = 1L;

	public InvalidTermCodeException( int termCode )
	{
		this.setErrorMessage( "\nError: Invalid Term Code: " + termCode + "." );
	}
}

