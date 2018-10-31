package de;
 
public class Employee {
	//Private variable
	private String firstname;
	private String lastname;
	private int salary;
	
	//constructor
	public Employee() {}
	//constructor
	public Employee(String fn, String ln, int sl) {
		this.setSalary(sl);
		this.setFirstName(fn);
		this.setLastName(ln);
	}
	
	//Get methods
	public String getFirstName() {
		return this.firstname;
	}
	public String getLastName() {
		return this.lastname;
	}
	public int getSalary() {
		return this.salary;
	}
	
	//Set methods
	public void setFirstName(String fn) {
		this.firstname=fn;
	}
	public void setLastName(String ln) {
		this.lastname=ln;
	}
	public void setSalary(int sl) {
		this.salary=sl;
	}
	
	
	
}
