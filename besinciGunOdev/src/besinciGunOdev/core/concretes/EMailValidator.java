package besinciGunOdev.core.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import besinciGunOdev.core.abstracts.IUserValidator;
import besinciGunOdev.entities.concretes.User;

public class EMailValidator implements IUserValidator{


	String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
	Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
	
	@Override
	public boolean validate(User user) {
		Matcher matcher = pattern.matcher(user.geteMail());
		
		if(matcher.matches()) {
			System.out.println("Mail do�ru girildi.");
			return true;
		} else {
			System.out.println("L�tfen mail adresinizi kontrol ediniz. Kurallara uygun giri� yap�n�z.");
			return false;
		}
		
	}

}
