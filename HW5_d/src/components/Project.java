package components;

import java.util.ArrayList;

public class Project {

	public String name;
	public ArrayList<Student> members = new ArrayList<Student>();
	public Course course;

	public Project(String name, ArrayList<Student> members, Course course) {

		this.name = name;
		this.members = members;
		this.course = course;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Student> getMembers() {
		return members;
	}

	public void addNewMember(Student s) {
		members.add(s);
	}

}
