package com.codex;

import java.util.*;

public class Solution {
    public static int noOfSubstrings(String word) {

        String vowels = "aeiou";
        int noOfVowels = 0;

        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            for (int j = i; j < word.length(); j++) {
                if (vowels.indexOf(word.charAt(j)) != -1) {
                    noOfVowels += 1;
                } else {
                    break;
                }
                count += noOfVowels;
            }
        }

        return count;
    }

    
}