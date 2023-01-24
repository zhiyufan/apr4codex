package com.codex;

import java.util.*;

public class Solution {
public static List<Integer> maxScoreIndices(int[] nums) {
    List<Integer> ans = new ArrayList<>();
    int left = 0;
    int right = 0;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 0) {
            left++;
        } else {
            right++;
        }
    }
    int max = Math.max(left, right);
    if (max == left) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                ans.add(i);
            }
        }
    } else {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                ans.add(i);
            }
        }
    }
    return ans;
}
}