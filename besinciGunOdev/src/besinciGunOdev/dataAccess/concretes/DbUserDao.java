package besinciGunOdev.dataAccess.concretes;

import java.util.ArrayList;

import besinciGunOdev.dataAccess.abstracts.IUserDao;
import besinciGunOdev.entities.concretes.User;

public class DbUserDao implements IUserDao{
	
	ArrayList<User> users = new ArrayList<User>();

	@Override
	public void add(User user) {
		
		users.add(user);
		
		for (User user1 : users) {
			System.out.println(user1.getFirstName() +" "+ user1.getLastName() +" Adl� kullan�c� sisteme eklendi");
		}
		
		//System.out.println(user.getFirstName() + " Adl� kullan�c� sisteme eklendi");
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

}
