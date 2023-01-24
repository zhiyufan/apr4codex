package com.codex;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        
        System.out.println(countVowelSubstrings("daeiou"));
    }

    public static int countVowelSubstrings(String word) {
        
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j <= word.length(); j++) {
                String sub = word.substring(i, j);
                if (sub.matches("(.*[aeiou]){5,}")) {
                    count++;
                }
            }
        }
        return count;
    }

    
}