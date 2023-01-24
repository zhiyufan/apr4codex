package com.codex;

import java.util.*;

public class Solution {
public static boolean isBeautiful(int[] nums, int ind) {
        boolean cond1 = true;
        boolean cond2 = true;
        boolean cond3 = true;
        int curr = nums[ind];
        for (int i = 0; i < ind; i++) {
            if (nums[i] > curr) cond1 = false;
        }
        for (int i = ind; i < nums.length; i++) {
            if (nums[i] < curr) cond2 = false;
        }
        if (ind > 0) {
            if (nums[ind - 1] > curr) cond3 = false;
        }
        if (ind < nums.length - 1) {
            if (nums[ind + 1] < curr) cond3 = false;
        }
        return cond1 || (cond2 && cond3);
    }
}