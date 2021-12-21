package entities;

public class Department {
	
	private String name;
	
	public Department() {
		
	}
	
	public Department(String name) {
		setName(name);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

	@Override
	public String toString() {
		return "Department [name=" + name + "]";
	}
	
}
