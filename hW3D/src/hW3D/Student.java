package hW3D;

public class Student extends User {


	public Student(int id, String firstName, String lastName, String courseName) {
		super(id, firstName, lastName);
		this.courseName = courseName;

	}

	private String courseName;

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

}
