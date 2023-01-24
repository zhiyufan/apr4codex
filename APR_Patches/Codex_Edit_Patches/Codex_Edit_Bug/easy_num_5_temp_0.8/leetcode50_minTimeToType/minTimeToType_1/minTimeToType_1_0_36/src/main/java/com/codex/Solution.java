package com.codex;

import java.util.*;

public class Solution {
    
    /**
     * 
     * @param word
     * @return
     */
    public static int minTimeToType(String word) {
        

        int[] pos = new int[26];
        int i = 0;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            pos[ch - 'a'] = i++;
        }

        int cur = 0, res = 0;
        for (char ch : word.toCharArray()) {
            res += Math.min(Math.abs(pos[ch - 'a'] - cur), 26 - Math.abs(pos[ch - 'a'] - cur));
    
    
    
    public int findMinDist(int[] arr, int n, int x, int y) {
        int i = 0;
        int min_dist = Integer.MAX_VALUE;
        int prev = 0;

        for (i = 0; i < n; i++) {
            if (arr[i] == x || arr[i] == y) {
                prev = i;
                break;
            }
        }

        for (; i < n; i++) {
            if (arr[i] == x || arr[i] == y) {
                if (arr[prev] != arr[i] && (i - prev) < min_dist) {
                    min_dist = i - prev;
                    prev = i;
                } else
                    prev = i;
            }
        }

        return min_dist;
    }
            cur = pos[ch - 'a'];
        }
        return res;
    }
}