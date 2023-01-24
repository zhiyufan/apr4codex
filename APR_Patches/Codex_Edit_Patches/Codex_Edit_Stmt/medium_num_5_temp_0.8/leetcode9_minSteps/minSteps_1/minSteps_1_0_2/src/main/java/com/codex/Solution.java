package com.codex;

import java.util.*;

public class Solution {
class Solution {
    public int minSteps(String s, String t) {
        
        int[] sCount = new int[26];
        for(int i = 0; i < s.length(); i++) {
            sCount[s.charAt(i)-'a']++;
        }
        int res = 0;
        int[] tCount = new int[26];
        for(int i = 0; i < t.length(); i++) {
            tCount[t.charAt(i)-'a']++;
        } 
        for(int i = 0; i < 26; i++) {
            res += Math.abs(sCount[i]-tCount[i]);
        }
        return res / 2;
    }

}
}