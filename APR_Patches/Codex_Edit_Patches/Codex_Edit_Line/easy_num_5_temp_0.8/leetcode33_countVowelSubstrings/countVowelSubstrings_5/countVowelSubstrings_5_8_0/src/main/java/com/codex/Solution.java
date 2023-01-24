package com.codex;

import java.util.*;

public class Solution {
    public static int countVowelSubstrings(String word) {
        
        List<Character> vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

<<<<<<< HEAD
        int count = 0;
=======
                count += word.length() - i + 1;
>>>>>>> 015b2ba2a72f9a756727d7c38512ad4dd8f47dc4

        for (int i = 0; i < word.length(); i++) {
            if (vowels.contains(word.charAt(i))) {
                count += word.length() - i;
            }
        }

        return count;
    }

    
}