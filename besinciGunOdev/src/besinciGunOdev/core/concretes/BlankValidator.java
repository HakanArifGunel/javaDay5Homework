package besinciGunOdev.core.concretes;

import besinciGunOdev.core.abstracts.IUserValidator;
import besinciGunOdev.entities.concretes.User;

public class BlankValidator implements IUserValidator{

	@Override
	public boolean validate(User user) {
		if (!user.getFirstName().isEmpty() && !user.getLastName().isEmpty() &&
				!user.geteMail().isEmpty() && !user.getPassword().isEmpty()) {
			System.out.println("Kullanýcý bilgileri eksiksiz olarak girildi.");
			return true;
		} else {
			System.out.println("Lütfen tüm zorunlu alanlarý eksiksiz doldurunuz.");
			return false;
		}
			
			
	}

}
