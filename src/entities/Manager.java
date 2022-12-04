package entities;

public class Manager extends Employee {
	private Double SalesComisson = null; 

	public Manager() {
		
	}
	
	public Manager(String name, Double salary, Double discount, Double salesComisson) {
		super(name, salary, discount);
		SalesComisson = salesComisson;
	}


	@Override
	public double estimatedSalary() {
		return ((getSalary()-getDiscount())+SalesComisson);
	}

	@Override
	public String formated() {
		
		return "Name : " + getName() + " Salário base : " + getSalary() + " Salário final : " + estimatedSalary();
	}

	@Override
	public void verification() {
		
	}
	
}
