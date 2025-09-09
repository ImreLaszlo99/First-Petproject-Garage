package Garage;

public class Cartypes_Final_Listing {

	public static void main(String[] args) {
		
		Cartypes_Listing.loadData();
		
		for (Cartypes car: Cartypes_Storage.cars) {
			System.out.println("Rendszám:" + car.licensePlatenumber);
			System.out.println("Márka:" + car.Cartype);
			System.out.println("Altípus:" + car.Carbrand);
			System.out.println("Származási ország:" + car.Country);
			System.out.println("Ülések száma:" + car.numberofseats);
			System.out.println("Végsebesség:" + car.maximumspeed);
			System.out.println("Gyorsulási idő mp-ben 0-ról 100 km/h-ra:" + car.accelerationtime);
			System.out.println("--------------------------------------");
		}
		
	}
	
	}
	

