package Test;

import java.util.Random;
public class Player {
	public static Random rand = new Random();

	public static int x = rand.nextInt(8);
	public static int y = rand.nextInt(8);
	
	boolean isDead = false;

	public void move(String map) {

		switch (map) {
		case "north":
			y++;
			System.out.println("You moved North");
			break;
		case "east":
			x++;
			System.out.println("You moved East");
			break;
		case "south":
			y--;
			System.out.println("You moved South");
			break;
		case "west":
			x--;
			System.out.println("You moved West");
			break;
		}
	}

	public void look() {
		System.out.println("You stop your quest for a moment to have a look around you.");
		System.out.println("You crack open a lovely can of Carlsberg. But something seems strange, Carlsberg has never been nice.");
		System.out.println("Bewildered by your tastebuds, you continue your journey.");
	}

	public void options() {
		System.out.println("Enter 'north','east','south' or 'west' to move");
		System.out.println("Also try: 'look, compass, options & hidden'");
	}
	
	public void hidden() {
		System.out.println("The hidden commands: shafeeq, fly, phonefriend, help.");
	}
	
	public int X() {
		return x;
	}

	public int Y() {
		return y;
	}

	boolean isDead() {
		return isDead;
	}

	public void setDead(boolean isDead) {
		this.isDead = isDead;
	}

}
