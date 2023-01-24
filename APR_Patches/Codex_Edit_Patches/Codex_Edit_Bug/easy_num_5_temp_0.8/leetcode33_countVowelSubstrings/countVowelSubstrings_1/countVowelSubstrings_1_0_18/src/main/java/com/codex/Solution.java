package com.codex;

import java.util.*;

public class Solution {
    public static int countVowelSubstrings(String word) {
        int count = 0;
         int len = word.length();
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
              if(word.charAt(i) == 'a' || word.charAt(i) == 'e' ||word.charAt(i) == 'i' ||word.charAt(i) == 'o' ||word.charAt(i) == 'u' )
              count++;
            }
        } 
        return count ;
    }
}