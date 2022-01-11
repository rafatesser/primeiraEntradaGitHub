package entitie;

import java.util.Date;

public class UsedProducto extends Producto{
	
	private Date manufactureDate;
	
	public UsedProducto() {
		
	}
	
	public UsedProducto(String name, Double price, Date manufactureDate) {
		super(name, price);
		setManufactureDate(manufactureDate);
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
}
