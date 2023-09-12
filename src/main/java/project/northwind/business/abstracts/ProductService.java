package project.northwind.business.abstracts;

import java.util.List;

import project.northwind.entities.concretes.Product;

public interface ProductService {
	List<Product> getAll();
}
