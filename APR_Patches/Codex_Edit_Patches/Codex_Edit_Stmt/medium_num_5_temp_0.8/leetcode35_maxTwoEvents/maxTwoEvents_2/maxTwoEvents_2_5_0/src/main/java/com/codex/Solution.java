package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    int n;
    public int maxEnvelopes(int[][] envelopes) {
        n = envelopes.length;
        Arrays.sort(envelopes, new Comparator<int[]>(){
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        return maxEnvelopes(envelopes, 0, -1, 0);
    }
    
    public int maxEnvelopes(int[][] envelopes, int index, int prev, int count) {
        if (index == n) return count;
        int max = 0;
        for (int i = index; i < n; i++) {
            if (prev == -1 || envelopes[i][0] > envelopes[prev][0] && envelopes[i][1] > envelopes[prev][1]) {
                max = Math.max(max, maxEnvelopes(envelopes, i+1, i, count+1));
            }
        }
        return max;
    }
}
}