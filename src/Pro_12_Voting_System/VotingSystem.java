
package Pro_12_Voting_System;

import java.util.*;

public class VotingSystem {
    private HashMap<String, Integer> voteMap = new HashMap<>();


    public void vote(String candidate) {
        if (voteMap.containsKey(candidate)) {

            voteMap.put(candidate, voteMap.get(candidate) + 1);
        } else {
            voteMap.put(candidate, 1);

        }
    }
    public void displayResults() {
        System.out.println("Voting Results:");


        List<Map.Entry<String, Integer>> voteList = new ArrayList<>(voteMap.entrySet());


        voteList.sort((a, b) -> b.getValue() - a.getValue());
        for (Map.Entry<String, Integer> entry : voteList) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " votes");

        }
    }
}
