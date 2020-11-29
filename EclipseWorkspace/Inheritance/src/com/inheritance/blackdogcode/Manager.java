/**
 * 
 */
package com.inheritance.blackdogcode;

/**
 * @author blackdogcode
 *
 */
public class Manager extends Employee {

	private double bonus;
	
	Manager() {
		super();
		this.bonus = 0.0;
	}
	
	Manager(String name, double salary, int hireYear, int hireMonth, int hireDay) {
		super(name, salary, hireYear, hireMonth, hireDay);
		this.bonus = 0.0;
	}
	
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	@Override
	public double getSalary() {
		return super.getSalary() + this.bonus; 
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n" + "Bonus: " + this.bonus + "$";
	}
}
