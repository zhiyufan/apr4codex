package com.codex;

import java.util.*;

public class Solution {
package com.practice.programs;

import java.util.ArrayList;
import java.util.List;

public class VowelSubstring {
    
    public static int countVowelSubstrings(String word) {
        
        if (word == null) {
            return 0;
        }
        
        List<Character> vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            if (vowels.contains(word.charAt(i))) {
                count += word.length() - i;
            }
        }

        return count;
    }


    public static void main(String[] args) {
        
        String word = "good";
        int count = countVowelSubstrings(word);
        System.out.println("Count: " + count);
    }
}
}