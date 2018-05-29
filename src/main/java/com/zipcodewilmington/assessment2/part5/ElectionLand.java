package com.zipcodewilmington.assessment2.part5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class ElectionLand {


    public int countOccurences(String[] votes, String indexValue){
        int count = 0;
        for(int i = 0; i<votes.length; i++){
            if(votes[i].equals(indexValue)){
                count++;
            }
        }
        return count;
    }

    public String electionWinner(String[] votes){
        int mostVotes = 0;
        for(String candidate: votes){
            if(countOccurences(votes, candidate)>mostVotes){
                mostVotes = countOccurences(votes, candidate);
            }
        }
        ArrayList<String> candidates = new ArrayList<>();
        for(String candidate: votes) {
            if(countOccurences(votes,candidate) == mostVotes){
                candidates.add(candidate);
            }
        }
        Collections.sort(candidates);
        return candidates.get(candidates.size()-1);
    }


}
