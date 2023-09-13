package project.northwind.entities.concretes;

import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Orders")
public class Order {
	
	@Id
	@GeneratedValue
	@Column(name="order_id")
	private int orderId;
	
	@Column(name="customer_id")
	private String customerId;
	
	@Column(name="employee_id")
	private int employeeId;
	
	@Column(name="order_date")
	private Date orderDate;
	
	@Column(name="required_date")
	private Date requiredDate;
	
	@Column(name="shipped_date")
	private Date shippedDate;
	
	@Column(name="ship_via")
	private short shipVia;
	
	@Column(name="freight")
	private float freight;
	
	@Column(name="ship_name")
	private String shipName;
	
	@Column(name="ship_address")
	private String shipAddress;
	
	@Column(name="ship_city")
	private String shipCity;
	
	@Column(name="ship_region")
	private String shipRegion;
	
	@Column(name="ship_postal_code")
	private String shipPostalCode;
	
	@Column(name="ship_country")
	private String shipCountry;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(short orderId) {
		this.orderId = orderId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(short employeeId) {
		this.employeeId = employeeId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Date getRequiredDate() {
		return requiredDate;
	}

	public void setRequiredDate(Date requiredDate) {
		this.requiredDate = requiredDate;
	}

	public Date getShippedDate() {
		return shippedDate;
	}

	public void setShippedDate(Date shippedDate) {
		this.shippedDate = shippedDate;
	}

	public short getShipVia() {
		return shipVia;
	}

	public void setShipVia(short shipVia) {
		this.shipVia = shipVia;
	}

	public double getFreight() {
		return freight;
	}

	public void setFreight(float freight) {
		this.freight = freight;
	}

	public String getShipName() {
		return shipName;
	}

	public void setShipName(String shipName) {
		this.shipName = shipName;
	}

	public String getShipAddress() {
		return shipAddress;
	}

	public void setShipAddress(String shipAddress) {
		this.shipAddress = shipAddress;
	}

	public String getShipCity() {
		return shipCity;
	}

	public void setShipCity(String shipCity) {
		this.shipCity = shipCity;
	}

	public String getShipRegion() {
		return shipRegion;
	}

	public void setShipRegion(String shipRegion) {
		this.shipRegion = shipRegion;
	}

	public String getShipPostalCode() {
		return shipPostalCode;
	}

	public void setShipPostalCode(String shipPostalCode) {
		this.shipPostalCode = shipPostalCode;
	}

	public String getShipCountry() {
		return shipCountry;
	}

	public void setShipCountry(String shipCountry) {
		this.shipCountry = shipCountry;
	}

	public Order() {}
	
	public Order(short orderId, String customerId, short employeeId, Date orderDate, Date requiredDate,
			Date shippedDate, short shipVia, float freight, String shipName, String shipAddress, String shipCity,
			String shipRegion, String shipPostalCode, String shipCountry) {
		super();
		this.orderId = orderId;
		this.customerId = customerId;
		this.employeeId = employeeId;
		this.orderDate = orderDate;
		this.requiredDate = requiredDate;
		this.shippedDate = shippedDate;
		this.shipVia = shipVia;
		this.freight = freight;
		this.shipName = shipName;
		this.shipAddress = shipAddress;
		this.shipCity = shipCity;
		this.shipRegion = shipRegion;
		this.shipPostalCode = shipPostalCode;
		this.shipCountry = shipCountry;
	}
}
