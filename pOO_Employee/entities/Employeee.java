package entities;

public class Employeee {
	
	String name;
	Integer hour;
	Double valuePerHour;
	
	public Employeee() {
		
	}
	
	public Employeee(String name, Integer hour, Double valuePerHour) {
		this.name = name;
		this.hour = hour;
		this.valuePerHour = valuePerHour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHour() {
		return hour;
	}

	public void setHour(Integer hour) {
		this.hour = hour;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
	
	public Double payment() {
		Double valuePay = getValuePerHour() * getHour();
		return valuePay;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n+==============+");
		sb.append("\n+ Name: " + this.getName());
		sb.append("\n+ Worked hour: " + this.getHour());
		sb.append("\n+ Value per Word Hour: " + this.getValuePerHour());
		sb.append("\n+ Amount received: " + this.payment());
		sb.append("\n+==============+");
		return sb.toString();
	}
	
}
