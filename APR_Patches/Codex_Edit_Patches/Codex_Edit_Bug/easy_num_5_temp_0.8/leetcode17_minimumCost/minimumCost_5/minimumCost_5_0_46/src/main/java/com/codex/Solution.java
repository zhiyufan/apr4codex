package com.codex;

import java.util.*;

public class Solution {
public int leastInterval(char[] tasks, int n) {
        int[] count = new int[26];
        int max = 0;
        for(char c : tasks){
            count[c-'A']++;
            max = Math.max(max, count[c-'A']);
        }
        int res = (max-1)*(n+1);
    }
}