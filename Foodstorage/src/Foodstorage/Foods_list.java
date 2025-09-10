package Foodstorage;

public class Foods_list {

	public static void loadData () {
		
		Aspects_of_Foods Tomato = new Aspects_of_Foods ();
		Tomato.Foodname = "Tomato";
		Tomato.Foodtype = "Vegetable";
		Tomato.DateOfExpire = "Will be rotten within 1 week after collect";
		Tomato.Quantity = 100;
		Tomato.DateOfBuy = 910;
		Cabinet.Foods.add(Tomato);
		
		Aspects_of_Foods Burger = new Aspects_of_Foods ();
		Burger.Foodname = "Cheese Burger";
		Burger.Foodtype = "Junkfood";
		Burger.DateOfExpire = "Will be expired within 2 days";
		Burger.Quantity = 5;
		Burger.DateOfBuy = 909;
		Cabinet.Foods.add(Burger);
		
		Aspects_of_Foods Pasta = new Aspects_of_Foods ();
		Pasta.Foodname = "Pasta";
		Pasta.Foodtype = "Supplement";
		Pasta.DateOfExpire = "Will be expired within 1 year after produce";
		Pasta.Quantity = 1000;
		Pasta.DateOfBuy = 831;
		Cabinet.Foods.add(Pasta);
		
		Aspects_of_Foods Sandwitch_with_Pute = new Aspects_of_Foods ();
		Sandwitch_with_Pute .Foodname = "Sandwitch_with_Put";
		Sandwitch_with_Pute .Foodtype = "Sandwitch";
		Sandwitch_with_Pute .DateOfExpire = "Will be expired within 2 days";
		Sandwitch_with_Pute .Quantity = 5;
		Sandwitch_with_Pute .DateOfBuy = 909;
		Cabinet.Foods.add(Sandwitch_with_Pute );
		
		Aspects_of_Foods French_fries = new Aspects_of_Foods ();
		French_fries.Foodname = "French_fries";
		French_fries.Foodtype = "Junkfood";
		French_fries.DateOfExpire = "Will be expired within 1 week after produce, in freezer they will last until 1 year";
		French_fries.Quantity = 50;
		French_fries.DateOfBuy = 910;
		Cabinet.Foods.add(French_fries);
		
		Aspects_of_Foods Energy_Drink = new Aspects_of_Foods ();
		Energy_Drink.Foodname = "Energy_Drink";
		Energy_Drink.Foodtype = "Drink";
		Energy_Drink.DateOfExpire = "Will be expired within 2 years after produce";
		Energy_Drink.Quantity = 159;
		Energy_Drink.DateOfBuy = 731;
		Cabinet.Foods.add(Energy_Drink);
	}
	
	
}
