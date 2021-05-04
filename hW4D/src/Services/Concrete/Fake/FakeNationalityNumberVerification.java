package Services.Concrete.Fake;

import Entitties.Concrete.User;
import Services.Abstract.NationalityNumberVerification;

public class FakeNationalityNumberVerification implements NationalityNumberVerification{

	@Override
	public Boolean verification(User user) {
		int nationalityNumberLenght=user.getNationalityNumber().length();
		
		System.out.println("Tc kimlik do�rulama sistemi");
		
		if(nationalityNumberLenght!=11) 
		{
			System.out.println("Tc Kimlik numaras� 11 karakterden olu�mal�d�r. Siz " + nationalityNumberLenght + "girdiniz");
			return false;
		}
		System.out.println("Tc kimlik do�ru...");
		return true;
	}
	
}
