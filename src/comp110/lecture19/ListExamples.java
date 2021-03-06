package comp110.lecture19;

import java.util.ArrayList;
import java.util.List;

public class ListExamples {

	public static void main(String[] args) {

		// Declare a List of Players and initialize it to a new ArrayList
		// implementation
		List<Player> team = new ArrayList<Player>();

		// Load Player objects onto the players List
		RosterLoader rosterLoader = new RosterLoader();
		rosterLoader.load(team);

		// TODO: How many elements have been added?
		System.out.println("size(): ?");

		System.out.println("It's gonna be Maye");
		// TODO: Add Maye with 20 minutes, 17 points

		// Confirm size grew by one small shot for man, one giant leap for
		// Maye's playing time
		System.out.println("size(): ?");

		System.out.println("Removing player at index 0...");
		// Print and remove the Player at index 0 from the players List
		Player first = team.get(0);
		System.out.println(first);

		System.out.println("Removing player at index 0...");
		// TODO: Print and remove the Player remove by Player reference
		first = team.get(0);
		System.out.println(first);

		System.out.println("Printing all players...");
		// TODO: Loop through and print each element

	}

}
