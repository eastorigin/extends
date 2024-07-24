package com.ktdsuniversity.edu.extendsexam;

public class BatMobile extends SportsCar{

	public BatMobile(String model) {
		super(model);
	}
	
	public void seperateBat() {
		System.out.println("배트포트 분리");
	}
	
	@Override
	public void turboMode() {
		super.turboMode();
		this.seperateBat();
	}
}
