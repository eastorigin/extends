package com.ktdsuniversity.edu.extendsexam;

public class BatMobile extends SportsCar{

	public BatMobile(String model) {
		super(model);
	}
	
	public void seperateBat() {
		String model = super.getModel();
		System.out.println(model + "에서 배트포트를 분리합니다");
		System.out.println("배트포트 분리");
	}
	
	@Override
	public void turboMode() {
		super.turboMode();
		this.seperateBat();
	}
}
