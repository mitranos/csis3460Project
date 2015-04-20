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
 *
 * (c) Copyright 2015 All rights reserved.
 *
 */
package edu.nova.csis3460.eadvisor.core;

import java.util.Scanner;
import java.util.ArrayList;

public class eAdvisor {

	private ArrayList<User> users;
	//	private ArrayList<DegreeProgram> degreePrograms = new ArrayList<DegreeProgram>();
	//	private ArrayList<Course> courses = new ArrayList<Course>();

	public eAdvisor(){
		users = new ArrayList<User>();
	}

	public void addStudent(String firstName, String lastName, String novaId)
	{
		users.add(new Student(firstName,lastName,novaId));
	}

	public void addAdvisor(String firstName, String lastName, String novaId)
	{
		users.add(new Advisor(firstName,lastName,novaId));
	}

	public void addAdmin(String firstName, String lastName, String novaId)
	{
		users.add(new Admin(firstName,lastName,novaId));
	}

	/*public void addDegreeProgram(DegreeProgram degreeProgram)
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
			if (name == this.courses.get(i).getName())
			{
				this.courses.remove(i);
			}
		}
	}

	public void getDegreeNames() {

		for (int i=0; i<this.degreePrograms.size();i++)
		{
			System.out.println(this.degreePrograms.get(i).getName());
		}

	}

	public DegreeProgram searchDegree(String name) {
		DegreeProgram dp= new DegreeProgram();
		for (int i=0; i<this.degreePrograms.size();i++)
		{
			if (name == this.degreePrograms.get(i).getName())
			{
				dp= this.degreePrograms.get(i);
			}
		}
		return dp;
	}

	public Course getCourse(String CRN)
	{
		Course course= new Course();
		for (int i=0; i<this.courses.size();i++)
		{
			if (CRN == this.courses.get(i).getCRN())
			{
				course= this.courses.get(i);
			}
		}
		return course;
	}

	public getCourseOffering(String name)
	{
		CourseOffering co= new CourseOffering();
		for (int i=0; i<this.courses.size();i++)
		{
			if (this.courses.get(i).getName() == name)
			{
				co= this.courses.get(i).getCourseOffering();
			}
		return co;
	}
	 */

	public void print(){

		System.out.println("-------------------------------");
		System.out.println("        eAdvisor Program       ");
		System.out.println();
		System.out.println("1. Student");
		System.out.println("2. Administrator");
		System.out.println("3. Advisor");
		System.out.println("4. Exit");
		System.out.println("-------------------------------");

		Scanner scanner=new Scanner(System.in);
		int input=scanner.nextInt();
		switch(input){
		case 1:
			Student student=new Student();
			student.print();
			break;
		case 2:
			Admin admin=new Admin();
			admin.print();
			break;
		case 3:
			Advisor advisor=new Advisor();
			advisor.print();
			break;
		}
	}

	public static void test(){
		eAdvisor eadvisor=new eAdvisor();
		eadvisor.print();

	}

	public static void main(String[] args){
		eAdvisor.test();
	} 
}

