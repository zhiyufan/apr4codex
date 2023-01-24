package com.codex;

import java.util.*;

public class Solution {
                                                            for (int j = 1; j < n; j++) {
                                                                dp[j][0] = Math.max(dp[j-1][0], Math.max(dp[j-1][1], dp[j-1][2]));
                                                                dp[j][1] = events[j][2] + Math.max(dp[j-1][0], dp[j-1][2]);
                                                                dp[j][2] = events[j][2] + dp[j-1][1];
                                                                ans = Math.max(ans, Math.max(dp[j][0], Math.max(dp[j][1],dp[j][2])));
                                                            } 
}