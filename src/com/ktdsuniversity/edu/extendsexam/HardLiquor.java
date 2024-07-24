package com.ktdsuniversity.edu.extendsexam;

public class HardLiquor extends Liquor{
	
	private String liquorName;
	
	public HardLiquor(String type, String kind,int alcoholDegree, String liquorName) {
		super(type, kind, alcoholDegree);
		this.liquorName = liquorName;
	}

}
