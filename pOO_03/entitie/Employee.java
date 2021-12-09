package entitie;

public class Employee {
	
	private Integer id;
	private String name;
	private Double salary;
	
	public Employee(Integer id, String name, Double salary) {
		setId(id);
		setName(name);
		setSalary(salary);
	}
	
	public Integer getId() {
		return this.id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getSalary() {
		return this.salary;
	}
	
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public String toString(Integer x) {
		String message = String.format("Employee #%d:%n"
									+  "Id: %d%n"
									+  "Name: %s%n"
									+  "Salary: %.2f%n"
									+  "---------------%n", x, this.getId(), this.getName(), this.getSalary());
		return message;
	}
	
	public String toString() {
		String message = String.format("Employee%n"
									+  "Id: %d%n"
									+  "Name: %s%n"
									+  "Salary: %.2f%n"
									+  "---------------%n", this.getId(), this.getName(), this.getSalary());
		return message;
	}
}
