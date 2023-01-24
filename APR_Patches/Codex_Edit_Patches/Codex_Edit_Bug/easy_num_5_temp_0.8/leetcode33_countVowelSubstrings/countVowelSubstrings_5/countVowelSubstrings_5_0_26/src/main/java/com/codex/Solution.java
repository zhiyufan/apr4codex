package com.codex;

import java.util.*;

public class Solution {
    public static void printFrequency(String s) {
        
        HashMap<Integer, Integer> map = new HashMap<>();

        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            if (vowels.contains(word.charAt(i))) {
                count += word.length() - i;
            }
        }

        return count;
    }

    
}