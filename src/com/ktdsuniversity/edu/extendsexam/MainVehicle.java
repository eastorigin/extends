package com.ktdsuniversity.edu.extendsexam;

public class MainVehicle {

	public static void main(String[] args) {
		Vehicle[] vehicleArray = new Vehicle[3];
		vehicleArray[0] = new Vehicle("그랜져");
		vehicleArray[1] = new Vehicle("sm5");
		vehicleArray[2] = new Vehicle("쏘나타");
		
		for(int i = 0; i < vehicleArray.length; i++) {
			vehicleArray[i].startCar();
		}
		
		Ev ev9 = new Ev("ev9", 78);
		ev9.startCar();
		
		SportsCar bmwi8 = new SportsCar("bmwi8");
		bmwi8.startCar();
		
		BatMobile batCar = new BatMobile("batcar");
		batCar.startCar();
	}
}
