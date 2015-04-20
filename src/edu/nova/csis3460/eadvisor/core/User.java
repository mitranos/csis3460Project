/*
 * File:        User.java  
 *
 * Project:     eAdvisor Final Project
 * Company:     Nova Southeastern University
 * Supervisor:  Rajput Saeed
 *
 * Author:      Nicky Alvarez, Evelyn Comrie, Maron Benincasa, Ali Hussein, 
 * 				and Christopher Yowell
 * History:     Created 4/16/2015
 * Assisted by: Team 3 Participants and Team Leaders
 * Updates:     Initial Template (Nicky Alvarez - 04/16) v1.0
 * 				Updated and Created Working User Class (Ali Hussein - 04/18) v2.0
 * 				Added Package and updated datamembers. (Christopher Yowell - 04/19) v3.0
 *
 * (c) Copyright 2015 All rights reserved.
 *
 */

package edu.nova.csis3460.eadvisor.core;

public class User {

	protected String firstName;
	protected String lastName;
	protected String novaId;

	public User(){
		
	}
	
	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

