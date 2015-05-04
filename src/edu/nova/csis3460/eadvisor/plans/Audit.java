/** 
 * Team 4  :  Dary Cabrera, Guilio Piccinonna, Juan Caldas, Sheik Rahaman.
 * Date    :  April 20, 2015
 * Purpose :  Computes a student’s current progress in fulfilling a degree program’s requirements based on the
 *            student's course history
 */

package edu.nova.csis3460.eadvisor.plans;

import edu.nova.csis3460.eadvisor.courses.*;
import edu.nova.csis3460.eadvisor.core.*;
import edu.nova.csis3460.eadvisor.exception.*;

import java.util.*;

public class Audit {

	public Audit() {
	}

	public void print(String output)
	{
		System.out.println(output);
	}

	public static void test()
	{
		Student oneMan = new Student("John", "Peril", 90000000);
		StudentCourseHistory testStudentCourseHistory = new StudentCourseHistory(oneMan);

		/*
		 * Computer Engineering Sets of Curriculum Requirements.
		 * This is not necessary, but we do it for future reference since Requirements can be
		 * organized into groups such as this.
		 */

		ArrayList<Requirement> mathRequirementsList = new ArrayList<Requirement>();
		ArrayList<Requirement> scienceRequirementsList = new ArrayList<Requirement>();
		ArrayList<Requirement> infoTechnologyRequirementsList = new ArrayList<Requirement>();
		ArrayList<Requirement> computerScienceRequirementsList = new ArrayList<Requirement>();
		ArrayList<Requirement> computerEngineeringRequirementsList = new ArrayList<Requirement>();
		ArrayList<Requirement> electricalEngineeringRequirementsList = new ArrayList<Requirement>();

		/* Declare Computer Engineering Major Mathematics Courses */
		Course course1 = new Course("Calculus I", "Calculus is the study of math.", "MATH", 2100, 4, "outcomes");
		Course course2 = new Course("Calculus II", "Calculus is the study of math.", "MATH", 2200, 4, "outcomes");
		Course course3 = new Course("Introductory To Linear Algebra", "Algebra is the study of math.", "MATH", 3300, 3, "outcomes");
		Course course4 = new Course("Ordinary Differential Equations", "ODE is the study of R&J math.", "MATH", 3400, 3, "outcomes");
		Course course5 = new Course("Probability and Statistics", "Stats is the study of math.", "MATH", 4500, 3, "outcomes");

		StudentCourse studentCourse1 = new StudentCourse(course1, "DA1", "201020", 'A', 12345);
		StudentCourse studentCourse2 = new StudentCourse(course2, "DA1", "201130", 'A', 12345);
		StudentCourse studentCourse3 = new StudentCourse(course3, "DA1", "201130", 'A', 12345);

		testStudentCourseHistory.addCourseToHistory(studentCourse1);
		testStudentCourseHistory.addCourseToHistory(studentCourse2);
		testStudentCourseHistory.addCourseToHistory(studentCourse3);

		Requirement requirements1 = new Requirement(course1);
		Requirement requirements2 = new Requirement(course2);
		Requirement requirements3 = new Requirement(course3);
		Requirement requirements4 = new Requirement(course4);
		Requirement requirements5 = new Requirement(course5);

		mathRequirementsList.add(requirements1);
		mathRequirementsList.add(requirements2);
		mathRequirementsList.add(requirements3);
		mathRequirementsList.add(requirements4);
		mathRequirementsList.add(requirements5);

		/* Declare Computer Engineering Major Science Courses */
		Course course6 = new Course("Organic Chemistry II/Lab", "Organic Chemistry is Bane of Pre-Med Students.", "CHEM", 2410, 4, "outcomes");
		Course course7 = new Course("Physics I/Lab", "Physics is easy when Armentrout teaches it.", "PHYS", 2400, 4, "outcomes");
		Course course8 = new Course("Physics II/Lab", "A course designed to strike down Physics I victors.", "PHYS", 2500, 3, "outcomes");

		StudentCourse studentCourse6 = new StudentCourse(course6, "DA1", "201020", 'B', 12345);
		StudentCourse studentCourse7 = new StudentCourse(course7, "DA1", "201130", 'A', 12345);

		testStudentCourseHistory.addCourseToHistory(studentCourse6);
		testStudentCourseHistory.addCourseToHistory(studentCourse7);

		Requirement requirements6 = new Requirement(course6);
		Requirement requirements7 = new Requirement(course7);
		Requirement requirements8 = new Requirement(course8);

		scienceRequirementsList.add(requirements6);
		scienceRequirementsList.add(requirements7);
		scienceRequirementsList.add(requirements8);

		/* Declare Computer Engineering Major Information Technology Courses */
 		Course course9 = new Course("Human Computer Interaction", "A class where the students expel gas and play games.", "TECH", 4350, 3, "outcomes");

		Requirement requirements9 = new Requirement(course9);

		infoTechnologyRequirementsList.add(requirements9);

		/* Declare Computer Engineering Major Computer Science Courses */
		Course course10 = new Course("Information to Computer Information Sciences", "An introduction to what computers are.", "CSIS", 1800, 3, "outcomes");
		Course course11 = new Course("Discrete Mathematics", "The course you always hear fellow collegues struggling with.", "CSIS", 2050, 3, "outcomes");
		Course course12 = new Course("Fundamentals of Computer Programming", "Who cares about C++ when you have Java?", "CSIS", 2101, 4, "outcomes");
		Course course13 = new Course("Assemblers and Assembly Language", "Where your procrastination is your doom.", "CSIS", 3050, 4, "outcomes");
		Course course14 = new Course("Advanced Computer Programming", "Programming II, but with a pretty title.", "CSIS", 3101, 4, "outcomes");
		Course course15 = new Course("Data Structures", "Last in, First Out.", "CSIS", 3400, 4, "outcomes");
		Course course16 = new Course("Object Oriented Design", "What is the Object-Oriented way to get rich? Inheritance", "CSIS", 3460, 4, "outcomes");
		Course course17 = new Course("Networks and Data Communications", "Learn to talk the Talk.", "CSIS", 3460, 4, "outcomes");
		Course course18 = new Course("Software Engineering", "Agile programming for all.", "CSIS", 3750, 4, "outcomes");
		Course course19 = new Course("Operating Systems Concepts", "Be forced to learn some C off the bat.", "CSIS", 3810, 3, "outcomes");
		Course course20 = new Course("Computer Architecture", "Decades of work summarized in one course.", "CSIS", 4050, 3, "outcomes");

		StudentCourse studentCourse10 = new StudentCourse(course10, "DA1", "201020", 'A', 12345);
		StudentCourse studentCourse11 = new StudentCourse(course11, "DA1", "201130", 'A', 12345);
		StudentCourse studentCourse12 = new StudentCourse(course12, "DA1", "201120", 'A', 12345);
		StudentCourse studentCourse13 = new StudentCourse(course13, "DA1", "201230", 'D', 12345);
		StudentCourse studentCourse14 = new StudentCourse(course14, "DA1", "201230", 'A', 12345);

		testStudentCourseHistory.addCourseToHistory(studentCourse10);
		testStudentCourseHistory.addCourseToHistory(studentCourse11);
		testStudentCourseHistory.addCourseToHistory(studentCourse12);
		testStudentCourseHistory.addCourseToHistory(studentCourse13);
		testStudentCourseHistory.addCourseToHistory(studentCourse14);

		Requirement requirements10 = new Requirement(course10);
		Requirement requirements11 = new Requirement(course11);
		Requirement requirements12 = new Requirement(course12);
		Requirement requirements13 = new Requirement(course13);
		Requirement requirements14 = new Requirement(course14);
		Requirement requirements15 = new Requirement(course15);
		Requirement requirements16 = new Requirement(course16);
		Requirement requirements17 = new Requirement(course17);
		Requirement requirements18 = new Requirement(course18);
		Requirement requirements19 = new Requirement(course19);
		Requirement requirements20 = new Requirement(course20);

		computerScienceRequirementsList.add(requirements10);
		computerScienceRequirementsList.add(requirements11);
		computerScienceRequirementsList.add(requirements12);
		computerScienceRequirementsList.add(requirements13);
		computerScienceRequirementsList.add(requirements14);
		computerScienceRequirementsList.add(requirements15);
		computerScienceRequirementsList.add(requirements16);
		computerScienceRequirementsList.add(requirements17);
		computerScienceRequirementsList.add(requirements18);
		computerScienceRequirementsList.add(requirements19);
		computerScienceRequirementsList.add(requirements20);

		/* Declare Computer Engineering Major Computer Engineering Courses */
		Course course21 = new Course("Digital Logic/Lab", "Do not let the course number fool ya.", "CENG", 1600, 3, "outcomes");
		Course course22 = new Course("Computer Systems Engineering", "Last but not least, I think.", "CENG", 3720, 3, "outcomes");
		Course course23 = new Course("Embedded Systems", "Arrrmadillos.", "CENG", 4710, 4, "outcomes");
		Course course24 = new Course("Very Large Scale Integration", "Too large for one class.", "CENG", 4750, 4, "outcomes");
		Course course25 = new Course("Senior Capstone Design", "Oh Booger.", "CENG", 4900, 4, "outcomes");
		Course course26 = new Course("Engineering Ethics Seminar", "1 Credit Son.", "CENG", 4910, 1, "outcomes");

		StudentCourse studentCourse21 = new StudentCourse(course21, "DA1", "201120", 'A', 12345);

		testStudentCourseHistory.addCourseToHistory(studentCourse21);

		Requirement requirements21 = new Requirement(course21);
		Requirement requirements22 = new Requirement(course22);
		Requirement requirements23 = new Requirement(course23);
		Requirement requirements24 = new Requirement(course24);
		Requirement requirements25 = new Requirement(course25);
		Requirement requirements26 = new Requirement(course26);

		computerEngineeringRequirementsList.add(requirements21);
		computerEngineeringRequirementsList.add(requirements22);
		computerEngineeringRequirementsList.add(requirements23);
		computerEngineeringRequirementsList.add(requirements24);
		computerEngineeringRequirementsList.add(requirements25);
		computerEngineeringRequirementsList.add(requirements26);

		/* Declare Computer Engineering Major Electrical Engineering Courses */
		Course course27 = new Course("Electrical Circuits/Lab", "Resistors, Capacitors, Inductors.", "EENG", 2710, 4, "outcomes");
		Course course28 = new Course("Signals and Systems", "A Course designed for the mental masochist.", "EENG", 3310, 3, "outcomes");
		Course course29 = new Course("Electronic Circuits/Lab", "Diodes, Transisors, Op Amps.", "EENG", 3710, 4, "outcomes"); 

		StudentCourse studentCourse27 = new StudentCourse(course27, "DA1", "201220", 'A', 12345); 
		testStudentCourseHistory.addCourseToHistory(studentCourse27);

		Requirement requirements27 = new Requirement(course27);
		Requirement requirements28 = new Requirement(course28);
		Requirement requirements29 = new Requirement(course29);

		electricalEngineeringRequirementsList.add(requirements27);
		electricalEngineeringRequirementsList.add(requirements28);
		electricalEngineeringRequirementsList.add(requirements29);

		/*
		 * Add the Computer Engineering Sets of Curriculum Requirements to the
		 * Degree Requirements List.
		 */

		DegreeRequirements degreeRequirements = new DegreeRequirements();

		degreeRequirements.getDegreeRequirements().addAll(mathRequirementsList);
		degreeRequirements.getDegreeRequirements().addAll(scienceRequirementsList);
		degreeRequirements.getDegreeRequirements().addAll(infoTechnologyRequirementsList);
		degreeRequirements.getDegreeRequirements().addAll(computerScienceRequirementsList);
		degreeRequirements.getDegreeRequirements().addAll(computerEngineeringRequirementsList);
		degreeRequirements.getDegreeRequirements().addAll(electricalEngineeringRequirementsList);

		/* Add all Student Courses to a StudentCourse ArrayList. */
		ArrayList<StudentCourse> testCourseHistoryList = new ArrayList<StudentCourse>( testStudentCourseHistory.getEntireHistory());
		String auditString;

		/*
		 * Call the printAuditCheck Method, which also invokes the getAuditCheck
		 * Method.
		 */

		Audit audit = new Audit();
		auditString = audit.printAuditCheck(degreeRequirements, testCourseHistoryList);

		audit.print("\n----- Computer Engineering Degree Audit Pending Requirements -----\n");
		audit.print("Student: " + oneMan.getFirstName() + " " + oneMan.getLastName());
		audit.print("NSU ID: " + oneMan.getnsuId() + "\n\n");
		audit.print(auditString);
	}

