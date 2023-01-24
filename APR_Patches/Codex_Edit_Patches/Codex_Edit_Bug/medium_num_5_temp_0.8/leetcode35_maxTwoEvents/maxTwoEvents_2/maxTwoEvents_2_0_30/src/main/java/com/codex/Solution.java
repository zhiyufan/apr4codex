package com.codex;

import java.util.*;

public class Solution {
    public static int maxTwoEvents(int[][] events) {
        
        int n = events2.length;
        if (n < 2) return 0;
        Arrays.sort(events2, (arr1, arr2) -> (Math.abs(arr1[0] - arr1[1]) - Math.abs(arr2[0] - arr2[1])));
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            sum += events2[i][2];
        }
        return sum;
    }

    
}