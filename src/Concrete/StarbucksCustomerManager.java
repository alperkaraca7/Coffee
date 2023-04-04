package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Adapters.MernisServiceAdapter;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	public ICustomerCheckService customercheckService;
	
	

	public StarbucksCustomerManager(ICustomerCheckService customercheckService) {
		this.customercheckService = customercheckService;
	}

	@Override
	public void Save(Customer customer) {
		
		
		if (customercheckService.checkIfRealCustomer(customer)) {
			
			super.Save(customer);
		}
		else {
			System.out.println("Not a valid Person.");
		}
		
	}
}
