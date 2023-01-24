package com.codex;

import java.util.*;

public class Solution {
public static int countVowelSubstrings(String word) {
        
        List<Character> vowels = new ArrayList<>();//wydzielamy samogłoski
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        int count = 0;

        for (int i = 0; i < word.length(); i++) {//iteruje po literach
            if (vowels.contains(word.charAt(i))) {//sprawdzam czy dana litera jest samogłoską
                count += word.length() - i;//zliczam samogłoski
            }
        }

        return count;
    }

    
}