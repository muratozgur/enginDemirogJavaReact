package eCommerceProject.business.concretes;

import eCommerceProject.business.abstracts.UserService;
import eCommerceProject.core.abstracts.GoogleService;
import eCommerceProject.dataAccess.abstracts.UserDao;
import eCommerceProject.entities.concretes.User;

public class UserManager implements UserService{

	private UserDao userDao;
	private GoogleService googleService;
	
	public UserManager(UserDao userDao, GoogleService googleService) {
		this.userDao = userDao;
		this.googleService = googleService;
	}

	@Override
	public void add(User user) {
		if(Validator.eMailVerifaction(user.geteMail()) &&
				Validator.passwordVerifaction(user.getPassword()) &&
				Validator.nameverifaction(user.getFirstName(), user.getLastName())) {
			
			System.out.println("Verifaction code sent to : " + user.geteMail());
			System.out.println("Registired successfully");
		}
		else {
			System.out.println("You entered invalid email, password or name-surname. Please check the requirements again");
			return;
		}
		userDao.add(user);
		googleService.withGoogle(user);
	}

	@Override
	public void login(User user, String enteredEmail, String enteredPassword) {
		if(user.geteMail().equals(enteredEmail) && user.getPassword().equals(enteredPassword))
			System.out.println("Successfully logged in");
		else
			System.out.println("Email or password you entered is not correct");
	}
	
}
