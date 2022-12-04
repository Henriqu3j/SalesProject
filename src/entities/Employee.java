package entities;

public abstract class Employee {
	
	private String name	  	= null;
	private Double salary 	= null;
	private Double discount = null;
	
	public Employee() {
		
	}
		
	
	public Employee(String name, Double salary, Double discount) {
		super();
		this.name = name;
		this.salary = salary;
		this.discount = discount;
	}


	public abstract double estimatedSalary();
	
		
	public abstract String formated();
		
	
	public abstract void verification();


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Double getSalary() {
		return salary;
	}


	public void setSalary(Double salary) {
		this.salary = salary;
	}


	public Double getDiscount() {
		return discount;
	}


	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	
	
}
