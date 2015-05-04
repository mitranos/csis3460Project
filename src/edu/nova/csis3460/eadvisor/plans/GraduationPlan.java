/** 
 * Team 4  :  Dary Cabrera, Guilio Piccinonna, Juan Caldas, Sheik Rahaman.
 * Date    :  April 20, 2015
 * Purpose :  Uses the results from a Degree Audit and available Course Offerings to calculate a Graduation Plan for the Student.
 */

package edu.nova.csis3460.eadvisor.plans;

import edu.nova.csis3460.eadvisor.courses.*;
import edu.nova.csis3460.eadvisor.core.Student;

import java.util.*;

public class GraduationPlan {

    private ArrayList<Course> all = new ArrayList<Course>();
    
    public GraduationPlan() {
    }

    public GraduationPlan(DegreeRequirements unmetDegreeRequirements )
    {
    	copy(unmetDegreeRequirements);
    } 
    
    public void copy(DegreeRequirements unmetDegreeRequirements)
    {
    	Requirement tempDegreeRequirement;

        /* Go through the Degree Requirement Array list one by one */
        for ( Iterator<Requirement> degreeRequirementIterator = unmetDegreeRequirements.getDegreeRequirements().iterator(); degreeRequirementIterator.hasNext(); )
    		{
    			tempDegreeRequirement = degreeRequirementIterator.next();
    			all.add(tempDegreeRequirement.getCourse());
            }

    	/* Sort the list of courses by course number in ascending order. */
    	Collections.sort(all, new CourseComparatorByCourseNumber());
    }
    
    /* Comparator for sorting courses by course number in ascending order. */
    class CourseComparatorByCourseNumber implements Comparator<Course>
    {
        @Override
        public int compare(Course o1, Course o2)
        {
            return o1.getCourseNumber() - o2.getCourseNumber();
        }
    } 

	public void print(String output)
	{
		System.out.println(output);
	}

