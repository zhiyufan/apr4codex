package com.codex;

import java.util.*;

public class Solution {
public static int countVowelSubstrings(String word) {

        int count = 0;
        List<Character> vowels = new ArrayList<>();
        vowels.add('a'); vowels.add('e'); vowels.add('i'); vowels.add('o'); vowels.add('u');

        for(int i = 0; i < word.length(); i++) {
            if(vowels.contains(word.charAt(i)))
                count++;
        }

        return count;
    }
}