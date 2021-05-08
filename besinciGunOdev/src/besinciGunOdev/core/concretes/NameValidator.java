package besinciGunOdev.core.concretes;

import besinciGunOdev.core.abstracts.IUserValidator;
import besinciGunOdev.entities.concretes.User;

public class NameValidator implements IUserValidator{

	@Override
	public boolean validate(User user) {
		
		if (user.getFirstName().length()>1 && user.getLastName().length() > 1) {
			System.out.println("Kullan�c� ad� ve soyad� uygun girildi");
			return true;
		} else {
			System.out.println("Kullan�c� ad� ve soyad� 2 karakterden b�y�k olmal�d�r.");
			return false;
		}
		
	}

}
