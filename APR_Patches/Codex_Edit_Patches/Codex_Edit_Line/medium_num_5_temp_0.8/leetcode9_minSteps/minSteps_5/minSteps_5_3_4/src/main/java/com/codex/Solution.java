package com.codex;

import java.util.*;

public class Solution {
    public static int minSteps(String s, String t) {
        int n = s.length();
        int m = t.length();
        if(n != m) {
            return -1;
        }
        int[] count = new int[26];
        int[] hash = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for(int i = 0; i < 26; i++) {
            if(count[i] != 0) {
                return -1;
            }
        }
        int res = 0;
        for(int i = 0; i < n; i++) {
            if(s.charAt(i) != t.charAt(i)) {
                res++;
            }
        }
        return res;
    }

    
}