package com.codex;

import java.util.*;

public class Solution {
private static int inf = (int) 1e9;

private static int minBitFlips(int start, int goal, int[] switches, int i, int n, int m, int[][] dp) {
        int k = n - i;
        if (k == 0) {
            if (start == goal) {
                return 0;
            } else {
                return inf;
            }
        }
        if (dp[start][i] != -1) {
            return dp[start][i];
        }
        int ans = minBitFlips(start, goal, switches, i + 1, n, m, dp);
        if (switches[k - 1][i] != 0) {
            ans = Math.min(ans, minBitFlips(start ^ switches[k - 1][i], goal ^ switches[k - 1][i], switches, i + 1, n, m, dp) + 1);
        }
        return dp[start][i] = ans;
    }
    
	private static int minBitFlips(int start, int goal, int[] switches, int n, int m) {
        int[][] dp = new int[1 << m][n];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        int ans = minBitFlips(start, goal, switches, 0, n, m, dp);
        return ans == inf ? -1 : ans;
    }

    public static int minBitFlips2(int start, int goal) {
        int n = goal.length();
        int m = n - start.length();
        int[] switches = new int[n];
        for (int i = 0; i < n; i++) {
            char s = '0';
            if (i < m) {
                s = '1';
            }
            for (int j = n - 1; j >= 0; j--) {
                if (i == j) {
                    switches[i] = (switches[i] << 1) | (goal.charAt(j) == s ? 1 : 0);
                } else {
                    switches[i] = (switches[i] << 1) | 1;
                }
            }
        }
        int startNum = 0;
        for (int j = m - 1; j >= 0; j--) {
            startNum = (startNum << 1) | (start.charAt(j) == '1' ? 1 : 0);
        }
        for (int i = 0; i < n; i++) {
            char ch = goal.charAt(i);
            if (ch == '0' || ch == '1') {
                int left = -1;
                int right = n;
                while (right - left > 1) {
                    int mid = (left + right) / 2;
                    if (switches[mid][i] == 0) {
                        right = mid;
                    } else {
                        left = mid;
                    }
                }
                if (right != n) {
                    int swap = switches[n - 1];
                    switches[n - 1] = switches[right];
                    switches[right] = swap;
                }
            }
        }
        return minBitFlips(startNum, 0, switches, n, m);
    }

    private static int findFirstOne(int start, int goal) {
        for (int i = 0; start > 0 || goal > 0; i++, start >>= 1, goal >>= 1) {
            if ((start & 1) != (goal & 1)) {
                return i;
            }
        }
        return -1;
    }
    
	private static int minBitFlips(int start, int goal) {
        if (start == goal) {
            return 0;
        }
        int ans = 0;
        while (true) {
            int first = findFirstOne(start, goal);
            if (first == -1) {
                return ans;
            }
            start ^= 1 << first;
            ans++;
        }
    }
	
	
    public static int minBitFlips(int start, int goal) {
        
        int count = 0;
        int i = 0;
        while (start != goal) {
            if ((start & 1) != (goal & 1)) {
                count++;
                if (i > 0 && start == (goal ^ (1 << i))) {
                    return -1;
                }
                start ^= 1 << i;
            }
            start >>= 1;
            goal >>= 1;
            i++;
        }
        return count;
    }

    
}