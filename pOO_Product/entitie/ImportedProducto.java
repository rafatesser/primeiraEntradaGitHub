package entitie;

public class ImportedProducto extends Producto {
	
	private Double customFee;
	
	public ImportedProducto() {	
	}
	
	public ImportedProducto(String name, Double price, Double customFee) {
		super(name, price);
		setCustomFee(customFee);
	}

	public Double getCustomFee() {
		return customFee;
	}

	public void setCustomFee(Double customFee) {
		this.customFee = customFee;
	}
	
	@Override
	public String priceTag() {
		String pt = String.format("%.2f", this.totalPrice());
		return pt;
	}
	
	public Double totalPrice() {
		Double tp = super.getPrice() + (super.getPrice() * (this.getCustomFee()/100));
		return tp;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getName());
		sb.append(" $" + this.priceTag());
		sb.append(" (Customs Fee: $");
		sb.append(getCustomFee());
		sb.append(" ) ");
		return sb.toString();
	}
}
