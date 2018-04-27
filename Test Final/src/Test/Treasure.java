package Test;

import java.util.Random;

public class Treasure {
	public Random rand = new Random();
	public int x = rand.nextInt(40);
	public int y = rand.nextInt(40);
	public boolean discovered = false;

	int X() {
		return x; }
	int Y() {
		return y; }
	
	boolean isDiscovered() {
		return discovered;
	}

	public void playerlocat(Player user) {
		if (user.X()-x == 0 && user.Y()-y == 0) {
			discovered = true;
			
		}
	}
	
}
