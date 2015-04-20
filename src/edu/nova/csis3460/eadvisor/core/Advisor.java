/*
 * File:        Advisor.java  
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
 * 				Added Package and edited code to inherit from User. Also updated 
 * 				datamembers. (Christopher Yowell - 04/19) v3.0
 *
 * (c) Copyright 2015 All rights reserved.
 *
 */

package edu.nova.csis3460.eadvisor.core;

import java.util.Scanner;

public class Advisor extends User {
	public String[] usernames = new String[2];
	public String[] passwords = new String[2];

	Advisor() {}
	public Advisor(String firstName, String lastName, String novaId){
		this.firstName = firstName;
		this.lastName = lastName;
		this.novaId = novaId;	
		usernames[0] = "advisor";
		passwords[0] = "password";
	}
	public void print(){

		System.out.println("-------------------------------");
		System.out.println("         Advisor Menu");
		System.out.println();
		System.out.print("Username: ");
		Scanner scanner = new Scanner(System.in);
		String userName = scanner.next();
		System.out.print("Password: ");
		String password = scanner.next();
		System.out.println("-------------------------------");
		System.out.println();

		boolean isUsernameValid = false;
		boolean isPasswordValid = false;

		for (String temp : usernames) {
			if (temp.equals(userName) && userName.equals("advisor")) {
				isUsernameValid = true;
			}
		}
		for (String temp : passwords) {
			if (temp.equals(password) && password.equals("password")) {
				isPasswordValid = true;
			}
		}

		if (isUsernameValid && isPasswordValid) {
			System.out.println("-------------------------------");
			System.out.println("      Welcome Advisor!");
			System.out.println();
			System.out.println("1. Under Construction");
			System.out.println("2. Under Construction");
			System.out.println("3. Under Construction");
			System.out.println("4. Log Out");
			System.out.println("-------------------------------");
			System.out.println();

			int input = scanner.nextInt();
			switch (input) {
			case 1:
				System.out.println("Under Contruction. Try again later.");
				break;
			case 2:
				System.out.println("Under Contruction. Try again later.");
				break;
			case 3:
				System.out.println("Under Contruction. Try again later.");
				break;
			case 4:
				eAdvisor eadvisor=new eAdvisor();
				eadvisor.print();
				break;
			}
		}
	}
	public static void test(){
		Advisor advisor=new Advisor();
		advisor.print();
	}

	public static void main(String[] args){
		Advisor.test();
	}
}