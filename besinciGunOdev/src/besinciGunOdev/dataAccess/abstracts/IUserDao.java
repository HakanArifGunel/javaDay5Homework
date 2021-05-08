package besinciGunOdev.dataAccess.abstracts;

import besinciGunOdev.entities.concretes.User;

public interface IUserDao {
	
	void add(User user);
	void delete(User user);
	void update (User user);
}
