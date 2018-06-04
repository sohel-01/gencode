package com.EmpPayroll.domain;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Intern e1 = new Intern();
		Car vh = new Car();
		vh.setMaker("Toyato");
		vh.setRegPlate("ABC 123");
		vh.setColor("Maroon");
		vh.setTypeOfTransmission("Automatic");
		
		e1.setAge(23);
		e1.setName("Testing");
		e1.setVehicle(vh);
		e1.setSchoolName("lambton");
		e1.setEarnings(1200);
		
		e1.printMyData();
	}

}
