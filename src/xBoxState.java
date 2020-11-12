
public class xBoxState implements State {
	
	private GameConsole gameConsole;
	
	private String[] games = new String[] {"NBA 2k21", "Madden21", "MLBTheShow21", "Halo", "Call of Duty"};
	
	public void pressHomeButton() {
		
		System.out.println("Display Home Screen...");
	}
	
	public void pressNintendoButton() {
		
		System.out.println("Starting Nintendo....");
	}
	
	public void pressXBoxButton() {
		
		System.out.println("You are already viewing XBox");
	}
	
	public void pressGameButton() {
		
		System.out.println("You have the following games:");
		
		for(int i = 0; i < games.length; i++) {
			System.out.println(games[i]);
		}
		System.out.println();
	}

}
