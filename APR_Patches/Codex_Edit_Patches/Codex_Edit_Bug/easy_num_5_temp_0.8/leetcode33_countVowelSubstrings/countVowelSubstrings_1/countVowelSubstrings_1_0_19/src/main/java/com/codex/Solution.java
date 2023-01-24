package com.codex;

import java.util.*;

public class Solution {
public class Test {
    public static void main(String[] args) {
        
        System.out.println(countVowelSubstrings("abciiidef"));
    }

    public static int countVowelSubstrings(String sentence) {
        
        int count = 0;
        String word = sentence.toLowerCase();
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

}
}