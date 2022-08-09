package eCommerceProject.business.abstracts;

import eCommerceProject.entities.concretes.User;

public interface UserService {
	void add(User user);
	void login(User user, String eMail, String password);
}
