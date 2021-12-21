package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities_enum.WorkerLevel;

public class Worker {
	
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	private Department department;
	private List<HourContract> contracts = new ArrayList<>();
	
	public Worker() {	
	}
	
	public Worker(	String name, WorkerLevel level, 
					Double baseSalary, Department department) {
		setName(name);
		setLevel(level);
		setBaseSalary(baseSalary);
		setDepartment(department);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}
	
	public void addContract(HourContract contracts) {
		this.contracts.add(contracts);
	}
	
	public void removeContract(HourContract contracts) {
		this.contracts.remove(contracts);
	}
	
	public Double incomeYear(Integer year, Integer month) {
		Double sum = baseSalary;
		Calendar cal = new Calendar();
		
		for (HourContract c : contracts)
		{
			cal.setTime(c.getDate());
			int month_c = cal.get(Calendar.MONTH);
			int year_c = cal.get(Calendar.YEAR);
		
			if(month_c == month && year_c == year)
			{
				sum += c.totalValue();
			}
		}
		return sum;
	}
}
