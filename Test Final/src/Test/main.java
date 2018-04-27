package Test;

public class main {
	
	public static void main (String[] args) {
		
		
		game newgame = new game();
		Player user = new Player();
		Treasure chest = new Treasure();
		newgame.load();
		user.options();
		
		while (!chest.isDiscovered() && !user.isDead()) {
			newgame.info(user, newgame.userinp(), chest);
			chest.playerlocat(user);
		}
		
		if (chest.isDiscovered()) {
			System.out.println("You see a box sitting on the hill. It's filled with some clothes, so you can finally get dressed! You Win! * You later die of dehydration *. The end.");
			
		}
		else if (user.isDead()) {
			System.out.println("Game over. Re run to start game again. Don't call for Shafeeq this time.");
			
		}
		
		
	}
}
