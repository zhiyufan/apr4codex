package com.codex;

import java.util.*;

public class Solution {
    //I met you in the not so distant past
    //You are still unopened.
    //The summer is still young.
    //The cherry trees still blossom!


    public static int countVowelSubstrings(String word) {
        
        List<Character> vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            if (vowels.contains(word.charAt(i))) {
                count += word.length() - i; // word.length() - i -> we added this number of substring;
            }
        }

        return count;
    }
}