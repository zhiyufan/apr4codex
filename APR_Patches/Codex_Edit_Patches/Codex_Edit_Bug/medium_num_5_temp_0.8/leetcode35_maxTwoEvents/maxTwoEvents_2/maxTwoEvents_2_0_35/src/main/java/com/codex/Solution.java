package com.codex;

import java.util.*;

public class Solution {

public static int maxTwoEvents(int[][] events) {
    class arrElem implements Comparable<arrElem> {
        int end;
        int exclMax;
        int inclMax;
        arrElem(int end, int exclMax, int inclMax) {
            this.end = end;
            this.exclMax = exclMax;
            this.inclMax = inclMax;
        }
        public int compareTo(arrElem o) {
            return this.end - o.end;
        }
    }
    int n = events.length;
    if (n == 0) return 0;
    arrElem[] arr = new arrElem[n];
    Arrays.sort(events, new Comparator<int[]>() {
        public int compare(int[] a, int[] b) {
            return a[1] - b[1];
        }
    });
    arr[0] = new arrElem(events[0][1], events[0][2], events[0][2]);
    for (int i = 1; i < n; i++) {
        arr[i] = new arrElem(events[i][1], 0, 0);
        arr[i].inclMax = events[i][2];
        for (int j = i - 1; j >= 0; j--) {
            if (arr[j].end <= events[i][0]) {
                arr[i].exclMax = Math.max(arr[i].exclMax, arr[j].exclMax);
                arr[i].inclMax = Math.max(arr[i].inclMax, arr[j].inclMax + events[i][2]);
            }
        }
    }
    int ans = 0;
    for (int i = 0; i < n; i++) {
        ans = Math.max(ans, Math.max(arr[i].exclMax, arr[i].inclMax));
    }
    return ans;
}

public static int maxTwoEvents2(int[][] events) {

    int n = events.length;
    if (n == 0) return 0;
    int[][] dp = new int[n][3];
    int ans = 0;
    dp[0][0] = 0;
    dp[0][1] = events[0][2];
    dp[0][2] = events[0][2];
    for (int i = 1; i < n; i++) {
        dp[i][0] = Math.max(dp[i-1][0], Math.max(dp[i-1][1], dp[i-1][2]));
        dp[i][1] = events[i][2] + Math.max(dp[i-1][0], dp[i-1][2]);
        dp[i][2] = events[i][2] + dp[i-1][1];
        ans = Math.max(ans, Math.max(dp[i][0], Math.max(dp[i][1],dp[i][2])));
    }
    return ans;
}





public static int maxTwoEvents(int[][] events) {
        
    int n = events.length;
    if (n == 0) return 0;
    int[][] dp = new int[n][3];
    int ans = 0;
    dp[0][0] = 0;
    dp[0][1] = events[0][2];
    dp[0][2] = events[0][2];
    for (int i = 1; i < n; i++) {
        dp[i][0] = Math.max(dp[i-1][0], Math.max(dp[i-1][1], dp[i-1][2]));
        dp[i][1] = events[i][2] + Math.max(dp[i-1][0], dp[i-1][2]);
        dp[i][2] = events[i][2] + dp[i-1][1];
        ans = Math.max(ans, Math.max(dp[i][0], Math.max(dp[i][1],dp[i][2])));
    }

    return ans;
}
}