    public static void test()
    {
 		Student oneMan = new Student("John", "Peril", 90000000);
 		StudentCourseHistory testStudentCourseHistory = new StudentCourseHistory(oneMan);


 		/* Declare Computer Engineering Major Mathematics Courses */
 		Course course1 = new Course("Calculus I", "Calculus is the study of math.", "MATH", 2100, 4, "outcomes");
 		Course course2 = new Course("Calculus II", "Calculus is the study of math.", "MATH", 2200, 4, "outcomes");
 		Course course3 = new Course("Introductory To Linear Algebra", "Algebra is the study of math.", "MATH", 3300, 3, "outcomes");
 		Course course4 = new Course("Ordinary Differential Equations", "ODE is the study of R&J math.", "MATH", 3400, 3, "outcomes");
 		Course course5 = new Course("Probability and Statistics", "Stats is the study of math.", "MATH", 4500, 3, "outcomes");

 		StudentCourse studentCourse1 = new StudentCourse(course1, "DA1", "201620", 'A', 12345);
 		StudentCourse studentCourse2 = new StudentCourse(course2, "DA1", "201630", 'A', 12345);
 		StudentCourse studentCourse3 = new StudentCourse(course3, "DA1", "201630", 'A', 12345);

 		testStudentCourseHistory.addCourseToHistory(studentCourse1);
 		testStudentCourseHistory.addCourseToHistory(studentCourse2);
 		testStudentCourseHistory.addCourseToHistory(studentCourse3);

 		Requirement requirements1 = new Requirement(course1);
 		Requirement requirements2 = new Requirement(course2);
 		Requirement requirements3 = new Requirement(course3);
 		Requirement requirements4 = new Requirement(course4);
 		Requirement requirements5 = new Requirement(course5);

 		/* Declare Computer Engineering Major Science Courses */
 		Course course6 = new Course("Organic Chemistry II/Lab", "Organic Chemistry is Bane of Pre-Med Students.", "CHEM", 2410, 4, "outcomes");
 		Course course7 = new Course("Physics I/Lab", "Physics is easy when Armentrout teaches it.", "PHYS", 2400, 4, "outcomes");
 		Course course8 = new Course("Physics II/Lab", "A course designed to strike down Physics I victors.", "PHYS", 2500, 3, "outcomes");

 		StudentCourse studentCourse6 = new StudentCourse(course6, "DA1", "201620", 'B', 12345);
 		StudentCourse studentCourse7 = new StudentCourse(course7, "DA1", "201630", 'A', 12345);

 		testStudentCourseHistory.addCourseToHistory(studentCourse6);
 		testStudentCourseHistory.addCourseToHistory(studentCourse7);

 		Requirement requirements6 = new Requirement(course6);
 		Requirement requirements7 = new Requirement(course7);
 		Requirement requirements8 = new Requirement(course8);

 		/* Declare Computer Engineering Major Information Technology Courses */
 		Course course9 = new Course("Human Computer Interaction", "A class where the students expel gas and play games.", "TECH", 4350, 3, "outcomes");

 		Requirement requirements9 = new Requirement(course9);


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

 		StudentCourse studentCourse10 = new StudentCourse(course10, "DA1", "201620", 'A', 12345);
 		StudentCourse studentCourse11 = new StudentCourse(course11, "DA1", "201630", 'A', 12345);
 		StudentCourse studentCourse12 = new StudentCourse(course12, "DA1", "201620", 'A', 12345);
 		StudentCourse studentCourse13 = new StudentCourse(course13, "DA1", "201630", 'D', 12345);
 		StudentCourse studentCourse14 = new StudentCourse(course14, "DA1", "201630", 'A', 12345);

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


 		/* Declare Computer Engineering Major Computer Engineering Courses */
 		Course course21 = new Course("Digital Logic/Lab", "Do not let the course number fool ya.", "CENG", 1600, 3, "outcomes");
 		Course course22 = new Course("Computer Systems Engineering", "Last but not least, I think.", "CENG", 3720, 3, "outcomes");
 		Course course23 = new Course("Embedded Systems", "Arrrmadillos.", "CENG", 4710, 4, "outcomes");
 		Course course24 = new Course("Very Large Scale Integration", "Too large for one class.", "CENG", 4750, 4, "outcomes");
 		Course course25 = new Course("Senior Capstone Design", "Oh Booger.", "CENG", 4900, 4, "outcomes");
 		Course course26 = new Course("Engineering Ethics Seminar", "1 Credit Son.", "CENG", 4910, 1, "outcomes");

 		StudentCourse studentCourse21 = new StudentCourse(course21, "DA1", "201620", 'A', 12345);

 		testStudentCourseHistory.addCourseToHistory(studentCourse21);

 		Requirement requirements21 = new Requirement(course21);
 		Requirement requirements22 = new Requirement(course22);
 		Requirement requirements23 = new Requirement(course23);
 		Requirement requirements24 = new Requirement(course24);
 		Requirement requirements25 = new Requirement(course25);
 		Requirement requirements26 = new Requirement(course26);


 		/* Declare Computer Engineering Major Electrical Engineering Courses */
 		Course course27 = new Course("Electrical Circuits/Lab", "Resistors, Capacitors, Inductors.", "EENG", 2710, 4, "outcomes");
 		Course course28 = new Course("Signals and Systems", "A Course designed for the mental masochist.", "EENG", 3310, 3, "outcomes");
 		Course course29 = new Course("Electronic Circuits/Lab", "Diodes, Transisors, Op Amps.", "EENG", 3710, 4, "outcomes"); 

 		StudentCourse studentCourse27 = new StudentCourse(course27, "DA1", "201620", 'A', 12345); 
 		testStudentCourseHistory.addCourseToHistory(studentCourse27);

 		Requirement requirements27 = new Requirement(course27);
 		Requirement requirements28 = new Requirement(course28);
 		Requirement requirements29 = new Requirement(course29);


 		/*
 		 * Add all Computer Engineering Curriculum Requirements to the Degree Requirements List.
 		 */

		DegreeRequirements degreeRequirements = new DegreeRequirements();

 		degreeRequirements.getDegreeRequirements().add(requirements1);
 		degreeRequirements.getDegreeRequirements().add(requirements2);
 		degreeRequirements.getDegreeRequirements().add(requirements3);
 		degreeRequirements.getDegreeRequirements().add(requirements4);
 		degreeRequirements.getDegreeRequirements().add(requirements5);
 		degreeRequirements.getDegreeRequirements().add(requirements6);
 		degreeRequirements.getDegreeRequirements().add(requirements7);
 		degreeRequirements.getDegreeRequirements().add(requirements8);
 		degreeRequirements.getDegreeRequirements().add(requirements9);
 		degreeRequirements.getDegreeRequirements().add(requirements10);
 		degreeRequirements.getDegreeRequirements().add(requirements11);
 		degreeRequirements.getDegreeRequirements().add(requirements12);
 		degreeRequirements.getDegreeRequirements().add(requirements13);
 		degreeRequirements.getDegreeRequirements().add(requirements14);
 		degreeRequirements.getDegreeRequirements().add(requirements15);
 		degreeRequirements.getDegreeRequirements().add(requirements16);
 		degreeRequirements.getDegreeRequirements().add(requirements17);
 		degreeRequirements.getDegreeRequirements().add(requirements18);
 		degreeRequirements.getDegreeRequirements().add(requirements19);
 		degreeRequirements.getDegreeRequirements().add(requirements20);
 		degreeRequirements.getDegreeRequirements().add(requirements21);
 		degreeRequirements.getDegreeRequirements().add(requirements22);
 		degreeRequirements.getDegreeRequirements().add(requirements23);
 		degreeRequirements.getDegreeRequirements().add(requirements24);
 		degreeRequirements.getDegreeRequirements().add(requirements25);
 		degreeRequirements.getDegreeRequirements().add(requirements26);
 		degreeRequirements.getDegreeRequirements().add(requirements27);
 		degreeRequirements.getDegreeRequirements().add(requirements28);
 		degreeRequirements.getDegreeRequirements().add(requirements29);


        /* Establish Arbitrary Semester codes */
		AvailableSlot slot1 = new AvailableSlot( 201530 );
    	AvailableSlot slot2 = new AvailableSlot( 201550 );
    	AvailableSlot slot3 = new AvailableSlot( 201520 );
    	AvailableSlot slot4 = new AvailableSlot( 201630 );
    	AvailableSlot slot5 = new AvailableSlot( 201650 );
    	AvailableSlot slot6 = new AvailableSlot( 201620 );
    	AvailableSlot slot7 = new AvailableSlot( 201730 );
    	AvailableSlot slot8 = new AvailableSlot( 201750 );
    	AvailableSlot slot9 = new AvailableSlot( 201720 );
    	AvailableSlot slot10 = new AvailableSlot( 201830 );
    	AvailableSlot slot11 = new AvailableSlot( 201850 );
    	AvailableSlot slot12 = new AvailableSlot( 201820 );
    	AvailableSlot slot13 = new AvailableSlot( 201930 );
    	AvailableSlot slot14 = new AvailableSlot( 201950 );
    	AvailableSlot slot15 = new AvailableSlot( 201920 );
    	AvailableSlot slot16 = new AvailableSlot( 202030 );
    	AvailableSlot slot17 = new AvailableSlot( 202050 );
    	AvailableSlot slot18 = new AvailableSlot( 202020 );
    	AvailableSlot slot19 = new AvailableSlot( 202130 );
    	AvailableSlot slot20 = new AvailableSlot( 202150 );
    	AvailableSlot slot21 = new AvailableSlot( 202120 );
    	

    	/* Add all Semester Code Slots to an ArrayList. */

    	ArrayList<AvailableSlot> availableSlots = new ArrayList<AvailableSlot>();

    	availableSlots.add(slot1);
    	availableSlots.add(slot2);
    	availableSlots.add(slot3);
    	availableSlots.add(slot4);
    	availableSlots.add(slot5);
    	availableSlots.add(slot6);
    	availableSlots.add(slot7);
    	availableSlots.add(slot8);
    	availableSlots.add(slot9);
    	availableSlots.add(slot10);
    	availableSlots.add(slot11);
    	availableSlots.add(slot12);
    	availableSlots.add(slot13);
    	availableSlots.add(slot14);
    	availableSlots.add(slot15);
    	availableSlots.add(slot16);
    	availableSlots.add(slot17);
    	availableSlots.add(slot18);
    	availableSlots.add(slot19);
    	availableSlots.add(slot20);
    	availableSlots.add(slot21);


		/* Add all Student Courses to a StudentCourse ArrayList. */
 		ArrayList<StudentCourse> testCourseHistoryList = new ArrayList<StudentCourse>( testStudentCourseHistory.getEntireHistory());

		Audit audit = new Audit();

 		DegreeRequirements unmetDegreeRequirements = null; 

 		/* Get the unmet Degree Requirements from the getAuditCheck Method. */
		try
		{
			unmetDegreeRequirements = audit.getAuditCheck(degreeRequirements, testCourseHistoryList);
		} catch (EAdvisorException e) {
			System.out.println(e.getErrorMessage());
			System.exit(1);
		}

        GraduationPlan graduationPlan = new GraduationPlan(unmetDegreeRequirements); 

 		graduationPlan.print("\n----- Computer Engineering Graduation Plan -----\n");
 		graduationPlan.print("Student: " + oneMan.getFirstName() + " " + oneMan.getLastName());
 		graduationPlan.print("NSU ID: " + oneMan.getnsuId() + "\n");

 		/*
 		 * Print the Graduation Plan under a criteria of an 18-credit limit per semester and only 
 		 * taking courses in only fall and winter terms, denoted by term codes 20 and 30, respectively.
 		 */

 		try
 		{
			graduationPlan.print(graduationPlan.printGradPlan(availableSlots, 18, 20, 30));
		} catch (InvalidTermCodeException e) {
			System.out.print(e.getErrorMessage());
		}
    }


