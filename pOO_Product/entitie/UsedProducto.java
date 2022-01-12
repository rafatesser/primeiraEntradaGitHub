package entitie;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProducto extends Producto{
	
	SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
	private Date manufactureDate;
	
	public UsedProducto() {
		
	}
	
	public UsedProducto(String name, Double price, Date manufactureDate) {
		super(name, price);
		setManufactureDate(manufactureDate);
	}

	public Date getManufactureDate() {
		return this.manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getName());
		sb.append(" (used) ");
		sb.append(" $" + this.priceTag());
		sb.append(" ( Manufacture date: ");
		sb.append(date.format(getManufactureDate()));
		sb.append(" )");
		return sb.toString();
	}
}
