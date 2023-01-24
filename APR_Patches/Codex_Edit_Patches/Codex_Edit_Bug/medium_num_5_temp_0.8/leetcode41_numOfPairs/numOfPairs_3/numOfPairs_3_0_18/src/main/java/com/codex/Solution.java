package com.codex;

import java.util.*;

public class Solution {


class Solution {
    public static int numOfPairs(String[] nums, String target) {

        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Integer.parseInt(nums[i] + nums[j]) == Integer.parseInt(target) || Integer.parseInt(nums[j] + nums[i]) == Integer.parseInt(target)) ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert sol.numOfPairs(new String[]{"5", "1", "2", "3", "4"}, "10") == 2 : "Test 1 Failed";
        assert sol.numOfPairs(new String[]{"3", "16", "15", "6", "7"}, "20") == 3 : "Test 2 Failed";
        System.out.println("All tests passed!");
    }
}
}