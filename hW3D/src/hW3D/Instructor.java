package hW3D;

public class Instructor extends User {

	public Instructor(int id, String firstName, String lastName, String course) {
		super(id, firstName, lastName);
		this.course = course;
	}

	private String course;

	public String course() {
		return course;

	}

	public void setCourse(String course) {
		this.course = course;
	}

}
