package com.codex;

import java.util.*;

public class Solution {
// https://leetcode.com/problems/minimum-deletion-cost-to-avoid-repeating-letters/
    public static int minCost(String s, int[] cost) {
        

        int count = 0;
        int val = 0;
        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i) == s.charAt(i+1)) {
                val += cost[i];
                if (cost[i] > cost[i+1]) {
                    val -= cost[i+1];
                    count++;
                }
            } else if (val > 0) {
                count += val;
                val = 0;
            }
        }
        if (val > 0) {
            count += val;
        }


        return count;        
    }

    
}