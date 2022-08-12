package entity;

public class Employee {
	private String name;
	private String designation;
	private double salary;
	
	
	public Employee() {
		
	}
	
	public Employee(String name, String designation, double salary) {
		super();
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}
	
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Name: " + getName() + 
				"\nDesgination: " + getDesignation() + 
				"\nSalary :" + getSalary() + 
				"\n\n";
	}
	
	
}
