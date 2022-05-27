package springapplication.service;

import java.util.List;
import springapplication.bean.Customer;

public interface CustomerService {

	Customer addCustomer(Customer customer); //POST
	
	List<Customer> getAllListofCustomers(); //GET
	
	Customer updateCustomer(Customer customer, long id); //PUT
	
	
	void deleteById(long id); //DELETE
	
	
}
