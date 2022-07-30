package concrete;

import abstracts.ICustomerCheckService;
import abstracts.ICustomerService;
import entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService{

	public boolean checkIfRealPerson(Customer customer) {
		return true;
	}


}
