package entitie;

public class Producto {
	
	private String name;
	private Double price;
	
	public Producto() {
	}
	
	public Producto(String name, Double price) {
		this.setName(name);
		this.setPrice(price);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public String priceTag() {
		String pt = String.format("%.2f" , getPrice());
		return pt;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getName());
		sb.append(" $" + this.priceTag());
		return sb.toString();
	}
}
