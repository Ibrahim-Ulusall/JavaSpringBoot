package project.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.northwind.business.abstracts.OrderService;
import project.northwind.dataAccess.abstracts.OrderDao;
import project.northwind.entities.concretes.Order;

@Service
public class OrderManager implements OrderService{
	
	private OrderDao _orderDao;
	
	@Autowired
	public OrderManager(OrderDao orderDao) {
		this._orderDao = orderDao;
	}
	
	@Override
	public List<Order> getAll() {
		return this._orderDao.findAll();
	}
}