	public static void main(String[] args)
	{
		//Audit.test();
	}

	/*
	 * We ought to pass a Degree Program object to getAuditCheck and inside that
	 * object would be the a Degree Requirements object. Instead
	 * degreeRequirements are passed adhering to the Static Design Diagram.
	 */

	public DegreeRequirements getAuditCheck( DegreeRequirements degreeRequirements, ArrayList<StudentCourse> courseHistoryList)
			throws EAdvisorException {
		/*
		 * if the degreeRequirements list is empty throw the appropriate
		 * exception.
		 */

		if (degreeRequirements.getDegreeRequirements().isEmpty())
			throw new EmptyDegreeRequirementsException();

		/*
		 * If the student has no course history we just return the entire
		 * degreeRequirements list, which remains completely unfulfilled.
		 */

		if (courseHistoryList.isEmpty())
			return degreeRequirements;

		DegreeRequirements unmetDegreeRequirements = new DegreeRequirements();

		/* Assume a requirement is only one course for now. */
		Requirement tempDegreeRequirement = null;
		StudentCourse studentCourse;

		/* Assume the degree requirement is met until proven otherwise. */
		degreeRequirements.setIsMet(true);

		/* Go through the Degree Requirement Array list one by one */
		for ( Iterator<Requirement> degreeRequirementIterator = degreeRequirements.getDegreeRequirements().iterator(); degreeRequirementIterator.hasNext(); )
		{
			tempDegreeRequirement = degreeRequirementIterator.next();

			/*
			 * Search the Student's Course History to find a course that meets
			 * the requirement. Assume the requirement is not met until proven
			 * otherwise.
			 */

			tempDegreeRequirement.setIsMet(false);

			for ( Iterator<StudentCourse> studentCourseIterator = courseHistoryList.iterator(); studentCourseIterator.hasNext(); )
			{
				studentCourse = studentCourseIterator.next();

				/**
				 * For comparison we are going to use equal comparisons on the
				 * course's object in StudentCourseHistory and the course in the
				 * Degree Requirement. If the objects are equal and the grade
				 * the student received for the course is a greater than a 'D'
				 * implying the student received an A, B or C, in the course and
				 * thereby passed, then the requirement is met. One unforeseen
				 * complication with OR courses in Requirements is that when
				 * making a graduation plan for the student...You have to pick
				 * only one course in the OR group. AND course groups in a
				 * requirement do not have that complication.
				 */

				if ( studentCourse.getCourse().equals( tempDegreeRequirement.getCourse())
						&& studentCourse.getGrade() < 'D' )
				{
					tempDegreeRequirement.setIsMet(true);
				}
			}

			/*
			 * If any Course in the list of Requirements pertaining to a
			 * DegreeRequirement is unsatisfied mark the DegreeRequirements as
			 * NOT met.
			 */

			if ( tempDegreeRequirement.getIsMet() == false )
			{
				degreeRequirements.setIsMet(false);
				unmetDegreeRequirements.getDegreeRequirements().add( tempDegreeRequirement);
			}
		}

		return unmetDegreeRequirements;
	}

