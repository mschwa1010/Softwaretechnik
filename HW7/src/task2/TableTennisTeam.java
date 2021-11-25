package task2;

public class TableTennisTeam implements Team{
	
	private String name;
	
	private int numberOfMedals;
	private int numberOfAthletes;
	
	public TableTennisTeam(String name, int numberOfMedals, int numberOfAthletes) {
		super();
		this.name = name;
		this.numberOfMedals = numberOfMedals;
		this.numberOfAthletes = numberOfAthletes;
	}

	@Override
	public void printNameAndNumberOfMedals() {
		System.out.println("\t\t\t\t"+"Team: "+ name + "'s "+ this.getClass().getSimpleName() + ", Number of Medals: "+ numberOfMedals);
	}

	@Override
	public void printNameAndNumberOfAthletes() {
		System.out.println("\t\t\t\t"+"Team: "+ name + "'s "+ this.getClass().getSimpleName() + ", Number of Athletes: "+ numberOfAthletes);
	}
	

}
