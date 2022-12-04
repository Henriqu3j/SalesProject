package entities;

public class Cashier extends Employee {
	private Integer cashier = null;

	public Cashier() {
		
	}
	 
		
	public Cashier(String name, Double salary, Double discount, Integer cashier) {
		super(name, salary, discount);
		this.cashier = cashier;
	}


	public Integer getCashier() {
		return cashier;
	}

	public void setCashier(Integer cashier) {
		this.cashier = cashier;
	}


	@Override
	public double estimatedSalary() {
		return getSalary() + getDiscount();
	}


	@Override
	public String formated() {
		return "Name " + getName() + "Guiche : " + getCashier() + "Salário base : " + getSalary() + "Salário final : " + estimatedSalary() + "";
	}


	@Override
	public void verification() {
		// TODO Auto-generated method stub
		
	}


	
	
}
