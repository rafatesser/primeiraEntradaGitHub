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
		Double tp = super.getPrice() * this.getCustomFee();
		return tp;
	}
}
