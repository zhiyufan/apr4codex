package com.codex;

import java.util.*;

public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[] dp = new int[triangle.size()];
        List<Integer> bottom = triangle.get(triangle.size() - 1);
        for (int i = 0; i < bottom.size(); i++) {
            dp[i] = bottom.get(i);
        }
        return dp[dp.length - 1];
    }

    
}