package Pro_9_Leaderboard;

import java.util.*;

public class Leaderboard {

    private List<Player> players = new ArrayList<>();


    public void addPlayer(Player player) {
        players.add(player);
    }

    public void updateScore(String name, int newScore) {
        for (Player p : players) {
            if (p.getName().equals(name)) {
                p.setScore(newScore);
                break;
            }
        }
    }

    public void displayLeaderboard() {

        Comparator<Player> scoreComparator = new Comparator<Player>() {
            @Override
            public int compare(Player p1, Player p2) {
                return Integer.compare(p2.getScore(), p1.getScore());
            }
        };

        players.sort(scoreComparator);

        System.out.println("Leaderboard:");
        for (Player p : players) {
            System.out.println(p);
        }
    }
}