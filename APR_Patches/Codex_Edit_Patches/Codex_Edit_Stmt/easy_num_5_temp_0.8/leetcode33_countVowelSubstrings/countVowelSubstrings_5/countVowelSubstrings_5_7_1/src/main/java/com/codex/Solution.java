package com.codex;

import java.util.*;

public class Solution {
public static int countVowelSubstrings(String word) {

        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            if (vowels.contains(word.charAt(i))) {
                count += word.length() - i;
            }
        }

        return count;
    }

    
}