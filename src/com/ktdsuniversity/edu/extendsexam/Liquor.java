package com.ktdsuniversity.edu.extendsexam;

public class Liquor extends Beverage{
	
	private String kind;
	private int alcoholDegree;
	
	public Liquor(String type, String kind, int alcoholDegree) {
		super(type);
		this.kind = kind;
		this.alcoholDegree = alcoholDegree;
	}

}
