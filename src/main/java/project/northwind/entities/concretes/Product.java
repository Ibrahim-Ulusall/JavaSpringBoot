package project.northwind.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Products")
public class Product {
	@Id
	@GeneratedValue
	@Column(name="product_id")
	private int id;
	
	@Column(name="category_id")
	private int categoryId;

	@Column(name="product_name")
	private String productName;
	
	@Column(name="units_in_stock")
	private short unitsInStock;
	
	@Column(name="unit_price")
	private double unitPrice;
	
	@Column(name="quantity_per_unit")
	private String quantityPerUnit;
	
	public Product() {}
	
	public Product(int id, int categoryId, String productName, short unitsInStock, double unitPrice,
			String quantityPerUnit) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.productName = productName;
		this.unitsInStock = unitsInStock;
		this.unitPrice = unitPrice;
		this.quantityPerUnit = quantityPerUnit;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public short getUnitsInStock() {
		return unitsInStock;
	}
	public void setUnitsInStock(short unitsInStock) {
		this.unitsInStock = unitsInStock;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getQuantityPerUnit() {
		return quantityPerUnit;
	}
	public void setQuantityPerUnit(String quantityPerUnit) {
		this.quantityPerUnit = quantityPerUnit;
	}
	
}
