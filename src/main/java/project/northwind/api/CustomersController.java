package project.northwind.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.northwind.business.abstracts.CustomerService;
import project.northwind.entities.concretes.Customer;

@RestController
@RequestMapping("/api/customers")
public class CustomersController {
	
	private CustomerService _customerService;
	
	@Autowired
	public CustomersController(CustomerService customerService) {
		
		this._customerService = customerService;
	}
	
	@GetMapping("getall")
	public List<Customer> getAll(){
		return this._customerService.getAll();
	}
}
