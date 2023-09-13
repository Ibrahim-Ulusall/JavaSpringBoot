package project.northwind.business.abstracts;

import java.util.List;

import project.northwind.entities.concretes.Region;

public interface RegionService {
	List<Region> getAll();
}
