package project.northwind.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.northwind.business.abstracts.RegionService;
import project.northwind.entities.concretes.Region;

@RestController
@RequestMapping("/api/regions")
public class RegionsController {
	
	private RegionService _regionService;
	@Autowired
	public RegionsController(RegionService regionService) {
		this._regionService = regionService;
	}
	
	@GetMapping("/getall")
	public List<Region> getAll(){
		return this._regionService.getAll();
	}
}
