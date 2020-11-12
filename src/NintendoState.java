
public class NintendoState implements State {
	
	private GameConsole gameConsole;
	
	private String[] games = new String[] {"MarioKart", "WiiSports", "MonsterJam", "GuitarHero", "Jeopardy"};
	
	public void pressHomeButton() {
		
		System.out.println("Display Home Screen...");
	}
	
	public void pressNintendoButton() {
		
		System.out.println("You are already viewing Nintendo");
	}
	
	public void pressXBoxButton() {
		
		System.out.println("Starting xBox....");
	}
	
	public void pressGameButton() {
		System.out.println("You have the following games:");
		
		for(int i = 0; i < games.length; i++) {
			System.out.println(games[i]);
		}
		System.out.println();
	}

}
