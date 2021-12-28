package entities;

public class OrderItemA {
	
	private Integer quantity;
	private Double price;
	private ProductA product;
	
	public OrderItemA() {
		
	}
	
	public OrderItemA(Integer quantity, ProductA product) {
		this.quantity = quantity;
		this.product = product;
	}
	
	public Integer getQuatity()
	{
		return this.quantity;
	}
	
	public Double getPrice()
	{
		return this.price;
	}
	
	public ProductA getProduct() {
		return this.product;
	}
	
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public void setPrice() {
		this.price = getTotalPriceItem();
	}
	
	public void setProductA(ProductA product) {
		this.product = product;
	}
	
	public Double getTotalPriceItem() {
		return product.getPrice() * getQuatity();
	}
}
