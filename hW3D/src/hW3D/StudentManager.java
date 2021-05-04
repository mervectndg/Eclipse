package hW3D;

public class StudentManager extends UserManager{
	public void selectedCourse(Student student) {
		System.out.println("Öğrenci " + student.getFirstName()+" "+student.getLastName()+ " " + student.getCourseName()+ " kayıt oldu ");
	}

}
