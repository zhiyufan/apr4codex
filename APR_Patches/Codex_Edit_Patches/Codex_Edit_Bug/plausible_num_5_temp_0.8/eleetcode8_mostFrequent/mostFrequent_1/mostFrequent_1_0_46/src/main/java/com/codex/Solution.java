package com.codex;

import java.util.*;

public class Solution {
public static int mostFrequent(int[] nums, int key) {

        int count = 0;
        int maxCount = 0;
        int maxElement = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                int element = nums[i + 1];
                for (int j = i + 2; j < nums.length; j++) {
                    if (nums[j] == element) {
                        count++;
                    }
                }
                if (count > maxCount) {
                    maxCount = count;
                    maxElement = element;
                }
            }
        }

        return maxElement;
    }
}