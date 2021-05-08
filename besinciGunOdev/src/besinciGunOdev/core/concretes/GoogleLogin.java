package besinciGunOdev.core.concretes;

import besinciGunOdev.GoogleLogin.LoginWithGoogle;
import besinciGunOdev.core.abstracts.ILoginWithDifferentServices;

public class GoogleLogin implements ILoginWithDifferentServices{

	@Override
	public void loginwith(String message) {
		LoginWithGoogle loginWithGoogle = new LoginWithGoogle();
		loginWithGoogle.googleLogin(message);
	}

}
