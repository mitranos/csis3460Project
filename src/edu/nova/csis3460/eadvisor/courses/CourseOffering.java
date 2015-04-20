package edu.nova.csis3460.eadvisor.courses;

import java.util.*;

/**
/*  Course Offering  
*/

public class CourseOffering {
	static int ARR_MAX = 50;
	static int[] Semester = new int[ARR_MAX];
	Boolean isEvenYear;
	Boolean isOddYear;
	Boolean isFall;
	Boolean isWinter;
	Boolean isSummer;
	static String course = "";	// Course
	public CourseOffering(){
		
		
    } 	
	public boolean isAvaliable(int semesterCode){	
		for(int i = 0; i< ARR_MAX; i++)
		{
			if( semesterCode == Semester[i]) {
				return true;
			}
		}
		return false;
	}
	public int[] futureOfferings(Date after, int number){
		// need to discuss logic that belongs to this class. 
		return Semester;
	}
    public void print(String course, int semesterCode){
        if(isAvaliable(semesterCode) == true){
        	System.out.printf(" The course, " + course + " is currently avaliable.");
        }else if (isAvaliable(semesterCode) == false){
        	System.out.printf(" The course, " + course + " is not currently avaliable.");
        }else{
        	System.out.printf("error");
        }
    }
    public static void test(){
    	CourseOffering aClassName  = new CourseOffering(); 
    	course ="Csis3460";
    	Semester[0] = 204580;	// need code to properly fill the array with semester codes
        aClassName.print(course, 204580);
    }

    public static void main(String[] args){
    	CourseOffering.test();
    }  
}
