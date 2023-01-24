package com.codex;

import java.util.*;

public class Solution {
public static int minSteps(String s, String t) {
        
    int[] letters = new int[26];
    int res = 0;
    for (char c : s.toCharArray()) {
        letters[c - 'a']++;
    }

    
}