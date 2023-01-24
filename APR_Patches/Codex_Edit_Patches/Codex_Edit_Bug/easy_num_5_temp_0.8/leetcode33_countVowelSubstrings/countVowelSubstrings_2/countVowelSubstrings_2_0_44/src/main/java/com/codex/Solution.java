package com.codex;

import java.util.*;

public class Solution {
    public static int countVowelConsonantSubstrings(String word, boolean isVowel) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        char[] consonants = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w','x', 'y', 'z'};
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            for (int j = i; j < word.length(); j++) {
                boolean temp = true;
                for (int k = i; k <= j; k++) {
                    char ch = word.charAt(k);
                    if (isVowel) {
                        temp = temp && (search(vowels, ch));
                    }
                    else {
                        temp = temp && (search(consonants, ch));
                    }
                }
                if (temp) {
                    count++;
                }
            }
        }
        return count;
}
}