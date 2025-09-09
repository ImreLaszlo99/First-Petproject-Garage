package Garage;

public class Cartypes_Listing {

	public static void loadData() {
		
	Cartypes Toyotacorolla = new Cartypes();
	Toyotacorolla.licensePlatenumber = "XTR-842";
	Toyotacorolla.Cartype = "Toyota";
	Toyotacorolla.Carbrand = "Corolla";
	Toyotacorolla.Country = "Japan";
	Toyotacorolla.numberofseats = 5;
	Toyotacorolla.maximumspeed = 180;
	Toyotacorolla.accelerationtime = 10;
	Cartypes_Storage.cars.add(Toyotacorolla);
	
	Cartypes FordMustangGT = new Cartypes();
	FordMustangGT.licensePlatenumber = "GNL-563";
	FordMustangGT.Cartype = "Ford";
	FordMustangGT.Carbrand = "Mustang GT";
	FordMustangGT.Country = "USA";
	FordMustangGT.numberofseats = 4;
	FordMustangGT.maximumspeed = 260;
	FordMustangGT.accelerationtime = 4;
	Cartypes_Storage.cars.add(FordMustangGT);
	
	Cartypes BmwM3 = new Cartypes();
	BmwM3.licensePlatenumber = "MRK-291";
	BmwM3.Cartype = "BMW";
	BmwM3.Carbrand = "M3";
	BmwM3.Country = "Germany";
	BmwM3.numberofseats = 5;
	BmwM3.maximumspeed = 250;
	BmwM3.accelerationtime = 4;
	Cartypes_Storage.cars.add(BmwM3);
	
	Cartypes TeslaModel3Perfomance = new Cartypes();
	TeslaModel3Perfomance.licensePlatenumber = "HVD-730";
	TeslaModel3Perfomance.Cartype = "Tesla";
	TeslaModel3Perfomance.Carbrand = "Model 3 Perfomance";
	TeslaModel3Perfomance.Country = "USA";
	TeslaModel3Perfomance.numberofseats = 5;
	TeslaModel3Perfomance.maximumspeed = 261;
	TeslaModel3Perfomance.accelerationtime = 3;
	Cartypes_Storage.cars.add(TeslaModel3Perfomance);
	
	Cartypes VolkswagenGolfGTI = new Cartypes();
	VolkswagenGolfGTI.licensePlatenumber = "LXP-119";
	VolkswagenGolfGTI.Cartype = "Volkswagen";
	VolkswagenGolfGTI.Carbrand = "Golf GTI";
	VolkswagenGolfGTI.Country = "Germany";
	VolkswagenGolfGTI.numberofseats = 5;
	VolkswagenGolfGTI.maximumspeed = 240;
	VolkswagenGolfGTI.accelerationtime = 6;
	Cartypes_Storage.cars.add(VolkswagenGolfGTI);
	
}}
