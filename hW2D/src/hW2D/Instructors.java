package hW2D;

public class Instructors {
	int id;
	String firstName;
	String lastName;
	String instructorEmailAddress;
	String password;
	
	public Instructors() {
		
	}

	public Instructors(int id, String firstName, String lastName, String instructorEmailAddress, String password) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.instructorEmailAddress = instructorEmailAddress;
		this.password = password;
	}
}
