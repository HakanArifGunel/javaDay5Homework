package besinciGunOdev.core.concretes;

import java.util.ArrayList;

import besinciGunOdev.core.abstracts.IUserValidator;
import besinciGunOdev.entities.concretes.User;

public class SameMailValidator implements IUserValidator{
	
	ArrayList<User> users = new ArrayList<User>();

	@Override
	public boolean validate(User user) {	
	
			if (!user.geteMail().isEmpty())
		return true;
			
		for (User userArray : users) {
			if (userArray.geteMail() == user.geteMail()) {
				System.out.println("Bu email adresi daha �nce kullan�lm��. L�tfen ge�erli bir adres giriniz.");
				return false;
			} 
				System.out.println("Daha �nce kullan�lm�� bir eposta adresi girdiniz. ��lem ba�ar�l�.");
				return true;
	           

	}
		
	 return false;
	}

}
