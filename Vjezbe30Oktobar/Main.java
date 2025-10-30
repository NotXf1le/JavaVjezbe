	package Default;
	public class Main {
	
		public static void main(String[] args) {
			
			Automobil auto = new Automobil("WV", 2021, 1500, "Zuta", 5, "Dizel" );
			Kamion kamion = new Kamion("Mercedes", 2011, 5000, "Zelena", 500, true );
			Kombi kombi = new Kombi("Audi", 1998, 2500, "Crna", 25);
	
			System.out.println(auto.toString() + "\n");
			System.out.println(kamion.toString() + "\n");
			System.out.println(kombi.toString() + "\n");
	
	
		}
	
	}
