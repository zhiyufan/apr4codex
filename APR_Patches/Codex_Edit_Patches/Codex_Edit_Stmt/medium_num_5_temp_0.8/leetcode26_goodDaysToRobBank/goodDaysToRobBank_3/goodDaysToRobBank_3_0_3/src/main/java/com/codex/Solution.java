package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> goodDaysToRobBank(int[] nums, int k) {
        

        List<Integer> res = new ArrayList<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            int temp = nums[i];
            int flag = 0;
            for (int j = i - k; j <= i + k; j++) {
                if (j < 0 || j >= nums.length) {
                    continue;
                }
                if (nums[j] > temp) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                res.add(i);
            }
        }
            return res;
    }
}