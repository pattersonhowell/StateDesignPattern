
public class GameConsole {

	private State HomeState;
	private State NintendoState;
	private State xBoxState;
	private State state;
	
	
	public GameConsole() {
		
		this.HomeState = new HomeState();
		this.NintendoState = new NintendoState();
		this.xBoxState = new xBoxState();
		this.state = new HomeState();
		
		System.out.println("Starting up the Game Console");
		System.out.println();
	}
	
	
	public void pressHomeButton() {
		state.pressHomeButton();
		setState(HomeState);
	}
	
	public void pressNintendoButton() {
		state.pressNintendoButton();
		setState(NintendoState);
		
	}
	
	public void pressXBoxButton() {
		state.pressXBoxButton();
		setState(xBoxState);
		 
	}
	
	public void pressGameButton() {
		state.pressGameButton();
	}
	
	public void setState(State state) {
		
		this.state = state;
	}
	
	public State getHomeState() {
		return HomeState;
	}
	
	public State getNintendoState() {
		return NintendoState;
	}
	
	public State getXBoxState() {
		return xBoxState;
	}
	
	
	
}
