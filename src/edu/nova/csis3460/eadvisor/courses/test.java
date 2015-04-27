package edu.nova.csis3460.eadvisor.courses;

import edu.nova.csis3460.eadvisor.core.Student;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course course1 = new Course("Calculus", "Average level math course", "MATH", 203550, 3, "To get good at Math, duh!");
		Course course2 = new Course("Software Modeling", "Software Engineering Course", "SENG", 203551, 3, "Design Software Implementation");
		Course course3 = new Course("Professional Writing", "Writing Course", "WRIT", 203552, 3, "To get good at writing letters!");
		Course course4 = new Course("Programming 1", "Beginner level programming course", "CSIS", 203553, 3, "Write if statements all day!");
		Course course5 = new Course("Human Computer Interaction", "High Level Tech Course", "TECH", 203554, 3, "Create Johnny 5!");
		
		StudentCourse studentCourse1 = new StudentCourse(course1, course1.getPrefix(), "Winter 2015", 'C', course1.getCourseNumber());
		StudentCourse studentCourse2 = new StudentCourse(course2, course2.getPrefix(), "Winter 2015", 'A', course2.getCourseNumber());
		StudentCourse studentCourse3 = new StudentCourse(course3, course3.getPrefix(), "Winter 2015", 'A', course3.getCourseNumber());
		StudentCourse studentCourse4 = new StudentCourse(course4, course4.getPrefix(), "Winter 2015", 'B', course4.getCourseNumber());
		StudentCourse studentCourse5 = new StudentCourse(course5, course5.getPrefix(), "Winter 2015", 'B', course5.getCourseNumber());
		
		Student stu1 = new Student("Chad", "Stewart", "N01234567");		
		StudentCourseHistory studentCourseHistory1 = new StudentCourseHistory(stu1);		
		studentCourseHistory1.addCourseToHistory(studentCourse1);
		studentCourseHistory1.addCourseToHistory(studentCourse2);
		studentCourseHistory1.addCourseToHistory(studentCourse3);
		studentCourseHistory1.print();
		studentCourseHistory1.removeCoursesWithPrefixAndCourseNumber("MATH", 203550);
		studentCourseHistory1.print();
		
		Student stu2 = new Student("Alec", "Torres", "N0blahblahblah");
		StudentCourseHistory studentCourseHistory2 = new StudentCourseHistory(stu2);
		studentCourseHistory2.addCourseToHistory(studentCourse2);
		studentCourseHistory2.addCourseToHistory(studentCourse4);
		studentCourseHistory2.addCourseToHistory(studentCourse5);
		studentCourseHistory1.print();
		
		CourseOffering courseOffering = new CourseOffering();
		courseOffering.test();
		
	}

}
