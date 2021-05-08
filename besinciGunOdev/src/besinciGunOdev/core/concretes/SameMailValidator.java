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
				System.out.println("Bu email adresi daha önce kullanýlmýþ. Lütfen geçerli bir adres giriniz.");
				return false;
			} 
				System.out.println("Daha önce kullanýlmýþ bir eposta adresi girdiniz. Ýþlem baþarýlý.");
				return true;
	           

	}
		
	 return false;
	}

}
