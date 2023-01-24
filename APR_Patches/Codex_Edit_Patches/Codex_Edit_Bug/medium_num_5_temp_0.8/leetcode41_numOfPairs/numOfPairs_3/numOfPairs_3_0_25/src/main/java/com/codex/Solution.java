package com.codex;

import java.util.*;

public class Solution {
public static int numOfPairs(String[] nums, String target) {
    int ans = 0;
    for (int i = 0; i < nums.length; i++) {
        for (int j = i + 1; j < nums.length; j++) {
            int p = Integer.parseInt(nums[i] + nums[j]),
                q = Integer.parseInt(nums[j] + nums[i]);
            ans += (p == Integer.parseInt(target) || q == Integer.parseInt(target)) ? 1 : 0;
        }    
    }

    return ans;
}
}