package com.codex;

import java.util.*;

public class Solution {
    public static int countVowelSubstrings(String word) {
        if(word.length() == 0){
            return 0;
        }
            
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j <= word.length(); j++) {
                String str = word.substring(i, j);
                
                if (str.contains("a") && str.contains("e") && str.contains("i") && str.contains("o") && str.contains("u")) {
                    count++;
                }
            }
        }
        return count;
    }

    
}