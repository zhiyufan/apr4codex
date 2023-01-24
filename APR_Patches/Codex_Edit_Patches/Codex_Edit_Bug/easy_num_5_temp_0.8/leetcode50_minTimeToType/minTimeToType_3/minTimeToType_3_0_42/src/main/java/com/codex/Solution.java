package com.codex;

import java.util.*;

public class Solution {
public class Main {
    private static int minTimeToType(String word) {
        HashMap<Character, Integer> letterPosition = new HashMap<>();
        char[] letters = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm'};
        for (int i = 0; i < letters.length; i++) {
            letterPosition.put(letters[i], i+1);
        }

        for(int i = 0; i < word.length()-1; i++) {
            char current = word.charAt(i);
            char next = word.charAt(i+1);
            int currentPosition = letterPosition.get(current);
            int nextPosition = letterPosition.get(next);
            minTime += Math.min(Math.abs(nextPosition - currentPosition), 26 - Math.abs(nextPosition - currentPosition));
        }

        return minTime;
    }

    
}