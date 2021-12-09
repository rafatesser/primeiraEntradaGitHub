package entities;

public class Product {
	
	String name;
	double price;
	int quantity;
	
	public Product()
	{	
	}
	
	public Product(String name, double price, int quantity)
	{
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public double getPrice()
	{
		return this.price;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	public double totalValueStock()
	{
		double totalValue = price * quantity;
		return totalValue;
	}
	
	
	public void addProduct(int quantity)
	{
		this.quantity += quantity;
	}
	
	public void removeProduct(int quantity)
	{
		this.quantity -= quantity;
	}
	
}
