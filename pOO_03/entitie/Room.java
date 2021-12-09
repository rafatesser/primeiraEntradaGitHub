package entitie;

public class Room {
	
	private String name;
	private String email;
	
	public Room(String name, String email) {
		// TODO Auto-generated constructor stub
		setName(name);
		setEmail(email);
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail(){
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		String message = 
				String.format("Estudante: %s%n"
							+ "e-Mail: %s%n"
							+ "-------------------%n", getName(), getEmail());
		return message;
		
	}
}
