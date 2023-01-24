package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int findKthLargest(int[] nums, int k) {
        int len = nums.length;
        int target = nums[len - k];
        Arrays.sort(nums);
        for (int i = 0; i < len; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
}