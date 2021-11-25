package task2;

public class Task2Main {
	
	public static void main(String[] args) {
		
		Team waterpoolTeam = new WaterpoolTeam("Womens", 23, 12);
		Team teakwondoTeam = new TeakwondoTeam("Womens", 12, 11);
		Team gymnastics = new ArtisticGymnasticsTeam("Womens", 4, 21);
		
		WomensTeam chinaWomens = new WomensTeam("China");
		chinaWomens.addTeam(teakwondoTeam);
		chinaWomens.addTeam(waterpoolTeam);
		chinaWomens.addTeam(gymnastics);
		
		
		Team shootingTeam = new ShootingTeam("Mens", 12, 55);

		MensTeam chinaMens = new MensTeam("China");
		chinaMens.addTeam(shootingTeam);
		
		NationalTeam china = new NationalTeam("China");
		china.addTeam(chinaWomens);
		china.addTeam(chinaMens);

		
		Team cyclingTeam = new CyclingTeam("Womens", 143, 12);
		Team tennisTeam = new TennisTeam("Womens", 123, 4);
		
		WomensTeam germanyWomens = new WomensTeam("Germany");
		germanyWomens.addTeam(tennisTeam);
		germanyWomens.addTeam(cyclingTeam);
		
		Team tableTennis = new TableTennisTeam("Mens", 1121, 1);
		Team footballTeam = new FootballTeam("Mens", 1212, 15);
		
		MensTeam germanyMens = new MensTeam("Germany");
		germanyMens.addTeam(footballTeam);
		germanyMens.addTeam(tableTennis);
		
		NationalTeam germany = new NationalTeam("Germany");
		germany.addTeam(germanyWomens);
		germany.addTeam(germanyMens);
		
		ContinentalTeam asia = new ContinentalTeam("Asia");
		asia.addTeam(china);
		
		ContinentalTeam europe = new ContinentalTeam("Europe");
		asia.addTeam(germany);
		
		OlympicsTeam games2024 = new OlympicsTeam("Games 2024");
		games2024.addTeam(asia);
		games2024.addTeam(europe);
		
		
		games2024.printNameAndNumberOfAthletes();
		germany.printNameAndNumberOfMedals();
	}

}
