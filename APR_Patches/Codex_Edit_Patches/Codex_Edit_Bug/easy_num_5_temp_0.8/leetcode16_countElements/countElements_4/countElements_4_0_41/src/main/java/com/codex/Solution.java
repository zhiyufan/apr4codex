package com.codex;

import java.util.*;

public class Solution {
public static int countElements(int[] nums) {
    if (nums == null || nums.length == 0) {
        return 0;
    }
    Arrays.sort(nums);

    int count = 0;
    for (int i = 0; i < nums.length - 1; i++) {
        if (nums[i] < nums[i + 1]) {
            boolean found = false;
            for (int j = i + 1; j < nums.length; j++) {
                if (found && nums[i] < nums[j]) {
                    break;
                }
                if (nums[i] + 1 == nums[j]) {
                    found = true;
                }
            }
            if (found) {
                count += 1;
            }
        }
    }
    return count;
}
}