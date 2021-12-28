package entities;

import java.util.Date;

public class ClientA {
	
	private String name;
	private String email;
	private Date birthDate;
	
	public ClientA() {
	}
	
	public ClientA(String name, String email, Date birthDate) {
		setName(name);
		setEmail(email);
		setBirthDate(birthDate);
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public Date getBirthDate() {
		return this.birthDate;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
}
