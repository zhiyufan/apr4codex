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

        for(int i = 0; i < word.length(); i++) {
            char current = word.charAt(i);
            int next;
            if(i == word.length() - 1) {
                next = 0;
            } else {
                next = letterPosition.get(word.charAt(i+1));
            }
            int currentPosition = letterPosition.get(current);
            minTime += Math.min(Math.abs(next - currentPosition), 26 - Math.abs(next - currentPosition));
        }

        return minTime;
}

    
}