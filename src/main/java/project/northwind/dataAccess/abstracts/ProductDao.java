package project.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import project.northwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product,Integer>{
	
}
