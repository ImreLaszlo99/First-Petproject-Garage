package Foodstorage;

public class Listing_Of_Cabinet {
	
	public static void main(String[] args) {
	
	Foods_list.loadData ();
	
	for (Aspects_of_Foods Foods: Cabinet.Foods) {
		
		System.out.println("Name of food: " + Foods.Foodname);
		System.out.println("Type of food: " + Foods.Foodtype);
		System.out.println("Date of Expire: " + Foods.DateOfExpire);
		System.out.println("Quantity of type in can/package or pieces: " + Foods.Quantity);
		System.out.println("Date of buy in month + day: " + Foods.DateOfBuy);
		System.out.println("-------------------------------------------------");

	}
	
	
	}
}
