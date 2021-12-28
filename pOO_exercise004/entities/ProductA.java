package entities;

public class ProductA {
	
	private String name;
	private Double price;
	
	public ProductA() {
	}
	
	public ProductA(String name, Double price) {
		setName(name);
		setPrice(price);
	}
	
	public String getName() {
		return this.name;
	}
	
	public Double getPrice() {
		return this.price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
}
