package capitalGame;

public class Game {
	private String capital;
	
	Game(String capital){
		this.setCapital(capital);
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}
}
