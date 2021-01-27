
public class Player {
	private String playerName;

	public Player(String playerName) {
		super();
		this.playerName = playerName;
	}

	public String getPlayerName() {
		return playerName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((playerName == null) ? 0 : playerName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
            return true;
        }
       if(obj instanceof Player) {
    	   Player theObject = (Player) obj;
           return this.playerName == theObject.getPlayerName();
       }
        return false;
	}
	
	
	
	
}
