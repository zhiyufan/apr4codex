package com.codex;

import java.util.*;

public class Solution {
    public static int minTimeToType(String word) {
        
        if(word == null || word.length() == 0){
            return res;
        }
        
        if(word.length() == 1){
            return 1;
        }
        

        int res = 0;
        for (int i = 1; i < word.length(); i++) {
            res += Math.min(move(word.charAt(i - 1), word.charAt(i)), 26 - move(word.charAt(i - 1), word.charAt(i))); //Min because, if the distance is more than half, we will traverse the rest.
        }
        return res;
    }

    private static int move(char c1, char c2) {
        int num1 = c1 - 'a';
        int num2 = c2 - 'a';
        return Math.abs(num1 - num2);
    }

    

    
}