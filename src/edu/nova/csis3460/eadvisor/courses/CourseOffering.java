package edu.nova.csis3460.eadvisor.courses;

import java.util.*;

/**
/*  Course Offering  
 * Let me know if we are missing anything
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
		Semester[0] = 201530; // Arbitrary Semester codes
    	Semester[1] = 201550;
    	Semester[2] = 201550;
    	Semester[3] = 201520;	
    	Semester[4] = 201520;
    	Semester[5] = 201630;
    	Semester[6] = 201650;
    	Semester[7] = 201650;
    	Semester[8] = 201730;
    	Semester[9] = 201720;
    	Semester[10] = 201750;
    	Semester[11] = 201750;
    	Semester[12] = 201830;
    	Semester[13] = 201830;
    	Semester[14] = 201850;
    	Semester[15] = 201820;
    	Semester[16] = 201930;
    	Semester[17] = 201950;
    	Semester[18] = 201950;
    	Semester[19] = 201920;
    	Semester[20] = 201920;
    	Semester[21] = 202030;
    	Semester[22] = 202050;
    	Semester[23] = 202020;
    	Semester[24] = 202020;
    	Semester[25] = 202130;
		
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
	@SuppressWarnings("deprecation")
	public int[] futureOfferings(Date after, int number){
		int j = number; // array limit
		int f = 0; // f to create
		int[] SemestersAvailable = new int[number];
		int year = after.getYear() + 1900;
		for(int i = 0; i< ARR_MAX; i++)
		{
			if( (j > 0)) {
				if (Math.floor(Semester[i] / 100) >= year) {
					if(isEvenYear) {
						if( ((Math.floor(Semester[i] / 100)) % 2) == 0) {
							if(isWinter) {
								if( (Semester[i] % 100) == 30){
									SemestersAvailable[f] = Semester[i];
									f++;
									j--;
								}
								
							}
							if(isSummer) {
								if( (Semester[i] % 100) == 50){
									SemestersAvailable[f] = Semester[i];
									f++;
									j--;
								}
							}
							if(isFall) {
								if( (Semester[i] % 100) == 20){
									SemestersAvailable[f] = Semester[i];
									f++;
									j--;
								}
							}
						}
					}
					if(isOddYear) {
						if( ((Math.floor(Semester[i] / 100)) % 2) == 1) {
							if(isWinter) {
								if( (Semester[i] % 100) == 30){
									SemestersAvailable[f] = Semester[i];
									f++;
									j--;
								}
								
							}
							if(isSummer) {
								if( (Semester[i] % 100) == 50){
									SemestersAvailable[f] = Semester[i];
									f++;
									j--;
								}
							}
							if(isFall) {
								if( (Semester[i] % 100) == 20){
									SemestersAvailable[f] = Semester[i];
									f++;
									j--;
								}
							}
						}
					}
				}
			}
			else if (j <= 0) {
				i = ARR_MAX;
			}
		}
		return SemestersAvailable;
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
    	aClassName.isEvenYear = false;
    	aClassName.isOddYear = true;
    	aClassName.isWinter = true;
    	aClassName.isFall = true;
    	aClassName.isSummer = false;
    	@SuppressWarnings("deprecation")
		Date testDate = new Date("04/06/2017");
    	int[] testArray = new int[ARR_MAX]; // to display
    	course ="Csis3460";
    	Semester[0] = 201530; // Semester codes
    	Semester[1] = 201550;
    	Semester[2] = 201550;
    	Semester[3] = 201520;	
    	Semester[4] = 201520;
    	Semester[5] = 201630;
    	Semester[6] = 201650;
    	Semester[7] = 201650;
    	Semester[8] = 201730;
    	Semester[9] = 201720;
    	Semester[10] = 201750;
    	Semester[11] = 201750;
    	Semester[12] = 201830;
    	Semester[13] = 201830;
    	Semester[14] = 201850;
    	Semester[15] = 201820;
    	Semester[16] = 201930;
    	Semester[17] = 201950;
    	Semester[18] = 201950;
    	Semester[19] = 201920;
    	Semester[20] = 201920;
    	Semester[21] = 202030;
    	Semester[22] = 202050;
    	Semester[23] = 202020;
    	Semester[24] = 202020;
    	Semester[25] = 202130;
        aClassName.print(course, 204580);
        testArray = aClassName.futureOfferings(testDate,5);
        for(int i = 0; i < 5; i++){
        System.out.println(testArray[i]);
        }
    }

    public static void main(String[] args){
    	CourseOffering.test();
    }  
}
