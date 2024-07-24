package com.ktdsuniversity.edu.extendsexam;

public class ContactMain {

	public static void main(String[] args) {
		
		Contact[] contactArray = new Contact[5];
		contactArray[0] = new Contact("민창", "010-1234-1234");
		contactArray[1] = new Contact("MJ", "010-4321-4321");
		contactArray[2] = new Contact("Spider Man", "010-9876-5432");
		contactArray[3] = new Contact("팀쿡", "010-1234-5432");
		contactArray[4] = new EmailContact("김", "010-1234-9876", "kim@korea.com");
		
		for(int i = 0; i < contactArray.length; i++) {
			contactArray[i].printContact();
			contactArray[i].phoneCall(); // phoneCall()을 Contact에 만들어서 [4]도 실행된다
			
			if(contactArray[i] instanceof EmailContact) {// i = 4일 때만 true
				// EmailContact is a Contact (0)
				// Contact is not a EmailContact
				// is a 관계가 역전되어있을 경우, 명시적 형변환을 사용
				EmailContact emailContactInstance = (EmailContact) contactArray[i];
				emailContactInstance.sendEmail();
			}
			// contactArray[i].sendEmail(); // Contact 클래스에는 sendEmail()이 없어서 작동 안 된다
		}
//		Contact minchang = new Contact("민창", "010-1234-1234");
//		minchang.printContact();
//		
//		Contact mj = new Contact("MJ", "010-4321-4321");
//		mj.printContact();
	}
}
