import java.awt.*;


public class main {

	public static void main(String[] args) {
		
		// Code for Battle ship game: Simple Version.
		
		BattleShip ob = new BattleShip();
		
		int location [] = {2,3,4};
		
		ob.setLocation(location);
		
		String userGuess = "2";
		
		String result = ob.checkYourSelf(userGuess);
		
		
	}

}


