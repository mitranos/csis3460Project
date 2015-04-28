package edu.nova.csis3460.eadvisor.courses;

public class StudentCourse
{
	private Course course;
	private String section;
	private String semester;
	private Character grade;
	private Integer crn;
	
	public StudentCourse (Course course, String section, String semester, Character grade, Integer crn)
	{
		this.course = course;
		this.section = section;
		this.semester = semester;
		this.grade = grade;
		this.crn = crn;
	}
	
	public Course getCourse(){
		return course;
	}
	
	public Character getGrade(){
		return grade;
	}
	
	public String getSection(){
		return section;
	}
	
	public String getSemester(){
		return semester;
	}
	
	public Integer getCRN(){
		return crn;
	}
	
	public StudentCourse clone() {
		return new StudentCourse(this.course, this.section, this.semester, this.grade, this.crn);
	}
}
