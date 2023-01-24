package com.codex;

import java.util.*;

public class Solution {
public static int minTimeToType(String word) {
        List<Character> letters = new ArrayList<>(Arrays.asList('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'));
        int counter = 0;
        for (int i = 0; i < word.length(); i++){
            char letter = word.charAt(i);
            int index = letters.indexOf(letter);
            int distance = index - letters.indexOf('a'); 
            if (distance < 0)   {
                if (Math.abs(distance) > 13){
                    distance += 26;
                }
            }
            if (distance > 13) {
                counter += Math.min(26 - distance, distance);
            } else {
                counter += distance;
            }
        }
}
        return counter;
    }
}