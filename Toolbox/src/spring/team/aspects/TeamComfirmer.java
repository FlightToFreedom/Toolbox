package spring.team.aspects;


public class TeamComfirmer {


	public TeamComfirmer(){
	}


	/**
	 * Annunces tonight team
	 */
	public void announceBefore(){
		System.out.println("Team about to play tonight:");
	}

	/**
	 * Annunces tonight team
	 */
	public void announceAfter(){
		System.out.println("Closing");
	}
}
