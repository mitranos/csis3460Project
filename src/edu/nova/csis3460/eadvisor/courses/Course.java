package edu.nova.csis3460.eadvisor.courses;

import java.util.*;

/**
/*  Course: holds information about the courses for all the degrees in eAdvisor
*/  

private String title;
private String description;
private int credits;
private String outcomes;
private courseOffering courseOffering = new courseOffering();

public class Course{

    public Course(String title, String description, int credits, String outcomes){
    	title = this.title;
    	description = this.description;
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
    
    public courseOffering getCourseOffering(){
    	return courseOffering;
    }
     
    public void print(){
        System.out.println("Hello World");
    }
    
    public static void test(){
    	Course course  = new Course(); 
        aClassName.print();
    }

    public static void main(String[] args){
    	Course.test();
    }  
}