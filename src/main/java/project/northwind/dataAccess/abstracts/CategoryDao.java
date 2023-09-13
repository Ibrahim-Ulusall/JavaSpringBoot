package project.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import project.northwind.entities.concretes.Category;

public interface CategoryDao extends JpaRepository<Category, Integer> {

}
