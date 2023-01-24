package com.codex;

import java.util.*;

public class Solution {
    public static int minSteps(String s, String t) {
        
        int[] count = new int[26];
        for(int i = 0; i < s.length(); i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        int result=0;
        for(int i = 0;i < 26;i++){
            if(count[i] > 0){
                result += count[i];
            }
        }
        return result;
    }
}