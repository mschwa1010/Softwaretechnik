package components;

import java.util.ArrayList;

public class Student {

	public String name;
	public int studentId;
	public ArrayList<Project> project = new ArrayList<Project>();
	public ArrayList<Course> courses = new ArrayList<Course>();
	public ArrayList<Exam> exam = new ArrayList<Exam>();

	public Student(String name, int studentId, ArrayList<Project> project, ArrayList<Course> courses,
			ArrayList<Exam> exam) {

		this.name = name;
		this.studentId = studentId;
		this.project = project;
		this.courses = courses;
		this.exam = exam;
	}

	public String getName() {
		return name;
	};

	public ArrayList<Project> getProjects() {
		return project;
	}

}
