package springapplication.serviceImp;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import springapplication.bean.Customer;
import springapplication.repository.MyLocalRepository;
import springapplication.service.CustomerService;
@Service
public class CustomerServiceimp implements CustomerService {
	
	@Autowired
	MyLocalRepository mylocalrepository;
	
	@Override // POST method
	public Customer addCustomer(Customer customer) {
		Customer customeradded = mylocalrepository.save(customer);
		
		return customeradded;
	}

	@Override //GET method
	public List<Customer> getAllListofCustomers() {
		List<Customer> listofcustomers = mylocalrepository.findAll();
		return listofcustomers;
	}

	@Override //PUT method
	public Customer updateCustomer(Customer customer, long id) {
		
		customer.setId(id);
		Customer updatedcustomer = mylocalrepository.save(customer);

		return updatedcustomer;
	}

	@Override
	public void deleteById(long id) {
		mylocalrepository.deleteById(id);// delete method 
		
	}

	
	
}
