package com.ktdsuniversity.edu.extendsexam;

public class ContactMain {

	public static void main(String[] args) {
		
		Contact[] contactArray = new Contact[4];
		contactArray[0] = new Contact("민창", "010-1234-1234");
		contactArray[1] = new Contact("MJ", "010-4321-4321");
		contactArray[2] = new Contact("Spider Man", "010-9876-5432");
		contactArray[3] = new Contact("팀쿡", "010-1234-5432");
		
		for(int i = 0; i < contactArray.length; i++) {
			contactArray[i].printContact();
		}
		
		EmailContact kim = new EmailContact("kim", "010-1234-9876", "kim@korea.com");
		kim.printContact();
		
//		Contact minchang = new Contact("민창", "010-1234-1234");
//		minchang.printContact();
//		
//		Contact mj = new Contact("MJ", "010-4321-4321");
//		mj.printContact();
	}
}
