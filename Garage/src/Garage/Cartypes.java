package Garage;

public class Cartypes {

		String licensePlatenumber;
		String Cartype;
		String Carbrand;
		String Country;
		int numberofseats;
		int maximumspeed;
		int accelerationtime;
		static String licensePlatenumberformat = "ABC-123";
		
		Cartypes () {
		}
		
		public Cartypes (String licensePlatenumber, String Cartype, String Carbrand, String Country, int numberofseats, int maximumspeed, int accelerationtime) {
			this.licensePlatenumber = licensePlatenumber;
			this.Cartype = Cartype;
			this.Carbrand = Carbrand;
			this.Country = Country;
			this.numberofseats = numberofseats;
			this.maximumspeed = maximumspeed;
			this.accelerationtime = accelerationtime;
			
		}
		
		
		
	}
	

