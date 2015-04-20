/** 
 * Team 4  :  Dary Cabrera, Guilio Piccinonna, Juan Caldas, Sheik Rahaman.
 * Date    :  April 20, 2015
 * Purpose :  Uses the results from a Degree Audit and available Course Offerings to calculate a Graduation Plan for the Student.
 */

package edu.nova.csis3460.eadvisor.plans;

import java.util.ArrayList;

public class GraduationPlan {

    public GraduationPlan(){
    } 
     
    public void print(){
        System.out.println("Hello World");
    }
    public static void test(){
        GraduationPlan graduationPlan  = new GraduationPlan(); 
        graduationPlan.print();
    }

    public static void main(String[] args){
        GraduationPlan.test();
    }
    
    /*
     * Uses the unmet Degree Requirements list returned from a Degree Audit and searches the corresponding Course's course offerings to calculate
     * a Graduation Plan for the Student. This method does not print the plan but turns it into a String.
     * 
     * Outstanding loose ends: -number of classes per semester? (the Student could be full time or part time) -- now that we are here what about the number of credits per semester?
     *                         -We ought have an additional parameter passed that specifies WHEN the student can take classes in the academic year i.e. Fall, summer, winter
     *                         -Graduation plan inheriting from course offerings is erroneous to me.  A course object has multiple course offerings.  unMet Degree Requirements
     *                          FUNDAMENTALLY consists of a list of courses that are required. Or so we assume... We just need to search these course object's course offerings 
     *                          and create a plan accordingly.
     */
    
    public void printGradPlan( ArrayList<DegreeRequirements> unmetDegreeRequirements )
    {
    	
    }
}