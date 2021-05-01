package hW2D;

public class Main {

	public static void main(String[] args) {
		Students student1 = new Students(1, " Merve", "�ET�NDA�", "mrvctndg@gmail.com", "9919mrv");
		Students student2 = new Students(2, " Sefa", "�ET�NDA�", "sefa@gmail.com", "0020sf");
		Students student3 = new Students(3, " Nazik", "�ET�NDA�", "nazik@gmail.com", "9719nzk");

		Students[] students = { student1, student2, student3 };
		for (Students student : students) {
			System.out.println(student.id + " numaral� ��renci :" + student.firstName + student.lastName);
		}
		System.out.println(students.length + " adet ��renci bulunmaktad�r.");

		System.out
				.println("===========================================================================================");

		Instructors instructor1 = new Instructors(11, " Engin", "DEM�RO�", "engindermirog@gmail.com", "ngndmrg3");

		Instructors[] instructors = { instructor1 };
		for (Instructors instructor : instructors) {
			System.out.println(+instructor.id + " numaral� e�itmen :" + instructor.firstName + instructor.lastName);

		}
		System.out.println(instructors.length + " adet e�itmen bukunmaktad�r.");

		System.out
				.println("===========================================================================================");

		Courses course1 = new Courses(1, "Nitelikli Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + Angular)", "�cretsiz",
				instructor1.firstName + "" + instructor1.lastName);
		Courses course2 = new Courses(1, "Nitelikli Yaz�l�m Geli�tirici Yeti�tirme Kamp� (Java + React)", "�cretsiz",
				instructor1.firstName + "" + instructor1.lastName);
		Courses course3 = new Courses(1, "Programlamaya Giri� i�in Temel Kurs", "�cretsiz",
				instructor1.firstName + "" + instructor1.lastName);

		System.out
				.println("===========================================================================================");

		CourseManager courseManager = new CourseManager();
		courseManager.addToCourse(course1);
		courseManager.addToCourse(course2);
		courseManager.addToCourse(course3);

		System.out
				.println("===========================================================================================");
		Courses[] courses = { course1, course2, course3 };

		for (Courses course : courses) {
			System.out.println(+course.id + " numaral� Kurs :" + course.name + "\n" + "A��klamas� :" + course.desc
					+ "\n" + "Kursun E�itmeni :" + course.instructor);
		}

		courseManager.addToHomework(course2, "2.g�n �devi");
		courseManager.addToHomework(course2, "2.g�n 2.�devi");

		System.out.println(courses.length + " adet kay�tl� kursunuz var.");
	}

}
