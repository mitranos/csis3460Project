package edu.nova.csis3460.eadvisor.main;

import java.util.*;
import java.io.*;

import edu.nova.csis3460.eadvisor.courses.*;


public class Data {
	
	private BufferedReader bf;

	public List<Course> readFile(){
		ArrayList<Course> courseList = new ArrayList<Course>();
		try{
			
			String course;
			bf = new BufferedReader(new FileReader("coursestxtfile.txt"));
			while((course = bf.readLine()) != null ){
				String[] tokens = course.split("[~]");
				courseList.add(new Course(tokens[2], tokens[4], tokens[0], Integer.parseInt(tokens[1]), Integer.parseInt(tokens[3]), tokens[5]));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bf.close();
			} catch (Exception e) {
				e.printStackTrace();
			}	
		}
		System.out.println("Courses from the File has been loaded.");
		return courseList;
	}
}
