package com.codex;

import java.util.*;

public class Solution {
public static boolean isHillValley(int[] nums) {
        if (nums == null) {
            return false;
        }
        int length = nums.length;
        if (length < 3) {
            return false;
        }
        int count = 0, i = 1, j = 2;
        while (i < length) {
            while (i < length && !(nums[i - 1] < nums[i])) {
                i++;
            }
            j = i + 1;
            while (j < length && !(nums[j - 1] > nums[j])) {
                j++;
            }
            if (j == length) {
                return false;
            }
            count++;
            i = j + 1;
        }
}
        return count;
    }


}