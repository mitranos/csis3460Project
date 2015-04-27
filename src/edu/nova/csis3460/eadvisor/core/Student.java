/*
 * File:        Student.java  
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
 * 				Edited and Corrected Minor Function Errors (Evelyn Comrie - 04/18) v2.0
 * 				Added Constructor and Deleted Name Variables - Now Inherited from 
 * 				User Class (Ali Hussein - 04/18) v3.0
 * 				Added Package and edited code to inherit from User. Also updated 
 * 				datamembers. (Christopher Yowell - 04/19) v4.0
 * 				Added getCourseHistory() to class as requested by Team 1 and Verified and 
 * 				confirmed that variables match. (Evelyn Comrie - 04/25) v5.0
 * 				Updated login process for testing purposes (Nicky Alvarez - 04/26) v6.0
 * 				Removed array list and updated (Christopher Yowell - 04/27) v7.0
 * 				Added save to txt method for two of the options. (Nicky Alvarez - 04/27) v8.0
 *
 * (c) Copyright 2015 All rights reserved.
 *
 */

//package edu.nova.csis3460.eadvisor.core;

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import edu.nova.csis3460.eadvisor.courses.StudentCourseHistory;
import edu.nova.csis3460.eadvisor.plans.Audit;
import edu.nova.csis3460.eadvisor.plans.GraduationPlan;

public class Student extends User{
	
	GraduationPlan printGradPlan = new GraduationPlan();
	Audit printAuditCheck = new Audit();

	public Student(String firstName, String lastName, int nsuId) {
		super(firstName, lastName, nsuId);
	}

	public StudentCourseHistory getCourseHistory() {
		StudentCourseHistory history = new StudentCourseHistory(this);
	return history;
    }

	public void print() {

		//main menu for the student
		System.out.println();
		System.out.println("           Student Menu");
		System.out.println("");
		System.out.println("Please provide your information below. \n"
				+ "Type 'back' to go back to the main menu \n"
				+ "or 'exit' to cancel the program.");
		System.out.println("");
		System.out.print("First Name: ");
		Scanner scanner = new Scanner(System.in);
		String choice = scanner.next();

		//checking the input and go back to main menu
		if (choice.equals("back")) {
			eAdvisor eadvisor = new eAdvisor();
			eadvisor.print();
			//exit according to user input
		} else if (choice.equals("exit")) {
			System.exit(1);
		}
		System.out.print("Last Name: ");
		String lastName = scanner.next();
		System.out.print("Student ID: ");
		String nsuId = scanner.next();
		System.out.println("");

		//print welcome message
		System.out.println("-------------------------------");
		System.out.println("-------------------------------");
		System.out.println("");
		System.out.println(" Welcome " + choice + "!");
		System.out.println("");
		System.out.println("1.Create Degree Audit");
		System.out.println("2.Print Graduation Plan");
		System.out.println("3.Edit Courses");
		System.out.println("4.Log Out");
		System.out.println("");
		System.out.println("-------------------------------");
		System.out.println("-------------------------------");
		System.out.println("");
		int input = scanner.nextInt();

		//degree audit menu
		switch (input) {
		case 1:
			System.out.println("");
			System.out.println("      Degree Audit Menu");
			System.out.println("");
			System.out.print("Enter Degree Name: ");
			String degreeName = scanner.next();
			System.out.println("");
			
			//Audit.printAuditCheck(degreeName);
			
			try {
			 
			String content = "This is the content to write into file";
 
			File file = new File("C:\\DegreeAudit.txt");
 
			// if file doesn't exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
 
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
 
			System.out.println("Done");
 
		} catch (IOException e) {
			e.printStackTrace();
		}
			 
			
			break;

		case 2:
			GraduationPlan.printGradPlan();
			
			 try {
 
			String content = "This is the content to write into file";
 
			File file = new File("C:\\GraduationPlan.txt");
 
			// if file doesn't exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
 
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
 
			System.out.println("Done");
 
		} catch (IOException e) {
			e.printStackTrace();
		}
			
			break;

		case 3:
			System.out.println("-------------------------------");
			System.out.println("-------------------------------");
			System.out.println("");
			System.out.println("      Edit Courses Menu");
			System.out.println("");
			System.out.println("1. Add");
			System.out.println("2. Delete");
			System.out.println("");
			System.out.println("-------------------------------");
			System.out.println("-------------------------------");
			System.out.println("");
			int option = scanner.nextInt();
			if (option == 1) {
				System.out.println("Under Construction Please try again later");
			} else {
				System.out.println("Under Construction Please try again later");
			}
			break;

		case 4:
			eAdvisor eadvisor = new eAdvisor();
			eadvisor.print();
			break;
		}
	} 

	public static void test() {
		Student student = new Student("test","test",123456789);
		student.print();
	}

	//public static void main(String[] args) {
	//	Student.test();
	//}
}