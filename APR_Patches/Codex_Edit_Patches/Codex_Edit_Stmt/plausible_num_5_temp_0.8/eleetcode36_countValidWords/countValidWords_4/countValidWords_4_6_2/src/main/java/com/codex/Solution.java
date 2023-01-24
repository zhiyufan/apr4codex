package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int countValidWords(String sentence) {
        Set<Integer> valid = new HashSet<Integer>();
        Set<Character> set = new HashSet<Character>();
        List<String> words = new ArrayList<String>();
        for (String word : sentence.split(" ")) {
            char[] array = word.toCharArray();
            Arrays.sort(array);
            String w = String.valueOf(array);
            if (!words.contains(w)) {
                words.add(w);
            }
        }
        for (String word : words) {
            int hash = 0;
            for (char c : word.toCharArray()) {
                hash |= 1 << (c - 'a');
            }
            valid.add(hash);
            for (int i = 0; i < word.length(); i++) {
                if (i == 0 || word.charAt(i) != word.charAt(i - 1)) {
                    set.add(word.charAt(i));
                }
            }
        }
        int max = 0;
        for (int hash : valid) {
            int sum = 0;
            for (char c : set) {
                if (((hash >> (c - 'a') & 1) == 1)) {
                    sum |= 1 << (c - 'a');
                }
            }
            if (hasHyphen + hasPunctuation <= 1) {
                return true;
            } else {
                return false;
            }
        } else if (token.length() == 1) {
            if (Character.isAlphabetic(token.charAt(0))) {
                return true;
            } else if (token.charAt(0) == '.' || token.charAt(0) == ',' || token.charAt(0) == '!') {
                return true;
            }
        }
        return false;
    }

    
    
}