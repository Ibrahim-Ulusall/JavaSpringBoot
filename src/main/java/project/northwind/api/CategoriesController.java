package project.northwind.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.northwind.business.abstracts.CategoryService;
import project.northwind.entities.concretes.Category;

@RestController
@RequestMapping("/api/categories")
public class CategoriesController {

	private CategoryService _categoryService;
	@Autowired
	public CategoriesController(CategoryService categoryService) {
		super();
		this._categoryService = categoryService;
	}
	
	@GetMapping("getall")
	public List<Category> GetAll(){
		return this._categoryService.getAll();
	}
	
	
}
