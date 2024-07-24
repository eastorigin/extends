package com.ktdsuniversity.edu.extendsexam;

public class MainVehicle {
	
	public static void startEngine(Vehicle vehicle) {
		vehicle.startCar();
	}
	
	public static void turboMode(SportsCar vehicle) {
		// SportsCar부터 turboMode()가 있기 때문에 SportsCar vehicle 이다
		vehicle.turboMode();
	}

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
		
		// IS A 관계
		// Sub Class is a Super Class
		Vehicle kona = new Vehicle("코나");
		Vehicle teslaModelX = new Ev("테스라 모델 엑스", 49);
		Vehicle forche = new SportsCar("911");
		Vehicle batCar2 = new BatMobile("베트카");
		
		Vehicle kona2 = new Vehicle("코나");
		Ev teslaModelX2 = new Ev("테스라 모델 엑스", 49);
		SportsCar forche2 = new SportsCar("911");
		BatMobile batCar3 = new BatMobile("베트카");
		
		startEngine(kona);
		startEngine(teslaModelX);
		startEngine(forche);
		startEngine(batCar2);
		
		startEngine(kona2);
		startEngine(teslaModelX2);
		startEngine(forche2);
		startEngine(batCar3);
		
		// turboMode(kona2); Vehicle에는 turboMode가 없음
		// turboMode(teslaModelX2); Ev에도 turboMode가 없음
		turboMode(forche2);
		turboMode(batCar3);
	}
}
