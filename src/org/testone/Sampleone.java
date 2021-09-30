package org.testone;


public class Sampleone {
	
	public void empName() {
		System.out.println("Employee name is Anand");
	}
	
	public void empMobno() {
		System.out.println("Employee mobile no is 8667070832");
	}
	
	public void empAdd() {
		System.out.println("Employee Add is Chennai");
	}
	
	public void empSalary() {
		System.out.println("Employee salary is $12000");
	}
	
	public static void main(String[] args) {
		
		Sampleone a = new Sampleone();
		
		a.empName();
		a.empMobno();
		a.empAdd();
		a.empSalary();
	}

}
