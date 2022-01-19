package entities;

public class SinglePeople extends People{
	
	private Double healthPlan;
	
	public SinglePeople() {
		super();
	}
	
		
	public SinglePeople(String name, Double annualIncome, Double healthPlan) {
		super(name, annualIncome);
		this.healthPlan = healthPlan;
	}


	public Double getHealthPlan() {
		return healthPlan;
	}
	public void setHealthPlan(Double healthPlan) {
		this.healthPlan = healthPlan;
	}
	@Override
	public Double imposto() {
		if (getAnnualIncome() < 20000.00)
		{
			if(getHealthPlan() > 0)
				return ((getAnnualIncome() * (0.15)) - (getHealthPlan() * (0.50)));
			else
				return (getAnnualIncome() * (0.15));
		}
		else
		{
			if(getHealthPlan() > 0)
				return ((getAnnualIncome() * (0.25)) - (getHealthPlan() * (0.50)));
			else
				return (getAnnualIncome() * (0.25));
		}
		
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("Health Plan: ");
		sb.append(String.format("$%.2f", this.getHealthPlan()));
		return sb.toString();
	}
	
}
