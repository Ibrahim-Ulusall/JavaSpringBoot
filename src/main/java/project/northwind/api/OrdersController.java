package project.northwind.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.northwind.business.abstracts.OrderService;
import project.northwind.entities.concretes.Order;

@RestController
@RequestMapping("/api/orders")
public class OrdersController {

	private OrderService _orderService;
	
	@Autowired
	public OrdersController(OrderService orderService) {
		this._orderService = orderService;		
	}
	
	@GetMapping("/getall")
	public List<Order> getAll(){
		return this._orderService.getAll();
	}
}
