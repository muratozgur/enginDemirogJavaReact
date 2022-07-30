package concrete;

import abstracts.BaseCustomerManager;
import abstracts.ICustomerCheckService;
import abstracts.ICustomerService;
import entities.Customer;
import concrete.CustomerCheckManager;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	private ICustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	public void save(Customer customer) throws Exception{
		
		if(customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		}
		else {
			System.out.println("Not a valid person");
		}	
	}
	
}
