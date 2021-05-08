package besinciGunOdev;

import besinciGunOdev.business.concretes.UserManager;
import besinciGunOdev.core.concretes.BlankValidator;
import besinciGunOdev.core.concretes.EMailValidator;
import besinciGunOdev.core.concretes.GoogleLogin;
import besinciGunOdev.core.concretes.NameValidator;
import besinciGunOdev.core.concretes.PasswordValidator;
import besinciGunOdev.core.concretes.SameMailValidator;
import besinciGunOdev.dataAccess.concretes.DbUserDao;
import besinciGunOdev.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User();
		user1.setId(1);
		user1.setFirstName("Hakan");
		user1.setLastName("Günel");
		user1.seteMail("hakangunel@gmail.com");
		user1.setPassword("123456");
		
		//User user2 = new User();
		//user2.setId(2);
		//user2.setFirstName("Hakan");
		//user2.setLastName("Günel");
		//user2.seteMail("hakangunel@gmail.com");
		//user2.setPassword("123456");
		
		DbUserDao dbUserDao = new DbUserDao();
		dbUserDao.add(user1);
		System.out.println("--------------------------------");

		
		//IUserValidator[] validators = {new BlankValidator(), new NameValidator(), new PasswordValidator()};
		
		PasswordValidator passwordValidator = new PasswordValidator();
		EMailValidator eMailValidator = new EMailValidator();
		NameValidator nameValidator = new NameValidator();
		BlankValidator blankValidator = new BlankValidator();
		//SameMailValidator sameMailValidator = new SameMailValidator();
	    //blankValidator.validate(user1);
		//passwordValidator.validate(user1);
		//eMailValidator.validate(user1);
		//nameValidator.validate(user1);
		//sameMailValidator.validate(user1);
		
		//System.out.println("--------------------------------");

		UserManager manager = new UserManager();
		manager.register(user1, blankValidator, eMailValidator, nameValidator, passwordValidator);
		manager.isMailVerificate(user1);

		System.out.println("--------------------------------");
		
		manager.googleLogin(null);
		
		System.out.println("--------------------------------");

		manager.login("hakangunel@gmail.com", "123456", user1);
		

	}

}
