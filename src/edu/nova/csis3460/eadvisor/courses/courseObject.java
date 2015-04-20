package edu.nova.csis3460.eadvisor.courses;

public class courseObject
{
	public String section = " ";
	public String semester = " ";
	public char grade = ' ';
	public int crn = 0;
	
	public courseObject (String a, String b, char c, int d)
	{
		section = a;
		semester = b;
		grade = c;
		crn = d;
	}
}
