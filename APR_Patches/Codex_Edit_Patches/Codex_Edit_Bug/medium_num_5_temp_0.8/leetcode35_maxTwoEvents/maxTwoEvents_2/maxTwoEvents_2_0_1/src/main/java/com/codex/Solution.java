package com.codex;

import java.util.*;

public class Solution {
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            int x = Integer.parseInt(br.readLine());
            int[][] events = new int[x][3];
            for (int i = 0; i < x; i++) {
                String[] line = br.readLine().split("\\s+");
                events[i][0] = Integer.parseInt(line[0]);
                events[i][1] = Integer.parseInt(line[1]);
                events[i][2] = Integer.parseInt(line[2]);
            }
            System.out.println(maxTwoEvents(events));
        }
    }

    public static int maxTwoEvents(int[][]events) {
        
        int len = events.length;
        if (len == 0) {
            return 0;
        }
        int[][] dp = new int[2][2];
        // initialize dp[0][0] with events[0][2]
        dp[0][0] = events[0][2];
        int i = 1;
        while (i < len) {
            // dp[1][0] means the max value if including current event
            dp[1][0] = Math.max(dp[0][0], dp[0][1]) + events[i][2];
            // dp[1][1] means the max value if not including current event
            dp[1][1] = Math.max(dp[0][0], dp[0][1]);
            dp[0][0] = dp[1][0];
            dp[0][1] = dp[1][1];
            i++;
        }
        return Math.max(dp[1][0], dp[1][1]);
    }


}
}