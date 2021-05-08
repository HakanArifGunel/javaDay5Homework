package besinciGunOdev.core.concretes;

import besinciGunOdev.core.abstracts.IUserValidator;
import besinciGunOdev.entities.concretes.User;

public class PasswordValidator implements IUserValidator{

	@Override
	public boolean validate(User user) {
		
		if(user.getPassword().length() < 6) {
			System.out.println("Parolan�z en az 6 karakterden olu�mak zorundad�r.");
			return false;
		} else {
			System.out.println("Parola uygun girildi");
			return true;
		}
		
	}

}
