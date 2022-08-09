package eCommerceProject;

import eCommerceProject.business.abstracts.UserService;
import eCommerceProject.business.concretes.UserManager;
import eCommerceProject.core.concretes.GoogleManagerAdapter;
import eCommerceProject.dataAccess.concretes.HibernateUserDao;
import eCommerceProject.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User(1, "Muhammed Murat", "Ozgur", "ozgurmuhammedmurat@gmail.com", "1234");
		User user2 = new User(2, "Behzat", "C.", "baskomiser@gmail.com", "0912");
		
		UserService userService = new UserManager(new HibernateUserDao(), new GoogleManagerAdapter());
		userService.add(user1);
		userService.login(user2, "baskomiser@gmail.com", "0912");
		userService.login(user1, "muratozgur@gmail.com", "1234");
	}

}
