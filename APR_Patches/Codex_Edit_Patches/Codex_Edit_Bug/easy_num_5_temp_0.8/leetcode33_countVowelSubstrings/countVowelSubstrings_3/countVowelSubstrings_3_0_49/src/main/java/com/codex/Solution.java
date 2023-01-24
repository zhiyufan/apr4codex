package com.codex;

import java.util.*;

public class Solution {
    public static int countVowelSubstrings(String word) {
        int res = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j + i < m; j++) {
                boolean allVowels = true;
                for (int k = j; k <= j + i; k++) {
                    if (word.charAt(k) != 'a' && word.charAt(k) != 'e' && word.charAt(k) != 'i' && word.charAt(k) != 'o' && word.charAt(k) != 'u') {
                        allVowels = false;
                        break;
                    }       
                }     
                if (allVowels) {
                    res++;
                }
            }
        }   
        return res;
    }

    
}