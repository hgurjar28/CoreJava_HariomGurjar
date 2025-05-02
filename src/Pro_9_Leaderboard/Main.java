
//Problem 9: Leaderboard Tracker (TreeSet, Comparator)
//Track player scores using TreeSet<Player>  sorted by score descending.
//•	Update a player's score and maintain correct leaderboard order.


package Pro_9_Leaderboard;

public class Main {
    public static void main(String[] args) {
        Leaderboard leaderboard = new Leaderboard();

        leaderboard.addPlayer(new Player("Ankit", 100));
        leaderboard.addPlayer(new Player("Oggy", 150));
        leaderboard.addPlayer(new Player("Jack", 120));

        System.out.println("Initial Leaderboard:");
        leaderboard.displayLeaderboard();

        System.out.println("\nAfter Updating Score:");
        leaderboard.updateScore("Ankit", 160);
        leaderboard.updateScore("Oggy", 194);
        leaderboard.updateScore("Jack", 160);
        leaderboard.displayLeaderboard();
    }
}
