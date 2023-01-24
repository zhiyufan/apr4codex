package com.codex;

import java.util.*;

public class Solution {
                public static int minTimeToType(String word) {

        List<Character> letters = new ArrayList<>(Arrays.asList('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'));
        int counter = 0;
        for (int i = 0; i < word.length(); i++){
            char letter = word.charAt(i);
            int index = letters.indexOf(letter);
            int distance = 0;
            if (index > letters.indexOf('a')){
                distance =  index - letters.indexOf('a');
            }
            else{
                distance = Math.abs(index - letters.indexOf('a'));
            }
            if (distance > 13){
                counter += (26 - distance);
            } else{
                counter += distance; 
            }
        }
        return counter;
    }
}