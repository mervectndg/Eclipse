package hW3D;

public class UserManager {

	public void Login(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " giriþ yaptý. ");
	}
	public void Logout(User user) {
		System.out.println(user.getFirstName()+" "+ user.getLastName() + " çýkýþ yaptý. " );
	}
}
