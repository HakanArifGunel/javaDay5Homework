package besinciGunOdev.core.concretes;

import besinciGunOdev.core.abstracts.IUserValidator;
import besinciGunOdev.entities.concretes.User;

public class NameValidator implements IUserValidator{

	@Override
	public boolean validate(User user) {
		
		if (user.getFirstName().length()>1 && user.getLastName().length() > 1) {
			System.out.println("Kullanýcý adý ve soyadý uygun girildi");
			return true;
		} else {
			System.out.println("Kullanýcý adý ve soyadý 2 karakterden büyük olmalýdýr.");
			return false;
		}
		
	}

}
