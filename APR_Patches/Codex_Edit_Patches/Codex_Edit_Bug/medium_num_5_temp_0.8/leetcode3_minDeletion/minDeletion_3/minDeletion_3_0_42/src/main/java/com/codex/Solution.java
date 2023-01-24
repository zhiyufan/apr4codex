package com.codex;

import java.util.*;

public class Solution {
    public static int minDeletion(int[] nums) {

        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if ((nums[i] - nums[i - 1]) % 2 != 0) {
                count = count + 2;
            }
        }
        return count;
    }
}