package com.codex;

import java.util.*;

public class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] charsCount = new int[26];
        for (int i = 0; i < chars.length(); i++) {
            charsCount[chars.charAt(i) - 'a']++;
        }
        int res = 0;
        int counter = 0;
        for (int i = 0; i < words.length; i++) {
            counter = 0;
            for (int j = 0; j < words[i].length(); j++) {
                if(charsCount[words[i].charAt(j) - 'a'] >= 1) {
                    counter++;
                }
            }
            if (counter == words[i].length()) {
                res += counter;
            }
        }
        return res / 2;
    }

    
}