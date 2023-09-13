package project.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import project.northwind.entities.concretes.Customer;

public interface CustomerDao extends JpaRepository<Customer,String> {

}
