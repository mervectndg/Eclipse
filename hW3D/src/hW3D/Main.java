package hW3D;

public class Main {

	public static void main(String[] args) {
		Student student=new Student(1,"Merve "," ÇETÝNDAÐ "," Nitelikli Yazýlým Geliþtirici Yetiþtirme Kampý (Java + React) ");
		Instructor instructor=new Instructor(1,"Engin "," DEMÝROÐ " , " Nitelikli Yazýlým Geliþtirici Yetiþtirme Kampý (Java + React) ");
		
		InstructorManager instructorManager=new InstructorManager();
		StudentManager studentManager= new StudentManager();
		UserManager userManager= new UserManager();
		instructorManager.course(instructor);
		System.out.println("------------------------------------------------------------------------------------------");
		studentManager.selectedCourse(student);
		System.out.println("---------------------------------------------------------");
		userManager.Login(instructor);
		userManager.Logout(instructor);
		System.out.println("---------------------------------------------------------");
		userManager.Login(student);
		userManager.Logout(student);
		
	}

}
