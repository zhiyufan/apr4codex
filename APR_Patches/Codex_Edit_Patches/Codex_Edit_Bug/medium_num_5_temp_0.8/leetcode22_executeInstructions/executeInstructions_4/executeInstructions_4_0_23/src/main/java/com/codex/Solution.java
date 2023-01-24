package com.codex;

import java.util.*;

public class Solution {
    public Substring getOccurence(String input, String pattern) {
        Substring ans = null;
        int[][] dp = new int[input.length() + 1][pattern.length() + 1];
        for (int i = 1; i <= input.length(); i++) {
            for (int j = 1; j <= pattern.length(); j++) {
                boolean isSame = input.charAt(i - 1) == pattern.charAt(j - 1);
                if (isSame) {
                    int num = dp[i - 1][j - 1];
                    if (num > 0) {
                        num++;
                        dp[i][j] = num;
                        if (num > ans.length) {
                            ans.startIndex = i - num;
                            ans.length = num;
                        }
                    } else {
                        dp[i][j] = 1;
                        if (ans == null) {
                            ans = new Substring(i - 1, 1);
                        } else if (ans.length == 1) {
                            ans.startIndex = i - 1;
                        }
                    }
                }
            }
        }
        return ans;
    }

    public class Substring {
        public int startIndex;
        public int length;
    
        public Substring(int startIndex, int length) {
            this.startIndex = startIndex;
            this.length = length;
        }
    }
}