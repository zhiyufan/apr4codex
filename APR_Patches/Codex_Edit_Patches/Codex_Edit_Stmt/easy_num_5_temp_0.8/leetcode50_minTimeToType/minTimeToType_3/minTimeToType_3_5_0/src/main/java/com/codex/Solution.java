package com.codex;

import java.util.*;

public class Solution {
    public static int minTimeToType(String word) {
        

        int minTime = 0;
        HashMap<Character, Integer> letterPosition = new HashMap<>();
        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        for(int i = 0; i < letters.length; i++) {
            letterPosition.put(letters[i], i);
        }

        for(int i = 0; i < word.length()-1; i++) {
            char current = word.charAt(i);
            char next = word.charAt(i+1);
            int currentPosition = letterPosition.get(current);
            int nextPosition = letterPosition.get(next);
            minTime += Math.min(Math.abs(nextPosition - currentPosition), 26 - Math.abs(nextPosition - currentPosition));
        }

        return minTime;
    }

    public String longestPalindrome(String s) {
        String longestPalindrome = "";

        for(int i = 0; i < s.length(); i++) {
            String oddPalindrome = getPalindrome(s, i, i);
            String evenPalindrome = getPalindrome(s, i, i+1);

            String currentPalindrome = oddPalindrome.length() > evenPalindrome.length() ? oddPalindrome : evenPalindrome;

            if(currentPalindrome.length() > longestPalindrome.length()) {
                longestPalindrome = currentPalindrome;
            }
        }

        return longestPalindrome;
    }

    public String getPalindrome(String s, int low, int high) {
        int length = s.length();

        while(low >= 0 && high < length && s.charAt(low) == s.charAt(high)) {
            low--;
            high++;
        }

        return s.substring(low+1, high);
    }
}