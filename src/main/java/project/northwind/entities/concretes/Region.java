package project.northwind.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Region")
public class Region {

	@Id
	@GeneratedValue
	@Column(name="region_id")
	private int regionId;
	
	@Column(name="region_description")
	private String regionDescription;

	public int getRegionId() {
		return regionId;
	}

	public void setRegionId(int regionId) {
		this.regionId = regionId;
	}

	public String getRegionDescription() {
		return regionDescription;
	}

	public void setRegionDescription(String regionDescription) {
		this.regionDescription = regionDescription;
	}

	public Region() {}
	public Region(int regionId, String regionDescription) {
		super();
		this.regionId = regionId;
		this.regionDescription = regionDescription;
	}
	
	
}
