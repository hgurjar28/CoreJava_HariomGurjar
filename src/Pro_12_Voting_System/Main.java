
//Problem 12: Voting System (Map<String, Integer>)
//Build a voting system that:
//        •	Tallies votes per candidate
//•	Sorts by vote count descending


package Pro_12_Voting_System;

public class Main {
    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();

        votingSystem.vote("Aman");
        votingSystem.vote("Vinit");
        votingSystem.vote("Raj");
        votingSystem.vote("Karan");
        votingSystem.vote("Raj");
        votingSystem.vote("Raj");
        votingSystem.vote("Karan");

        votingSystem.displayResults();
    }
}
