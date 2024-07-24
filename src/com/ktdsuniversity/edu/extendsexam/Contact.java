package com.ktdsuniversity.edu.extendsexam;

public class Contact {

	private String name;
	private String phone;
	
	/**
	 * 사용자의 추가 요청으로 주소 추가
	 */
	private String address;
	
	public Contact(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void printContact() {
		System.out.println("이름: " + this.name + ", 연락처: " + this.phone + ", 주소: " + this.address);
	}
	
	public void phoneCall() {
		System.out.println("이름: " + this.name + "에게 전화를 겁니다");
	}
}
