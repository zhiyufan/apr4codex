package com.codex;

import java.util.*;

public class Solution {
public static int maxTwoEvents(int[][] events) {
    Arrays.sort(events, new Comparator<int[]>() {
        public int compare(int[] e1, int[] e2) {
            if (e1[1] != e2[1]) {
                return e1[1] - e2[1];
            }
        }
        return Math.max(dp[events.length][events.length], dp[events.length][events.length - 1]);
    }

    
}