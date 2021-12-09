package entitie;

public class Product {
	
	private String name;
	private double price;
	
	//Default Constructor 
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	//Constructor with parameters
	public Product(String name, double price)
	{
		this.setName(name);
		this.setPrice(price);
	}
	
	//Method return name;
	public String getName() {
		return this.name;
	}
	
	///Method input a value in name
	public void setName(String name) {
		this.name = name;
	}
	
	//Method return price
	public double getPrice() {
		return this.price;
	}
	
	//Method input a value in price
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString() {
		String message = "Valor do " + getName() + " é de R$ " + getPrice() + " a unidade.";
		return message;
	}
	
}
