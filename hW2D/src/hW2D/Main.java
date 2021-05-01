package hW2D;

public class Main {

	public static void main(String[] args) {
		Students student1 = new Students(1, " Merve", "ÇETÝNDAÐ", "mrvctndg@gmail.com", "9919mrv");
		Students student2 = new Students(2, " Sefa", "ÇETÝNDAÐ", "sefa@gmail.com", "0020sf");
		Students student3 = new Students(3, " Nazik", "ÇETÝNDAÐ", "nazik@gmail.com", "9719nzk");

		Students[] students = { student1, student2, student3 };
		for (Students student : students) {
			System.out.println(student.id + " numaralý öðrenci :" + student.firstName + student.lastName);
		}
		System.out.println(students.length + " adet öðrenci bulunmaktadýr.");

		System.out
				.println("===========================================================================================");

		Instructors instructor1 = new Instructors(11, " Engin", "DEMÝROÐ", "engindermirog@gmail.com", "ngndmrg3");

		Instructors[] instructors = { instructor1 };
		for (Instructors instructor : instructors) {
			System.out.println(+instructor.id + " numaralý eðitmen :" + instructor.firstName + instructor.lastName);

		}
		System.out.println(instructors.length + " adet eðitmen bukunmaktadýr.");

		System.out
				.println("===========================================================================================");

		Courses course1 = new Courses(1, "Nitelikli Yazýlým Geliþtirici Yetiþtirme Kampý (C# + Angular)", "Ücretsiz",
				instructor1.firstName + "" + instructor1.lastName);
		Courses course2 = new Courses(1, "Nitelikli Yazýlým Geliþtirici Yetiþtirme Kampý (Java + React)", "Ücretsiz",
				instructor1.firstName + "" + instructor1.lastName);
		Courses course3 = new Courses(1, "Programlamaya Giriþ için Temel Kurs", "Ücretsiz",
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
			System.out.println(+course.id + " numaralý Kurs :" + course.name + "\n" + "Açýklamasý :" + course.desc
					+ "\n" + "Kursun Eðitmeni :" + course.instructor);
		}

		courseManager.addToHomework(course2, "2.gün ödevi");
		courseManager.addToHomework(course2, "2.gün 2.ödevi");

		System.out.println(courses.length + " adet kayýtlý kursunuz var.");
	}

}
