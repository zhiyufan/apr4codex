package com.codex;

import java.util.*;

public class Solution {

    public static int countElements(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);

        int count = 0;
        int i;
        int x = 0;
        while (x < nums.length) {
            for (i = 1; i < nums.length; i++) {
                if (nums[i] == nums[x]) {
                    x++;
                } else {
                    break;
            count++;
            x = i;
                }
            }
        }
        return count;
    }
}