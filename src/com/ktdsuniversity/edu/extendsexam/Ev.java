package com.ktdsuniversity.edu.extendsexam;

public class Ev extends Vehicle {

	private int amountBattery;
	
	public Ev(String model, int amountBattery) {
		super(model); // 상위클래스 생성자가 먼저 호출되어야 에러가 안 난다
		this.amountBattery = amountBattery;
	}
	
	public void checkBattery() {
		String model = super.getModel();
		System.out.println("자동차 모델명: " + model);
		System.out.println("베터리 양: " + this.amountBattery);
		if(this.amountBattery > 50) {
			System.out.println("베터리 용량이 충분합니다");
		}else {
			System.out.println("충전이 필요합니다");
		}
	}
	
	@Override
	public void startCar() {
		super.startCar();
		this.checkBattery();
		super.turnOffCar();
	}
}
