package entities;

public class OutSourcedEmployee extends Employeee{
	
	Double additionCharge;
	
	public OutSourcedEmployee() {
	}
	
	public OutSourcedEmployee(String name, Integer hour, Double valuePerHour, Double additionCharge) {
		super(name, hour, valuePerHour);
		this.additionCharge = additionCharge;
	}
	
	
	public Double getAdditionCharge() {
		return additionCharge;
	}

	public void setAdditionCharge(Double additionCharge) {
		this.additionCharge = additionCharge;
	}

	@Override
	public Double payment() {
		Double valuePay = super.payment() + (getAdditionCharge() * 1.10);
		return valuePay;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n+==============+");
		sb.append("\n+ Name: " + this.getName());
		sb.append("\n+ Worked hour: " + this.getHour());
		sb.append("\n+ Value per Word Hour: " + this.getValuePerHour());
		sb.append("\n+ Additional Charge: " + this.getAdditionCharge());
		sb.append("\n+ Amount received: " + this.payment());
		sb.append("\n+==============+");
		return sb.toString();
	}
	
}
