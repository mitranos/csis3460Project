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
 * 				Verified and confirmed that variables match. (Evelyn Comrie - 04/25) v4.0
 *
 * (c) Copyright 2015 All rights reserved.
 *
 */

package edu.nova.csis3460.eadvisor.core;

public class User {

	protected String firstName;
	protected String lastName;
	protected int nsuId;

	public User(String firstName, String lastName, int nsuId){
		this.firstName = firstName;
		this.lastName = lastName;
		this.nsuId = nsuId;
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

	public int getnsuId() {
		return nsuId;
	}

	public void setnsuID(int nsuId) {
		this.nsuId = nsuId;
	}

	public static void test() {
		User user = new User("test","test",123456789);
	}

	//public static void main(String[] args) {
	//	User.test();
	//}

}

