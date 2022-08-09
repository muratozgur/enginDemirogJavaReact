package eCommerceProject.jGoogle;

import eCommerceProject.entities.concretes.User;

public class JGoogleManager {
	public void registerWithGoogle(User user) {
		System.out.println("Registired with google : " + user.getFirstName());
	}
}
