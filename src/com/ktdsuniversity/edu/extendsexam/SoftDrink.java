package com.ktdsuniversity.edu.extendsexam;

public class SoftDrink extends Beverage{

	private boolean isSoda;
	
	public SoftDrink(String type, boolean isSoda) {
		super(type);
		this.isSoda = isSoda;
	}
}
