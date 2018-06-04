package com.EmpPayroll.domain;

public class Car extends Vehicle implements IPrintable {
	
	private String typeOfTransmission;
	private String color;
	
	
	
	public String getTypeOfTransmission() {
		return typeOfTransmission;
	}
	public void setTypeOfTransmission(String typeOfTransmission) {
		this.typeOfTransmission = typeOfTransmission;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public void printMyData() {
		// TODO Auto-generated method stub
		System.out.println(this.color + "\n" + this.typeOfTransmission);
	}
	
	

}
