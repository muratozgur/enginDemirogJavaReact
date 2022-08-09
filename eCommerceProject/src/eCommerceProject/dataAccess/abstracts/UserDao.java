package eCommerceProject.dataAccess.abstracts;

import eCommerceProject.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void update(User user);
	void delete(User user);
}
