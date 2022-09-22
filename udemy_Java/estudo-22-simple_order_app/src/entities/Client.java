package entities;

import java.time.LocalDate;

public class Client {
	private String name;
	private String email;
	private LocalDate birthdate;
	
	public Client() {
		
	}

	public Client(String name, String email, LocalDate birthdate) {
		super();
		this.name = name;
		this.email = email;
		this.birthdate = birthdate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}
	
	public String toString() {
		return "Name: " 
				+ this.name 
				+ ", email: "
				+ this.email 
				+ ", birthdate: "
				+ this.birthdate;
	}
	
	
}
