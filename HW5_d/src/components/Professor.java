package components;

import java.util.ArrayList;

public class Professor {

	public ArrayList<Course> courses = new ArrayList<Course>();
	public ArrayList<Exam> exam = new ArrayList<Exam>();

	public Professor(ArrayList<Course> courses, ArrayList<Exam> exam) {

		this.courses = courses;
		this.exam = exam;
	}

	public void publish_course() {
	};

	public void assign_TA() {
	};

	public void addNewCourse() {
	};

}
