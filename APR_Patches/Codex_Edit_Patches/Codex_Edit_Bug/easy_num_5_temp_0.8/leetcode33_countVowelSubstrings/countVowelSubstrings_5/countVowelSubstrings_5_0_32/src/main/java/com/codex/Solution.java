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

        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            if (vowels.contains(word.charAt(i))) {
                count += word.length() - i;
            }
        }

        return count;
    }

    

        public static boolean isVowel(char ch) {
        char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
        for (char c : vowels) {
            if (Character.toLowerCase(ch) == c) {
                return true;
            }
        }
        return false;
    }


    public static int countVowelSubstrings(String str) {
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            if (isVowel(str.charAt(i))) {
                cnt++;
                for (int j = i + 1; j < str.length(); j++) {
                    if (isVowel(str.charAt(j))) {
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }



    public static int countVowelSubstrings(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                count += s.length() - i;
            }
        }
        return count;
    }
    
}