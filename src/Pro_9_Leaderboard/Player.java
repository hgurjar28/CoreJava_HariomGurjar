package Pro_9_Leaderboard;

public class Player {
    private String name;
    private int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() { return name; }
    public int getScore() { return score; }

    public void setScore(int score) {
        this.score = score;
    }


    @Override
    public String toString() {
        return name + " - " + score;
    }
}
