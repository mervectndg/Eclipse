package hW2D;

public class CourseManager {
	public void addToCourse(Courses course) {
		System.out.println(course.name + "Kursunuz eklenmi�tir.");
	}

	public void addToHomework(Courses course, String homeWork) {
		System.out.println(course.name + " kursunuza " + homeWork + " �devi eklendi");
	}
}
