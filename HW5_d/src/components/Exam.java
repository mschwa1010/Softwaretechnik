package components;

import java.util.ArrayList;

public class Exam {

	public int max_value;
	public ArrayList<Course> courses = new ArrayList<Course>();
	public ArrayList<Question> questions = new ArrayList<Question>();
	public ArrayList<Student> student = new ArrayList<Student>();

	public Exam(int max_value, ArrayList<Course> courses, ArrayList<Question> questions, ArrayList<Student> student) {

		this.max_value = max_value;
		this.courses = courses;
		this.questions = questions;
		this.student = student;
	}

	public boolean register(Student stunden) {
		return true;
	};

	public void addQuestion(int id, String task, int value) {
	};

	public ArrayList<Student> getRegisteredStudents() {
		return student;
	};

	public void setMaxValue(int max) {
		this.max_value = max;
	};

}
