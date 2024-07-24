package com.ktdsuniversity.edu.extendsexam;

public class Ev extends Vehicle {

	private int amountBattery;
	
	public Ev(String model, int amountBattery) {
		super(model);
		this.amountBattery = amountBattery;
	}
	
	public void checkBattery() {
		System.out.println("베터리 양: " + this.amountBattery);
	}
	
	@Override
	public void startCar() {
		super.startCar();
		this.checkBattery();
	}
}
