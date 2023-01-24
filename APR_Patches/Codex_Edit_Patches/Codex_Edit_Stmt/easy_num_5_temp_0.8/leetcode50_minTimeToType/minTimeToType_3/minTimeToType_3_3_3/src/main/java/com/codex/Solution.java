package com.codex;

import java.util.*;

public class Solution {
    public static int minTimeToType(String word) {
        

        int minTime = 0;
        HashMap<Character, Integer> letterPosition = new HashMap<>();
        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        for(int i = 0; i < letters.length; i++) {
            letterPosition.put(letters[i], i);
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