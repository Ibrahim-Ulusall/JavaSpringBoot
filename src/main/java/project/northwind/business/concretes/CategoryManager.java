package project.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.northwind.business.abstracts.CategoryService;
import project.northwind.dataAccess.abstracts.CategoryDao;
import project.northwind.entities.concretes.Category;

@Service
public class CategoryManager implements CategoryService{

	private CategoryDao _categoryDao;
	
	@Autowired
	public CategoryManager(CategoryDao categoryDao) {
		this._categoryDao = categoryDao;
	}
	
	@Override
	public List<Category> getAll() {
		return this._categoryDao.findAll();
	}

}
