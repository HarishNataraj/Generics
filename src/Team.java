import java.util.ArrayList;

public class Team<T extends Player> {
	private String teamName;
	private ArrayList<T> players;
	
	public Team(String teamName) {
		this.teamName = teamName;
		this.players = new ArrayList<>();
	}

	public String getTeamName() {
		return teamName;
	}

	public ArrayList<T> getPlayers() {
		return players;
	}
	
	public void addPlayer(T player) {
		if(players.contains(player)) {
			System.out.println("Player is already added to the team");
		} else {
			players.add(player);
			System.out.println("Player added");
		}
	}
	
	
	
}