    public static void main(String[] args)
    {
        //GraduationPlan.test();
    }

     
    /*
     * Uses the pending Degree Requirements list returned from a Degree Audit and searches the
     * corresponding Course's course offerings to calculate a Graduation Plan for the Student.
     * List of all possible available slots for a student to take a course is supplied as input.
     * One may specify the maximum amount of credits to take per per semester as well as
     * which semester terms to take them in.
     */
      
	public String printGradPlan( ArrayList<AvailableSlot> availableSlots, int creditLimitPerSemester, int...terms )
			throws InvalidTermCodeException
    {
    	ArrayList<AvailableSlot> slots = availableSlots;
    	ArrayList<Course> coursesWithoutOfferings = new ArrayList<Course>();

    	AvailableSlot slot;

    	Course tempCourse;
    	// CourseOffering tempCourseOffering;
    	
    	/* used to break out of two loops. */
    	boolean breakCheck;
    	
    	/* used to select semester term slots. */
    	boolean fall = false;
    	boolean summer = false;
    	boolean winter = false;

    	int i, j;

    	int numCourse;
    	int tempTermCode;

    	/* Course Offerings ARR_MAX = 50 */
    	int ARR_MAX = 50;

     	/* Define Arbitrary Future Semester codes. */
    	int availableFutureSemesters[] = new int[ARR_MAX];
		availableFutureSemesters[0] = 201530;
    	availableFutureSemesters[1] = 201550;
    	availableFutureSemesters[2] = 201520;	
    	availableFutureSemesters[3] = 201630;
    	availableFutureSemesters[4] = 201650;
    	availableFutureSemesters[5] = 201620;
    	availableFutureSemesters[6] = 201730;
    	availableFutureSemesters[7] = 201750;
    	availableFutureSemesters[8] = 201720;
    	availableFutureSemesters[9] = 201830;
    	availableFutureSemesters[10] = 201850;
    	availableFutureSemesters[11] = 201820;
    	availableFutureSemesters[12] = 201930;
    	availableFutureSemesters[13] = 201950;
    	availableFutureSemesters[14] = 201920;
    	availableFutureSemesters[15] = 202030;
    	availableFutureSemesters[16] = 202050;
    	availableFutureSemesters[17] = 202020;
    	availableFutureSemesters[18] = 202130;
    	availableFutureSemesters[19] = 202150;
    	availableFutureSemesters[20] = 202120;
    	
    	int semesterTerm;
    	int semesterYear;

    	/* get current date. */
    	// Date currentDate = new Date();
    	
    	StringBuilder gradPlanStringBuild = new StringBuilder();

    	String fallString = "Fall";
    	String summerString = "Summer";
    	String winterString = "Winter";
    	

    	for ( i = 0; i < terms.length; i++ )
    	{
    		if ( terms[i] == 20 )
    			fall = true;
    		else if( terms[i] == 30 )
    			winter = true;
    		else if( terms[i] == 50)
    			summer = true;
    		else
    			throw new InvalidTermCodeException(terms[i]);
    	}
    	

    	for ( numCourse = 0; numCourse < all.size(); numCourse++ )
    	{
    		tempCourse = all.get(numCourse);

    		/**
    		 * future offerings should return a list of available semesters for a course, but it has faulty logic that prevents it
    		 * from doing so: Null pointers.
    		 */

    		// tempCourseOffering = tempCourse.getCourseOffering();
    		// availableSemesters = tempCourseOffering.futureOfferings(currentDate, ARR_MAX);
    		
    		breakCheck = false;
    		for ( i = 0; i < availableFutureSemesters.length; i++ )
    		{
    			for ( j = 0; j < slots.size(); j++ )
    			{
    				slot = slots.get(j);
    				if ( availableFutureSemesters[i] == slot.getSemesterCode() )
    				{
    					tempTermCode = slot.getSemesterCode() % 100;

    					if ( tempTermCode == 20 && fall == true
    						|| tempTermCode == 30 && winter == true 
    						|| tempTermCode == 50 && summer == true )
    					{
                            if ( slot.getCreditCount() < creditLimitPerSemester - 3 )
                            {
                                slot.addCourse(tempCourse);
                                slot.addCredits(tempCourse.getCredits());
                                breakCheck = true;
                                break;
                            }
    					}
    				}
    			}
    			if( breakCheck )
    				break;
    		}
    		
    		if ( i == availableFutureSemesters.length )
    		{
    			coursesWithoutOfferings.add(tempCourse);
    		}
    	}


    	/*
    	 * Construct the Graduation Plan String.
    	 */

    	for ( i = 0; i < slots.size(); i++ )
    	{
    		slot = slots.get(i);
    		if ( slot.getCreditCount() > 0 )
    		{
    			/* get the year out of the semester code */
    			semesterYear = slot.getSemesterCode() / 100;

    			/* get the term code out of the semester code i.e. 20, 30, 50 */
    			semesterTerm = slot.getSemesterCode() % 100;

    			gradPlanStringBuild.append("\n\n------------ ");
    			
    			/* term code is Fall. */
    			if ( fall == true && semesterTerm == 20 )
    			{
    				gradPlanStringBuild.append(fallString);
    			}
    			/* term code is Winter. */
    			else if ( winter == true && semesterTerm == 30 )
    			{
    				gradPlanStringBuild.append(winterString);
    			}
    			/* term code is Summer. */
    			else if ( summer == true && semesterTerm == 50 )
    			{
    				gradPlanStringBuild.append(summerString);
    			}

    			gradPlanStringBuild.append(" " + semesterYear);
    			
    			gradPlanStringBuild.append(" ------------\n\n");
    			
    			for ( j = 0; j < slot.getCourses().size(); j++ )
    			{
                    gradPlanStringBuild.append( courseToString(slot.getCourses().get(j)) );
    			}
    		}
    	}
    	
    	/* if there are courses without offerings write them to the String. */
    	if ( !coursesWithoutOfferings.isEmpty() )
    	{
            gradPlanStringBuild.append("\n---------- Courses Without Future Offerings ----------\n");
            for ( i = 0; i < coursesWithoutOfferings.size(); i++ )
            {
                gradPlanStringBuild.append( courseToString(coursesWithoutOfferings.get(i)) );
            }
    	}

    	return gradPlanStringBuild.toString();
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
