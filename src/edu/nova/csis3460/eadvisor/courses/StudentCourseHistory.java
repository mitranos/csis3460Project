package edu.nova.csis3460.eadvisor.courses;

import java.util.ArrayList;

public class StudentCourseHistory {

	private static ArrayList<CourseHistory> Course; 
	private static ArrayList<CourseHistory> TestCourse; 	
	private static ArrayList<Integer> courseCRN;

	
    public StudentCourseHistory(){

    }
    
	/* Return the grade for a course when we pass a "course number" and a "prefix" (example: 3000, MATH -- meaning MATH3000). 
	 * It can return null if no grade for the course number exists
	 */
	public Character getGrade(Integer courseNumber, String prefix) {
		return null;
    }
     
    public static void print(){
        System.out.println("List of Courses needed");
        
        for (int i = 0; i < TestCourse.size() - 1; i++)
        {
        	 System.out.println(
        			 TestCourse.get(i).semester + " " + 
        			 TestCourse.get(i).grade + " " + TestCourse.get(i).crn); 
        }
        
        System.out.println(" ");
        System.out.println("List of Courses already taken");
        
        for (int i = 0; i < Course.size() - 1; i++)
        {
        	 System.out.println(
        			 Course.get(i).semester + " " + 
        			 Course.get(i).grade + " " + Course.get(i).crn); 
        }
    }
    public static void test(){
    	
    	courseCRN = new ArrayList<Integer>();
    	courseCRN.add(30001);
    	courseCRN.add(30002);
    	courseCRN.add(30003);
    	courseCRN.add(30004);
    	
    	// Create list of courses that will be given from course class later
    	CourseHistory class1 = new CourseHistory ("Winter"	, 'B', 30456);
    	CourseHistory class2 = new CourseHistory ("Winter"	, 'A', 30002);
    	CourseHistory class3 = new CourseHistory ("Summer"	, 'B', 36425);
    	CourseHistory class4 = new CourseHistory ("Fall"	, 'C', 30003);
    	CourseHistory class5 = new CourseHistory ("Winter"	, 'B', 38754);
    	CourseHistory class6 = new CourseHistory ("Winter"	, 'B', 30001);
    	CourseHistory class7 = new CourseHistory ("Winter"	, 'A', 37552);
    	CourseHistory class8 = new CourseHistory ("Summer"	, 'B', 30004);
    	CourseHistory class9 = new CourseHistory ("Fall"	, 'C', 30027);
    	CourseHistory class0 = new CourseHistory ("Winter"	, 'B', 38754);
    	
    	TestCourse = new ArrayList<CourseHistory>();
    	
    	TestCourse.add(class1);
    	TestCourse.add(class2);
    	TestCourse.add(class3);
    	TestCourse.add(class4);
    	TestCourse.add(class5);
    	TestCourse.add(class6);
    	TestCourse.add(class7);
    	TestCourse.add(class8);
    	TestCourse.add(class9);
    	TestCourse.add(class0);
    	
    	Course = new ArrayList<CourseHistory>();
    	
    	for (int j = 0; j <= TestCourse.size() - 1; j++)
    	{
    		for (int k = 0; k <= courseCRN.size() - 1; k++)
    		{
    			if(courseCRN.get(k) == TestCourse.get(j).crn)
    			{
    				CourseHistory Temp = new CourseHistory 
    						(TestCourse.get(j).semester	
    								, TestCourse.get(j).grade, TestCourse.get(j).crn);
    				Course.add(Temp);
    			}
    		}
    	}
    	
    	print();
    	
    }
    
    public static void main(String[] args){
    	
        StudentCourseHistory.test();
    }  
}

