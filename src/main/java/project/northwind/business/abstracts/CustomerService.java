package project.northwind.business.abstracts;

import java.util.List;
import project.northwind.entities.concretes.Customer;

public interface CustomerService {
	List<Customer> getAll();
}
