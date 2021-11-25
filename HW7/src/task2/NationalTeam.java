package task2;

import java.util.ArrayList;

public class NationalTeam implements Team{
	
private String name;
	
	private ArrayList<Team> childTeams;
	
	public NationalTeam(String name) {
		super();
		this.name = name;
		childTeams = new ArrayList<Team>();
	}

	@Override
	public void printNameAndNumberOfMedals() {
		System.out.println("\t\t"+name + "'s " + this.getClass().getSimpleName() + ":");
		childTeams.forEach(Team :: printNameAndNumberOfMedals);
	}

	@Override
	public void printNameAndNumberOfAthletes() {
		System.out.println("\t\t"+name + "'s " + this.getClass().getSimpleName() + ":");
		childTeams.forEach(Team :: printNameAndNumberOfAthletes);
		
	}
	
	public void addTeam(Team team) {
		childTeams.add(team);
	}

}