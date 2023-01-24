package com.codex;

import java.util.*;

public class Solution {
    public static int minSteps(String s, String t) {
        
        int[] letters = new int[26];
        int res = 0;
        for (char c : s.toCharArray()) {
            letters[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            letters[c - 'a']--;
        }
        for (int i : letters) {
            res += Math.abs(i);
        }
        return res / 2;
    }




        public static int numJewelsInStones(String J, String S) {
        int[] frequency = new int[256];
        int res =0;
        for(char c: J.toCharArray()){
            frequency[c] = 1;
        }
        for(char c: S.toCharArray()){
            if(frequency[c] == 1)
                res+=1;
        }
        return res;
    }








    public static int numJewelsInStones(String J, String S) {

        int[] frequency = new int[256];
        int res = 0;
        for (char c : J.toCharArray()) {
            frequency[c] = 1;
        }
        for (char c : S.toCharArray()) {
            if (frequency[c] == 1)
                res += 1;
        }
        return res;
    }

    
}