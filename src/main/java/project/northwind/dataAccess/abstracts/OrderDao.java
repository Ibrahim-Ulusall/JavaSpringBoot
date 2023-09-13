package project.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import project.northwind.entities.concretes.Order;

public interface OrderDao extends JpaRepository<Order, Integer> {
	
}
