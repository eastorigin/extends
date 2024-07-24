package com.ktdsuniversity.edu.extendsexam;

public class Vehicle {

	private String model;
	
	public Vehicle(String model) {
		this.model = model;
	}
	
	public String getModel() {
		return model;
	}
	
	public void startCar() {
		System.out.println(this.model + "을 시동을 걸었다");
	}
	
	public void turnOffCar() {
		System.out.println(this.model + "을 시동 끄다");
	}
}
