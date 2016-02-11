package spring.team;

public class Team {

	private final String name;
	private final String city;

	public Team(String name, String city){
		this.name=name;
		this.city=city;
	}

	public void spitDetails(){
		System.out.println("Team name: "+name);
		System.out.println("Team city: "+city);
	}
}
