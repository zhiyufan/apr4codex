package com.codex;

import java.util.*;

public class Solution {
public static void main(String[] args){
        System.out.println(minSteps(s,t));
    }
    public static int minSteps(String s, String t){
        int[] freq = new int[26];
        for (char c : s.toCharArray()){
            freq[c - 'a']++;
        }
        int steps = 0;
        for (char c : t.toCharArray()){
            if (freq[c - 'a'] == 0){
                steps++;
            } else {
                freq[c - 'a']--;
            }
        }
        return steps;
    }

    
}