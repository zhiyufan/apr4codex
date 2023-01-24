package com.codex;

import java.util.*;

public class Solution {
    public static int minSteps(String s, String t) {
        
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        int steps = 0;
        for (char c : t.toCharArray()) {
            if (freq[c - 'a'] == 0) {
                steps++;
            } else {
                freq[c - 'a']--;
            }
        }
        return steps;
    }




class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        int[] freq = new int[26];
        for(char c: s.toCharArray()){
            freq[c-'a']++;
        }
        for(char c: t.toCharArray()){
            if (freq[c-'a']==0)
                return false;
            freq[c-'a']--;
        }
        return true;
    }
}

    
}