package Business.Concrete;

import java.util.ArrayList;

import Business.Abstract.UserService;
import Entitties.Concrete.User;
import Services.Abstract.NationalityNumberVerification;
import Services.ConcreteKPSPPublic.KPSPublicNationalityNumberVerificaition;

public class UserManager implements UserService {

	ArrayList<User> users;
	NationalityNumberVerification natinoalityNumberVerification;

	public UserManager() {
		super();
		natinoalityNumberVerification = new KPSPublicNationalityNumberVerificaition();

		users = new ArrayList<User>();

	}

	@Override
	public User get(int id) {
		User userGet = users.stream().filter(c -> c.getId() == id).findFirst().get();
		System.out.println("Id " + userGet.getId());
		System.out.println("Tc Kimlik " + userGet.getNationalityNumber());
		System.out.println("�sim " + userGet.getFirstName());
		System.out.println("Soyisim " + userGet.getLastName());
		System.out.println("Do�um Y�l� " + userGet.getBirthYear());
		return userGet;
	}

	@Override
	public void getAll() {
		for (User user : users) {
			System.out.println("Id " + user.getId());
			System.out.println("Tc Kimlik " + user.getNationalityNumber());
			System.out.println("�sim " + user.getFirstName());
			System.out.println("Soyisim " + user.getLastName());
			System.out.println("Do�um Y�l� " + user.getBirthYear());

		}
	}

	@Override
	public void update(User user) {
		Boolean validate = natinoalityNumberVerification.verification(user);
		if (validate) {
			User userUpdate = users.stream().filter(c -> c.getId() == user.getId()).findFirst().get();
			users.remove(userUpdate);
			users.add(user);
			System.out.println(" Kullan�c� ba�ar�yla g�ncellendi.");
		} else {
			System.out.println(" Kullan�c� g�ncellenirken bir hata olu�tu.");
		}

	}

	@Override
	public void add(User user) {
		Boolean validate = natinoalityNumberVerification.verification(user);
		if (validate) {
			users.add(user);
			System.out.println(" Kullan�c� ba�ar�yla eklendi.");
		} else {
			System.out.println(" Kullan�c� eklerken bir hata olu�tu.");
		}
	}

	@Override
	public void delete(int id) {
		User userDelete = users.stream().filter(c -> c.getId() == id).findFirst().get();
		users.remove(userDelete);
		System.out.println(" Kullan�c� basar�yla silindi.");
	}

}
