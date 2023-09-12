package project.northwind.business.concretes;

import java.util.List;

import project.northwind.business.abstracts.ProductService;
import project.northwind.dataAccess.abstracts.ProductDao;
import project.northwind.entities.concretes.Product;

public class ProductManager implements ProductService{
	
	private ProductDao productDao;
	
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public List<Product> getAll() {
		return null;
	}
}
