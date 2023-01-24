package com.codex;

import java.util.*;

public class Solution {
    public static int countVowelSubstrings(String word) {
        
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j <= word.length(); j++) {
                String sub = word.substring(i, j);
                if (sub.contains("a") && sub.contains("e") && sub.contains("i") && sub.contains("o") && sub.contains("u")) {
                    count++;
                }
            }
        }
        return count;
    }

    public class Main {
    public static void main(String[] args) {
        System.out.println(countVowelSubstrings("abciiidef"));
        System.out.println(countVowelSubstrings("aeiou"));
        System.out.println(countVowelSubstrings("leetcode"));
        System.out.println(countVowelSubstrings("rhythms"));
        System.out.println(countVowelSubstrings("dream"));
        System.out.println(countVowelSubstrings("code"));
        System.out.println(countVowelSubstrings("lalala"));
    }
}
}