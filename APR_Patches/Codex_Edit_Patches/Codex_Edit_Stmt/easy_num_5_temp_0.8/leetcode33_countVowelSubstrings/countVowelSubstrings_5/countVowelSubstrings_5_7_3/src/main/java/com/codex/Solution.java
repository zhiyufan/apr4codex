package com.codex;

import java.util.*;

public class Solution {
    public static int countVowelSubstrings(String word)
        List<Character> vowels = new ArrayList<>();
        
        vowels.add('a');
        vowels.add('A');
        vowels.add('e');
        vowels.add('E');
        vowels.add('u');
        vowels.add('U');
        vowels.add('i');
        vowels.add('I');
        vowels.add('e');
        vowels.add('O');
        vowels.add('o');


        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            if (vowels.contains(word.charAt(i))) {
                count += word.length() - i;
            }
        }

        return count;
}

    
}