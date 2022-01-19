package entities;

public abstract class People {
	
	private String name;
	private Double annualIncome;
	
	public People() {
	}
	
	public People(String name, Double annualIncome) {
		this.name = name;
		this.annualIncome = annualIncome;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnnualIncome() {
		return this.annualIncome;
	}

	public void setAnnualIncome(Double annualIncome) {
		this.annualIncome = annualIncome;
	}

	public abstract Double imposto();
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Name: ");
		sb.append(getName());
		sb.append("\n");
		sb.append("Annual Income: ");
		sb.append(String.format("$%.2f \n", getAnnualIncome()));
		return sb.toString();
	}
	
}
