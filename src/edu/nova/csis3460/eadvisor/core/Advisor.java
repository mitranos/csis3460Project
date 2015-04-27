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
 * 				Verified and confirmed that variables match. (Evelyn Comrie - 
 * 				04/25) v4.0
 * 				Updated login process for testing purposes (Nicky Alvarez - 04/26) v6.0
 *
 * (c) Copyright 2015 All rights reserved.
 *
 */

package edu.nova.csis3460.eadvisor.core;

import java.util.Scanner;

public class Advisor extends User{

   
   public Advisor(String firstName, String lastName, int nsuId) {
		super(firstName, lastName, nsuId);
	}

public void print(){
 
			System.out.println("-------------------------------");
			System.out.println("-------------------------------");
			System.out.println("");
			System.out.println("      Welcome Advisor!");
			System.out.println();
			System.out.println("1. Under Construction");
			System.out.println("2. Under Construction");
			System.out.println("3. Under Construction");
			System.out.println("4. Log Out");
			System.out.println("");
			System.out.println("-------------------------------");
			System.out.println("-------------------------------");
			System.out.println("");

			Scanner scanner = new Scanner(System.in);
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

	public static void test(){
		Advisor advisor=new Advisor("test","test",123456789);
		advisor.print();
	}

	//public static void main(String[] args){
	//        Advisor.test();
	//}
}