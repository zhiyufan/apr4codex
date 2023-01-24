package com.codex;

import java.util.*;

public class Solution {
//O(n)

    public static int mostFrequent(int[] nums, int key) {

        int count = 0;
        int maxCount = 0;
        int target = 0;

        int maxCount = 0;
        int target = nums[0];

        for (int i = 0; i < nums.length; i++) { //<-- O(n)
            if (nums[i] == key) {
                for (int j = i + 1; j < nums.length; j++) { //<-- O(n)
                    if (nums[j] == nums[i]) {
                        count++;
                    )
                    if (count > maxCount) {
                        maxCount = count;
                        target = nums[i];
                    } else if (nums[j] == key) {
                        break;
                    } else if (nums[j] == nums[j + 1])(
                        count++;
                    }
                }
            }
        }
        return target;
    }
}