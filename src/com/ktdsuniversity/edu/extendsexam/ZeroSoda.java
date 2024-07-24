package com.ktdsuniversity.edu.extendsexam;

public class ZeroSoda extends SoftDrink{
	
	private int calorie;
	private String zeroSodaName;
	
	public ZeroSoda(String type, boolean isSoda, String zeroSodaName, int calorie) {
		super(type, isSoda);
		this.zeroSodaName = zeroSodaName;
		this.calorie = calorie;
	}

}
