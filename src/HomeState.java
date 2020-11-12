
public class HomeState implements State {
	
	private GameConsole gameConsole;

	public void pressHomeButton() {
		
		System.out.println("You are already on the home screen.");
	}
	
	public void pressNintendoButton() {
		
		System.out.println("Starting Nintendo....");
	}
	
	public void pressXBoxButton() {
		
		System.out.println("Starting xBox....");
	}
	
	public void pressGameButton() {
		
		System.out.println("You have to pick a gaming system to play.");
	}
}
