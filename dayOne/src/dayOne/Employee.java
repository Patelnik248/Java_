package dayOne;

public class Employee {
	
	private String name,designation,email;
	private int salaray;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getSalaray() {
		return salaray;
	}
	public void setSalaray(int salaray) {
		this.salaray = salaray;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", designation=" + designation + ", email=" + email + ", salaray=" + salaray
				+ "]";
	}
	
	

}
