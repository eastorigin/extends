package com.ktdsuniversity.edu.extendsexam;

public class SportsCar extends Vehicle {
	
	public SportsCar (String model) {
		super(model);
	}
	
	public void turboMode() {
		String model = super.getModel();
		System.out.println(model + "이(가) 터보 엔진을 시작합니다");
		System.out.println("터보 모드 실행");
	}
	
	@Override
	public void startCar() {
		super.startCar();
		this.turboMode();
		super.turnOffCar();
	}

}
