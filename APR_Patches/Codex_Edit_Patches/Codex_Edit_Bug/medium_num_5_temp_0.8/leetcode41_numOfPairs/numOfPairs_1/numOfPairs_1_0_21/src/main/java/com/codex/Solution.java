package com.codex;

import java.util.*;

public class Solution {
    public static int numOfPairs(String[] nums, String target) {
        String string = String.join("", nums);
        int len = nums.length;

        int count = 0;

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++)
                if ((nums[i] + nums[j]).equals(target))
                    if (string.contains(nums[i] + nums[j])) count++;
        }
        return count;
    }

    
}