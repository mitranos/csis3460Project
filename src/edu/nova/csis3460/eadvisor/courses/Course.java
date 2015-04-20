package edu.nova.csis3460.eadvisor.courses;

/**
/*  Course: holds information about the courses for all the degrees in eAdvisor
*/  

public class Course{

	private String title;
	private String description;
	private int credits;
	private String outcomes;
	private Integer courseNumber;
	private String prefix;
	private CourseOffering courseOffering = new CourseOffering();
	public boolean IS_MINIMUM_LEVEL = false;
	
    public Course(String title, String description, String prefix, int courseNumber, int credits, String outcomes){
    	title = this.title;
    	description = this.description;
    	prefix = this.prefix;
    	courseNumber = this.courseNumber;
    	credits = this.credits;
    	outcomes = this.outcomes;
    }
    
    public String getTitle(){
    	return title;
    }
    
    public String getDescription(){
    	return description;
    }
    
    public int getCredits(){
    	return credits;
    }
    
    public String getOutcomes(){
    	return outcomes;
    }
    
    public int getCourseNumber(){
    	return courseNumber;
    }
    
    public String getPrefix(){
    	return prefix;
    }
    
    public CourseOffering getCourseOffering(){
    	return courseOffering;
    }
    
    public void setMinimumLeveltoTrue(){
    	IS_MINIMUM_LEVEL = true;
    }
    
    public void setMinimumLeveltoFalse(){
    	IS_MINIMUM_LEVEL = false;
    }
     
    public void print(){
        System.out.println("Hello World");
    }
    
    public static void test(){
    	Course course  = new Course("Calculus", "Calculus is the study of math", "MATH", 4000, 4, "outcomes"); 
    	course.print();
    }

    public static void main(String[] args){
    	Course.test();
    }  
}