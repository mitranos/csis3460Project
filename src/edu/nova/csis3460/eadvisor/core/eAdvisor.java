/*
 * File:        eAdvisor.java  
 *
 * Project:     eAdvisor Final Project
 * Company:     Nova Southeastern University
 * Supervisor:  Rajput Saeed
 *
 * Author:      Nicky Alvarez, Evelyn Comrie, Maron Benincasa, Ali Hussein, 
 * 				and Christopher Yowell
 * History:     Created 4/16/2015
 * Assisted by: Team 3 Participants and Team Leaders
 * Updates:     Initial Template and Working Menus (Nicky Alvarez - 04/16) v1.0
 * 				Edited Minor Function Layouts (Evelyn Comrie - 04/18) v2.0
 * 				Added Main Functions Required for eAdvisor (Ali Hussein - 04/18) v3.0
 * 				Added Package and edited code to inherit from User. Also created 
 * 				an ArrayList of Users. (Christopher Yowell - 04/19) v4.0
 * 				Verified and confirmed that variables match. (Evelyn Comrie - 04/25) v5.0
 * 				Updated code to match other related teams. (Ali Hussein - 04/25) v6.0
 * 				Added maintainCourseOfferings() as well as etCourseOffering() (Christopher 
 * 				Yowell - 04/27) v7.0
 *
 * (c) Copyright 2015 All rights reserved.
 *
 */

package edu.nova.csis3460.eadvisor.core;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;

import edu.nova.csis3460.eadvisor.courses.*;
import edu.nova.csis3460.eadvisor.requirements.*;

public class eAdvisor {

	private ArrayList<DegreeProgram> degreePrograms = new ArrayList<DegreeProgram>();
	private ArrayList<Course> courses = new ArrayList<Course>();

	public void addDegreeProgram(DegreeProgram degreeProgram)
	{
		this.degreePrograms.add(degreeProgram);
	}

	public void addCourse(Course course)
	{
		this.courses.add(course);
	}

	public void removeCourse(String name)
	{
		for (int i=0; i<this.courses.size();i++)
		{
			if (name == this.courses.get(i).getTitle())
			{
				this.courses.remove(i);
			}
		}
	}

	public void getDegreeNames() {

		for (int i=0; i<this.degreePrograms.size();i++)
		{
			System.out.println(this.degreePrograms.get(i).getTitle());
		}

	}

	public DegreeProgram searchDegree(String name) {
		for (int i=0; i< degreePrograms.size();i++) {
			if (name == this.degreePrograms.get(i).getTitle())
				return this.degreePrograms.get(i);
		}
		return null;
	}

	public Course getCourse(String name)
	{
		Course course= new Course("","","",0,0,"");
		for (int i=0; i<this.courses.size();i++)
		{
			if (name == this.courses.get(i).getTitle())
			{
				course= this.courses.get(i);
			}
		}
		return course;
	}

	public CourseOffering getCourseOffering(String name, Date date, int number)
	{
		for (int i=0; i<this.courses.size();i++) {
			if (this.courses.get(i).getTitle().equals(name))
				return this.courses.get(i).getCourseOffering(date, number);
		}
		return null;
	}
	/*
	public void maintainCourseOffering(String name)
	{
		
		CourseOffering tempCo = getCourseOffering(name);
		//code that calls setters on CourseOffering i.e. setSemester();
		// to maintain CourseOffering data
		setCourseOffering(tempCo, name);
		
	}
	/*
	public CourseOffering setCourseOffering(CourseOffering co, String name){
		getCourseOffering(1) = co;
	
	}
	 */
	public void print(){

		//main menu of the program
		System.out.println("-------------------------------");
		System.out.println("-------------------------------");
		System.out.println("        eAdvisor Program       ");
		System.out.println();
		System.out.println("1.Student");
		System.out.println("2.Administrator");
		System.out.println("3.Advisor");
		System.out.println("4.Exit");
		System.out.println();
		System.out.println("-------------------------------");
		System.out.println("-------------------------------");
		System.out.println("");
		
		//get user inputs
		Scanner scanner=new Scanner(System.in);
		int input=scanner.nextInt();
		switch(input){
		case 1:
			Student student=new Student("test","test",123456789);
			student.print();
			break;
		case 2:
			Admin admin=new Admin("test","test",123456789);
			admin.print();
			break;
		case 3:
			Advisor advisor=new Advisor("test","test",123456789);
			advisor.print();
			break;
		}
	}
	public static void test(){
		eAdvisor eadvisor=new eAdvisor();
		eadvisor.print();
	}
	public static void main(String[] args) throws FileNotFoundException{
		eAdvisor.test();
	} 
}


