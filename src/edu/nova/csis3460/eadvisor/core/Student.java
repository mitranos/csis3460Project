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
 *
 * (c) Copyright 2015 All rights reserved.
 *
 */

package edu.nova.csis3460.eadvisor.core;

import java.util.Scanner;

public class Student extends User {

	public static Student studentList[] = new Student[2];

	Student() {}
	Student(String firstName, String lastName, String novaId)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.novaId = novaId;	
	}

	public void print() {

		Student student = new Student();
		student.setFirstName("John");
		student.setLastName("Smith");
		student.novaId = "N01234567";
		studentList[0] = student;

		System.out.println("-------------------------------");
		System.out.println("         Student Menu");
		System.out.println("Please provide your information below. \n"
				+ "Type 'back' to go back to the main menu \n"
				+ "or 'exit' to cancel the program.");
		System.out.println();

		System.out.print("First Name: ");
		Scanner scanner = new Scanner(System.in);
		String choice = scanner.next();

		if (choice.equals("back")) {
			eAdvisor eadvisor = new eAdvisor();
			eadvisor.print();

		} else if (choice.equals("exit")) {
			System.exit(1);
		} else {
			boolean correct = false;
			for (int i = 0; i < studentList.length; i++) {
				if (choice.equals(studentList[i].getFirstName())) {
					correct = true;
				}
			}

			if (correct) {
				System.out.print("Last Name: ");
				String lastName = scanner.next();
				System.out.print("Student ID: ");
				String studentId = scanner.next();
				System.out.println("-------------------------------");
				System.out.println("    Welcome " + choice + " " + lastName + "!");
				System.out.println();
				System.out.println("1. Create Degree Audit");
				System.out.println("2. Print Graduation Plan");
				System.out.println("3. Edit Courses");
				System.out.println("4. Log Out");
				System.out.println("-------------------------------");
				int input = scanner.nextInt();

				switch (input) {
				case 1:
					System.out.println("-------------------------------");
					System.out.println("      Degree Audit Menu");
					System.out.println();
					System.out.print("Enter Degree Name: ");
					String degreeName = scanner.next();
					break;
				case 2:
					break;
				case 3:
					System.out.println("-------------------------------");
					System.out.println("      Edit Courses Menu");
					System.out.println();
					System.out.println("1. Add");
					System.out.println("2. Delete");
					System.out.println("-------------------------------");
					int option = scanner.nextInt();
					if (option == 1) {
						System.out.println("Under Construction. Please try again later");
					} else {
						System.out.println("Under Construction. Please try again later");
					}
					break;
				case 4:
					eAdvisor eadvisor = new eAdvisor();
					eadvisor.print();
					break;
				}
			} else {
				System.out.println("Invalid Selection!!! Try Again..");
			}
		}

	}

	public static void test() {
		Student student = new Student();
		student.print();
	}
}