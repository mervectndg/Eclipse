package hW3D;

public class StudentManager extends UserManager{
	public void selectedCourse(Student student) {
		System.out.println("��renci " + student.getFirstName()+" "+student.getLastName()+ " " + student.getCourseName()+ " kay�t oldu ");
	}

}
