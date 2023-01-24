package com.codex;

import java.util.*;

public class Solution {
public static int numOfPairs(String[] nums, String target) {

    int ans = 0;
    int a, b;
    for (int i = 0; i < nums.length; i++) {
        for (int j = i + 1; j < nums.length; j++) {
            a = Integer.parseInt(nums[i] + nums[j]);
            b = Integer.parseInt(nums[j] + nums[i]);
            if (a == Integer.parseInt(target) || b == Integer.parseInt(target)) ans++;
        }
    }

    return ans;
}
}