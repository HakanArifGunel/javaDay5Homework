package besinciGunOdev.business.abstracts;

import besinciGunOdev.core.concretes.BlankValidator;
import besinciGunOdev.core.concretes.EMailValidator;
import besinciGunOdev.core.concretes.GoogleLogin;
import besinciGunOdev.core.concretes.NameValidator;
import besinciGunOdev.core.concretes.PasswordValidator;
import besinciGunOdev.entities.concretes.User;

public interface IUserManager {
	
	void register(User user, BlankValidator blankValidator, EMailValidator eMailValidator, NameValidator nameValidator, PasswordValidator passwordValidator);
	void sendVerificationCode(User user);
	void isMailVerificate(User user);
	void googleLogin(GoogleLogin googleLogin);
	void login(String eMail, String password, User user);
	
}
