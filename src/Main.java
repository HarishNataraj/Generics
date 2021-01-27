
public class Main {

	public static void main(String[] args) {
		Team<FootballPlayer> fb = new Team<FootballPlayer>("Football");
		Team<CricketPlayer> cric = new Team<CricketPlayer>("Cricket");
		
		FootballPlayer ronaldo = new FootballPlayer("Christiano Ronaldo");
		FootballPlayer griezman = new FootballPlayer("Antoin Greizman");
		
		CricketPlayer kohli = new CricketPlayer("Virat Kohli");
		CricketPlayer dhoni = new CricketPlayer("MS Dhoni");
		CricketPlayer dhoni1 = new CricketPlayer("MS Dhoni");
		
		fb.addPlayer(ronaldo);
 		fb.addPlayer(griezman);
		
		cric.addPlayer(kohli);
		cric.addPlayer(dhoni);
		cric.addPlayer(dhoni1);
		System.out.println("==================================================");
		
		System.out.println("Football players :");
		for(FootballPlayer player : fb.getPlayers()) {
			System.out.println(player.getPlayerName());
		}
		
		System.out.println("==================================================");
		
		System.out.println("Cricket players :");
		for(CricketPlayer player : cric.getPlayers()) {
			System.out.println(player.getPlayerName());
		}

	}

}
