package project.northwind.business.abstracts;

import java.util.List;
import project.northwind.entities.concretes.Order;

public interface OrderService {
	
	List<Order> getAll();
}
