package com.example.project.WordPair;

import java.util.ArrayList;

public class WordPairList {
    private ArrayList<WordPair> allPairs;

    public WordPairList(String[] words) {
        allPairs = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = i+1; j < words.length; j++) {
                WordPair newPair = new WordPair(words[i], words[j]);
                allPairs.add(newPair);
            }
        }
        /* to be implemented in part (a) */
    }

    // The method below was added for testing;
    // it was not part of the original FRQ
    public ArrayList<WordPair> getAllPairs() {
        return allPairs;
    }

    public int numMatches() {
        /* to be implemented in part (b) */
        int count = 0;
        for (WordPair wordPair : allPairs) {
            if (wordPair.getFirst().equals(wordPair.getSecond())){
                count++;
            }
        }
        return count;
    }

    // The method below was added for testing;
    // it was not part of the original FRQ
    public String toString() {
        return allPairs.toString();
    }
}
