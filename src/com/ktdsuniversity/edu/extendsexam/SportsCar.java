package com.ktdsuniversity.edu.extendsexam;

public class SportsCar extends Vehicle {
	
	public SportsCar (String model) {
		super(model);
	}
	
	public void turboMode() {
		System.out.println("터보 보드 실행");
	}
	
	@Override
	public void startCar() {
		super.startCar();
		this.turboMode();
	}

}
