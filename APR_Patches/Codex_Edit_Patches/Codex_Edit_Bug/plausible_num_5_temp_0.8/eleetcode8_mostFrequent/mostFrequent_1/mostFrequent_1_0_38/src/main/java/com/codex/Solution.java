package com.codex;

import java.util.*;

public class Solution {
 public static int mostFrequent(int[] nums, int key) {
        int index = 0;
        int maxCount = -1;
        for (int i = 0; i < nums.length; ++i) {
            int count = 0;
            while (i < nums.length && nums[i] == key) {
                count += 1;
                i += 1;
            }
            if (count > maxCount) {
                index = i - 1;
                maxCount = count;
            }
        }

        return index;
    }
}