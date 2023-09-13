package project.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.northwind.business.abstracts.CustomerService;
import project.northwind.dataAccess.abstracts.CustomerDao;
import project.northwind.entities.concretes.Customer;
@Service
public class CustomerManager implements CustomerService {

	private CustomerDao _customerDao;
	@Autowired
	public CustomerManager(CustomerDao customerDao) {
		
		this._customerDao = customerDao;
	}
	
	@Override
	public List<Customer> getAll() {
		return this._customerDao.findAll();
	}
	
}
