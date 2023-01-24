package com.codex;

import java.util.*;

public class Solution {
    public static int minTimeToType(String word) {
        

        List<Character> letters = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            letters.add((char)('a' + i));
        }
        int counter = 0;
        for (int i = 0; i < word.length(); i++){
            char letter = word.charAt(i);
            int index = letters.indexOf(letter);
            int distance = index - letters.indexOf('a');
            if (distance < 0){
                distance += 26;
            }
            if (distance > 13) {
                counter += Math.min(26 - distance, distance);
            }else{
                counter += distance;
            }
        }
        return counter;
    }
}