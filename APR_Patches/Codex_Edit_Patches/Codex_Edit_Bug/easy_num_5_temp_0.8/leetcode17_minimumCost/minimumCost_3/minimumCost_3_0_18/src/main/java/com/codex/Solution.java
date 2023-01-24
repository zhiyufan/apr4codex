package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int[] dp = new int[366];
        int[] duration = {1, 7, 30};
        Set<Integer> daySet = new HashSet<>();
        for (int d : days) {
            daySet.add(d);
        }
        return dp[dp.length - 1];
    }

    
}