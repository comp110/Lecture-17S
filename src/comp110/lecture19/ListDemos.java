package comp110.lecture19;

import java.util.ArrayList;
import java.util.List;

public class ListDemos {

    public static void main(String[] args) {

        // Declare a List of Players and initialize it to a new ArrayList implementation
        List<Player> players = new ArrayList<Player>();

        // Load Player objects onto the players List
        RosterLoader rosterLoader = new RosterLoader();
        rosterLoader.load(players);

        // TODO: How many elements have been added?
        System.out.println("size(): " + players.size());

        System.out.println("It's gonna be Maye");
        // TODO: Add Luke Maye with 20 minutes, 17 points
        players.add(new Player("Maye", 20, 17));

        // Confirm size grew by one small shot for man, one giant leap for Maye's playing time
        System.out.println("size(): " + players.size());

        System.out.println("Removing player at index 0...");
        // Print and remove the Player at index 0 from the players List
        Player first = players.get(0);
        System.out.println(first);
        players.remove(0);

        System.out.println("Removing player at index 0...");
        // TODO: Print and remove the Player at index 0, this time remove by Player
        first = players.get(0);
        System.out.println(first);
        players.remove(first);

        System.out.println("Printing all players...");
        // TODO: Loop through and print each element
        for (int i = 0; i < players.size(); i++) {
            Player player = players.get(i);
            System.out.println(player);
        }

    }

}
