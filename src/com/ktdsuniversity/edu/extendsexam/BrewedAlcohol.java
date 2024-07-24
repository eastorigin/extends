package com.ktdsuniversity.edu.extendsexam;

public class BrewedAlcohol extends Liquor{
	
	private String brewedAlcoholName;
	
	public BrewedAlcohol(String type, String kind, int alcoholDegree, String brewedAlcoholName) {
		super(type, kind, alcoholDegree);
		this.brewedAlcoholName = brewedAlcoholName;
	}

}
