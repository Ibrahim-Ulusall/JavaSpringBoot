package project.northwind.business.abstracts;

import java.util.List;

import project.northwind.entities.concretes.Category;

public interface CategoryService {
	List<Category> getAll();
}
