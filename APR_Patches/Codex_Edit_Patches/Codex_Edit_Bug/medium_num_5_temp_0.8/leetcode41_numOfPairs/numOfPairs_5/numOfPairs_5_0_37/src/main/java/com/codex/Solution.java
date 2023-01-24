package com.codex;

import java.util.*;

public class Solution {
    public static int numOfPairs(String[] nums, String target) {

        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            if (Integer.valueOf(nums[i] + nums[i]) == Integer.valueOf(target)) ans++;
            for (int j = i + 1; j < nums.length + 1; j++) {
                if (Integer.valueOf(nums[i] + nums[j]) == Integer.valueOf(target)) {
                    ans++;
                    for (int k = j + 1; k < nums.length + 1; k++) {
                        if (Integer.valueOf(nums[i] + nums[k]) == Integer.valueOf(target)) {
                            ans++;
                        }
                    }
                }
            }
        }
        return ans;
    }
}