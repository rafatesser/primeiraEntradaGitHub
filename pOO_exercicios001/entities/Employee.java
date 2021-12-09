package entities;

public class Employee {
	
	String name;
	double grossSalary;
	double tax;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String n, double s, double t)
	{
		this.name = n;
		this.grossSalary = s;
		this.tax = t;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
	
	public double netSalary()
	{
		return getGrossSalary() - getTax();
	}
	
	public void increaseSalary(double increaser)
	{
		double x = getGrossSalary() + (getGrossSalary()*(increaser/100));
		setGrossSalary(x);
	}
	public String toString()
	{
		return String.format(" %s%nSalary: $%.2f", getName(), netSalary()); 
	}
	
}
