/**
 * 
 */
package com.inheritance.blackdogcode;

/**
 * @author black
 *
 */
public class EmplyeeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Manager boss = new Manager("Liam, Song", 10000, 1990, 11, 17);
		boss.setBonus(3500);
		
		Employee[] emps = new Employee[3];
		emps[0] = boss;
		emps[1] = new Employee("Kirito", 6000, 2007, 12, 5);
		emps[2] = new Employee("ponneu", 7000, 1988, 12, 28);
		
		for (var e : emps) {
			System.out.println(e.toString() + "\n");
		}
	}
}
