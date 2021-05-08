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
			System.out.println("Kayýt olma iþlemi baþarýlý.");
			sendVerificationCode(user);
		} else {
			System.out.println("Kayýt olma iþlemi baþarýsýz.");
		}

	
	}

	@Override
	public void sendVerificationCode(User user) {
		System.out.println("Doðrulama kodu " + user.geteMail() + " eposta adresinize gönderildi.");
		
	}

	@Override
	public void googleLogin(GoogleLogin googleLogin) {
		System.out.println("Google ile giriþ yapýldý");
		
	}

	@Override
	public void login(String eMail, String password, User user) {
		
		if (eMail == user.geteMail() && password == user.getPassword()) {		
			System.out.println("Giriþ iþlemi baþarýlý");
		}
		else {
			System.out.println("Giriþ iþlemi baþarýsýz. Lütfen email ve parolanýzý kontrol ediniz.");
		}
	}

	@Override
	public void isMailVerificate(User user) {
		
		System.out.println(user.geteMail() + " adresiyle mail adresi doðrulandý");
		
	}


	
}
