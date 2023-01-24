package com.codex;

import java.util.*;

public class Solution {
import java.util.*;
public class Solution {

    public static int[] wordCountEngine(String document) {
        String[] words = document.split(" ");

        TreeMap<String, Integer> map = new TreeMap<>();
        for (String word : words) {
            String newWord = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
            if (newWord.length() == 0) {
                continue;
            }
            if (map.containsKey(newWord)) {
                map.put(newWord, map.get(newWord) + 1);
            } else {
                map.put(newWord, 1);
            }
        }

        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            maxCount = Math.max(maxCount, entry.getValue());
        }

        ArrayList<List<String>> bucket = new ArrayList<>();
        for (int i = 0; i <= maxCount; i++) {
            bucket.add(new ArrayList<>());
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            bucket.get(entry.getValue()).add(entry.getKey());
        }

        List<String> ret = new ArrayList<>();
        for (int i = bucket.size() - 1; i > 0; i--) {
            for (String word : bucket.get(i)) {
                ret.add(word);
            }
        }

        int[] res = new int[ret.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = ret.get(i);
        }
        return res;
    }

}
}