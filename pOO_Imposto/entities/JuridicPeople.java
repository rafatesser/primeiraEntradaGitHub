package entities;

public class JuridicPeople extends People{
	
	private Integer employee;

	public JuridicPeople() {
	}
	
	public JuridicPeople(String name, Double annualIncome, Integer employee) {
		super(name, annualIncome);
		this.employee = employee;
	}
	
	public Integer getEmployee() {
		return employee;
	}

	public void setEmployee(Integer employee) {
		this.employee = employee;
	}
	
	@Override
	public Double imposto() {
		if(getEmployee() <= 10)
			return getAnnualIncome() * (0.16);
		else
			return getAnnualIncome() * (0.14);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("Number of Employees: ");
		sb.append(String.format("%d", this.getEmployee()));
		return sb.toString();
	}
}
