package project.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.northwind.business.abstracts.RegionService;
import project.northwind.dataAccess.abstracts.RegionDao;
import project.northwind.entities.concretes.Region;

@Service
public class RegionManager implements RegionService {

	private RegionDao _regionDao;
	
	@Autowired
	public RegionManager(RegionDao regionDao) {
		this._regionDao = regionDao;
	}
	
	@Override
	public List<Region> getAll() {
		return this._regionDao.findAll();
	}
}
