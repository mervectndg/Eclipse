package hW3D;

public class UserManager {

	public void Login(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " giri� yapt�. ");
	}
	public void Logout(User user) {
		System.out.println(user.getFirstName()+" "+ user.getLastName() + " ��k�� yapt�. " );
	}
}
