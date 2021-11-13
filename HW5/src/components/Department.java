package components;

import java.util.ArrayList;

public class Department {

	public String name;
	public ArrayList<Employee> employee = new ArrayList<Employee>();
	public Professor chair;
	ArrayList<Course> courses = new ArrayList<Course>();

	public Department(String name, ArrayList<Employee> employee, Professor chair, ArrayList<Course> courses) {
		this.name = name;
		this.employee = employee;
		this.chair = chair;
		this.courses = courses;
	}

}