	/*
	 * Method to build an Audit String
	 */

	public String printAuditCheck(DegreeRequirements degreeRequirements, ArrayList<StudentCourse> courseHistoryList)
	{
		DegreeRequirements unmetDegreeRequirements;

		try
		{
			unmetDegreeRequirements = getAuditCheck(degreeRequirements, courseHistoryList);
		} catch (EAdvisorException e)
		{
			System.out.println(e.getErrorMessage());
			return null;
		}

		StringBuilder auditStringBuild = new StringBuilder();

		/* Assume a requirement is only one course for now. */
		Requirement tempDegreeRequirement;

		/* Go through the Degree Requirement Array list one by one */
		for ( Iterator<Requirement> degreeRequirementIterator = unmetDegreeRequirements.degreeRequirements.iterator(); degreeRequirementIterator.hasNext(); )
		{
			tempDegreeRequirement = degreeRequirementIterator.next();
			auditStringBuild.append(courseToString(tempDegreeRequirement.getCourse()));
		}

		return auditStringBuild.toString();
	}

	/*
	 * Method to print a course as listed in a Curriculum list.
	 */

	private String courseToString(Course course)
	{
		return course.getPrefix() + " " + course.getCourseNumber() + " : " + course.getTitle()
			   + " (" + course.getCredits() + " credits)\n";
	}
}