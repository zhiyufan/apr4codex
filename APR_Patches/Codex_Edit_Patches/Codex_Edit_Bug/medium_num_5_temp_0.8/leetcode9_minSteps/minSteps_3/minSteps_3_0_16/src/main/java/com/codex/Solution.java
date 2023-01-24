package com.codex;

import java.util.*;

public class Solution {
    public static int minSteps(String s, String t) {
        
        int [] letters = new int [26];
        int res = 0, count = 0;
        for (char c: t.toCharArray()){
            if (--letters[c-'a'] < 0){
                count++;
            }
        }
        for (char c : t.toCharArray()) {
            letters[c - 'a']--;
        }
        for (int i : letters) {
            res += Math.abs(i);
        }
        return res / 2;
    }

    
}