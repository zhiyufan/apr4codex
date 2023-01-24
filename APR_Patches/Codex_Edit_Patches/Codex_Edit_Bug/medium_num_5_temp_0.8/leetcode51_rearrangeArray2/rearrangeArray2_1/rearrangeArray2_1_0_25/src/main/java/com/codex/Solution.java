package com.codex;

import java.util.*;

public class Solution {
import java.util.Arrays;

    public static int[] rearrangeArray2(int[] nums) {
        int n = nums.length;
        int[] sorted = nums.clone();

        Arrays.sort(sorted);

        int[] answer = new int[n];
        for (int i = 0; i < n - 1; i += 2) {
            if (nums[i+1] > nums[i]) {
                answer[i] = nums[i];
                answer[i+1] = nums[i+1];
            } else {
                answer[i] = nums[i];
            }
        }

        return answer;
    }
}