package Test;
import java.util.Scanner;
public class game {
	
	public void load() {
		System.out.println("Welcome. You awaken to find yourself in a world of trouble with the worst hangover. What did you drink last night?!");
		System.out.println("You are ordered to go to get milk from the shops. But you get kidnapped!");
		System.out.println("You awaken, in 40 degree heat, with nothing on you apart from a can of Carlsberg and a note saying 'Find the treasure to save your life'");
		System.out.println("----------------------------------------------");
	}
	
	public String userinp() {
		Scanner opt = new Scanner(System.in);
		return opt.next();
	}
	public void compass(Player user, Treasure chest) {		
		int xlength = user.X() - chest.X();
		int ylength = user.Y() - chest.Y();
		int squarex = xlength*xlength;
		int squarey = ylength*ylength;
		int squareRoot = squarex + squarey;
		System.out.println("The treasure is " + (int)Math.sqrt(squareRoot) + " steps away. Keep Going!"); //wasn't sure if you preferred (int) or (float).
	}
	
	public void info(Player user, String userinput,Treasure chest) {
		switch (userinput) {
		case "look":
			user.look();
			break;
		case "options":
			user.options();
			break;
		case "compass":
			compass(user, chest);
			break;
		case "north":
			user.move("north");
			break;
		case "east":
			user.move("east");
			break;
		case "south":
			user.move("south");
			break;
		case "west":
			user.move("west");
			break;
		case "shafeeq":
			System.out.println("The Shafeeq flies from the sky, and kills you. Do not waste The Shafeeq's Time.");
			user.setDead(true);
			break;
		case "help":
			System.out.println("You don't get help as you are on your own. Duh.");
			break;
		case "phonefriend":
			System.out.println("You phone your partner to come rescue you. Your partner argues at you for not being romantic. You hang up frustrated and throw your phone in the water. Smooth.");
			break;
		case "fly":
			System.out.println("You belive you can fly because you have completely lost the plot. You gave yourself a bruise.. good work.");
			break;
		case "hidden":
			user.hidden();
			break;
		}
	}
}
