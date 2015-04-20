/** 
 * Team 4  :  Dary Cabrera, Guilio Piccinonna, Juan Caldas, Sheik Rahaman.
 * Date    :  April 20, 2015
 * Purpose :  Computes a student’s current progress in fulfilling a degree program’s requirements based on the
 *            student's course history
 */

package edu.nova.csis3460.eadvisor.plans;

import java.util.*;

public class Audit {

    public Audit(){
    } 
     
    public void print(){
        System.out.println("Hello World");
    }
    public static void test(){
        Audit audit  = new Audit(); 
        audit.print();
    }

    public static void main(String[] args){
        Audit.test();
    }
    
 
    /* 
     * There exists an inconsistency between the class's static design diagram and message sequence diagram with respect to to what this
     * method returns. We chose the audit message sequence function that returns DegreeRequirements rather than a String. EAdvisor can
     * handle converting these to string format if it wishes to.
     * 
     * I believe we should pass a Degree Program object to getAuditCheck, inside that object would be the ArrayList of Degree Requirements...but
     * I am keeping it as is for now.
     */
   public ArrayList<DegreeRequirements> getAuditCheck( ArrayList<DegreeRequirements> degreeRequirements, ArrayList<StudentCourseHistory> history )
   {
	   /* if the degreeRequirements list is empty throw the appropriate exception. */
	   if ( degreeRequirements.isEmpty() )
		   throw new EmptyDegreeRequirementsException();
		
	   /* if the student has no course history we just return the entire degreeRequirements list, which remains completely unfulfilled. */
	   if ( history.isEmpty() )
		   return degreeRequirements;
	   
	   ArrayList<DegreeRequirements> unmetDegreeRequirements = new ArrayList<DegreeRequirements>();
	   
	   DegreeRequirements tempDegreeRequirement;
	   Requirement tempRequirement;
	   StudentCourseHistory tempCourseHistory;
	   
		/* go through the Degree Requirement Array list one by one */
		for ( Iterator<DegreeRequirements> degreeRequirementIterator = degreeRequirements.iterator(); degreeRequirements.hasNext(); )
		{
			tempDegreeRequirement = degreeRequirementIterator.next();
			/* assume the degree requirement is met until proven otherwise. */
			tempDegreeRequirement.isMet = true;
			/* go through the requirements Array list in each tempDegreeReq one by one. We want to mark all requirements as met or not met. */
			for ( Iterator<Requirement> requirementIterator = tempDegreeRequirement.iterator(); tempDegreeRequirement.hasNext(); )
			{
				tempRequirement = requirementIterator.next();
				
				/* Search the Student's Course History to find a course that meets the requirement. */
				for ( Iterator<StudentCourseHistory> courseHistoryIterator = history.iterator(); history.hasNext(); )
				{
					tempCourseHistory = courseHistoryIterator.next();
					
					tempRequirement.isMet = false;
					
					/** For comparison we are going to use equal comparisons on the course's object in StudentCourseHistory 
					 * The object(s) to be compared with is of one the courses in a OR course group or multiple courses in an AND group of a requirement
					 * It is confusing and ambiguous how the requirements are going to be implemented. Until we get a concrete plan, we cannot proceed with this section
					 * of the algorithm.
					 */
					if ( tempCourseHistory.course.equals( /* Comparison to be continued....) */ ))
					{
						/*
						 * ...
						 */
						
						tempRequirement.isMet = true;
					}
				}
				/* if any Requirement in the list of Requirements pertaining to a DegreeRequirement is unsatisfied mark the DegreeRequirement as NOT met. */
				if ( tempRequirement.isMet == false )
				{
					tempDegreeRequirement.isMet = false;
				}
			}
			
			/* If any requirement pertaining to the Degree Requirements was not met, add it to the unmetDegreeRequirements array list */
			if (tempDegreeRequirement.isMet == false )
			{
				unmetDegreeRequirements.add(tempDegreeRequirement);
			}
		}
		return unmetDegreeRequirements;
   }
   
   /* 
    * Existence of this method in EAdvisor is questionable. getAuditCheck returns a list of Degree Requirements that 
    * can be to-Stringed. I shall leave it empty for that reason...
    */
   public void printAuditCheck( ArrayList<DegreeRequirements> degreeRequirements, ArrayList<StudentCourseHistory> history )
   {
	   
   }
}