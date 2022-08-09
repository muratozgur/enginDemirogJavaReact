package eCommerceProject.dataAccess.concretes;


import eCommerceProject.dataAccess.abstracts.UserDao;
import eCommerceProject.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println("Registired with hibernate : " + user.getFirstName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Updated with hibernate : " + user.getFirstName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Deleted with hibernate : " + user.getFirstName());
		
	}
	
}
