package com.codex;

import java.util.*;

public class Solution {
    class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length + 1];
        dp[0] = 0;
        dp[1] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i + 1] = Math.max(dp[i], dp[i - 1] + nums[i]);
        }
        return dp[nums.length];
    }
}





    public static List<Integer> goodDaysToRobBank(int[] security, int time) {
        


        List<Integer> goodDays = new ArrayList<>();

        for (int i = time; i < security.length - time; i++) {
            boolean isGoodDay = true;
            for (int j = i - time; j < i; j++) {
                for (int k = j + 1; k < i; k++) {
                    if (security[j] < security[k]) {
                        isGoodDay = false;
                        break;
                    }
                }

                if (!isGoodDay) {
                    break;
                }
            }

            if (isGoodDay) {
                for (int j = i + 1; j < i + time; j++) {
                    for (int k = j + 1; k < i + time; k++) {
                        if (security[j] > security[k]) {
                            isGoodDay = false;
                            break;
                        }
                    }
                    if (!isGoodDay) {
                        break;
                    }
                }
            }

            if (isGoodDay) {
                goodDays.add(i);
            }
        }

        return goodDays;
    }

    
}