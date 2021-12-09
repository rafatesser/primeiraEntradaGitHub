package util;

public class CalculatorAdjustSalary {
	
	public static Double adjustSalary(Double salary, Double adjust) {
		Double adjustSalary = salary + (salary * (adjust/100));
		return adjustSalary;
	}
}
