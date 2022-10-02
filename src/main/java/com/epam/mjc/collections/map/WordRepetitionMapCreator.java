package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;
//import java.util.StringTokenizer;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        String sentenceInLowerCase = sentence.toLowerCase().replaceAll("[,.]", "");
//        StringTokenizer str = new StringTokenizer(sentenceInLowerCase);

        HashMap<String,Integer> words = new HashMap<>();
        String[] wordsInSentense = sentenceInLowerCase.split(" ");
        if (!sentence.isEmpty()) {
            for (String str:wordsInSentense) {
                if (words.containsKey(str)) {
                    words.put(str, words.get(str) + 1);
                } else {
                    words.put(str, 1);
                }
            }
        }

        return words;
    }
}
