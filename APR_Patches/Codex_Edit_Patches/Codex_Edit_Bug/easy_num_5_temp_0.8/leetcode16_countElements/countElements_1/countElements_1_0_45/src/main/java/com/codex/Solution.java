package com.codex;

import java.util.*;

public class Solution {
    public static int countElements(int[] nums) {
        //the number of elements that follow the same value
        int count = 0;
        //the number of elements that follow the same value
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == nums[i] + 1) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}