package project.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import project.northwind.entities.concretes.Region;

public interface RegionDao extends JpaRepository<Region, Integer>{

}
