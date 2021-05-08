package besinciGunOdev.business.concretes;

import besinciGunOdev.business.abstracts.IUserManager;
import besinciGunOdev.core.abstracts.IUserValidator;
import besinciGunOdev.core.concretes.BlankValidator;
import besinciGunOdev.core.concretes.EMailValidator;
import besinciGunOdev.core.concretes.GoogleLogin;
import besinciGunOdev.core.concretes.NameValidator;
import besinciGunOdev.core.concretes.PasswordValidator;
import besinciGunOdev.dataAccess.concretes.DbUserDao;
import besinciGunOdev.entities.concretes.User;

public class UserManager implements IUserManager{

	@Override
	public void register(User user, BlankValidator blankValidator, EMailValidator eMailValidator,
			NameValidator nameValidator, PasswordValidator passwordValidator) {
		
		if(blankValidator.validate(user) && eMailValidator.validate(user) &&
		  nameValidator.validate(user) && passwordValidator.validate(user)) {
			System.out.println("Kay�t olma i�lemi ba�ar�l�.");
			sendVerificationCode(user);
		} else {
			System.out.println("Kay�t olma i�lemi ba�ar�s�z.");
		}

	
	}

	@Override
	public void sendVerificationCode(User user) {
		System.out.println("Do�rulama kodu " + user.geteMail() + " eposta adresinize g�nderildi.");
		
	}

	@Override
	public void googleLogin(GoogleLogin googleLogin) {
		System.out.println("Google ile giri� yap�ld�");
		
	}

	@Override
	public void login(String eMail, String password, User user) {
		
		if (eMail == user.geteMail() && password == user.getPassword()) {		
			System.out.println("Giri� i�lemi ba�ar�l�");
		}
		else {
			System.out.println("Giri� i�lemi ba�ar�s�z. L�tfen email ve parolan�z� kontrol ediniz.");
		}
	}

	@Override
	public void isMailVerificate(User user) {
		
		System.out.println(user.geteMail() + " adresiyle mail adresi do�ruland�");
		
	}


	
}
