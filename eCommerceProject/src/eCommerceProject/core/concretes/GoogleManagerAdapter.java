package eCommerceProject.core.concretes;

import eCommerceProject.core.abstracts.GoogleService;
import eCommerceProject.entities.concretes.User;
import eCommerceProject.jGoogle.JGoogleManager;

public class GoogleManagerAdapter implements GoogleService{

	@Override
	public void withGoogle(User user) {
		JGoogleManager manager = new JGoogleManager();
		manager.registerWithGoogle(user);
		
	}

}
