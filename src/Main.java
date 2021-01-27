
public class Main {

	public static void main(String[] args) {
		Team<FootballPlayer> footballTeam = new Team<FootballPlayer>("Football");
		Team<CricketPlayer> cricketTeam = new Team<CricketPlayer>("Cricket");
		
		FootballPlayer ronaldo = new FootballPlayer("Christiano Ronaldo");
		FootballPlayer griezman = new FootballPlayer("Antoin Greizman");
		
		CricketPlayer kohli = new CricketPlayer("Virat Kohli");
		CricketPlayer dhoni = new CricketPlayer("MS Dhoni");
		CricketPlayer dhoni1 = new CricketPlayer("MS Dhoni");
		
		footballTeam.addPlayer(ronaldo);
		footballTeam.addPlayer(griezman);
		
		cricketTeam.addPlayer(kohli);
		cricketTeam.addPlayer(dhoni);
		cricketTeam.addPlayer(dhoni1);
		System.out.println("==================================================");
		
		System.out.println("Football players :");
		for(FootballPlayer player : footballTeam.getPlayers()) {
			System.out.println(player.getPlayerName());
		}
		
		System.out.println("==================================================");
		
		System.out.println("Cricket players :");
		for(CricketPlayer player : cricketTeam.getPlayers()) {
			System.out.println(player.getPlayerName());
		}

	}

}
