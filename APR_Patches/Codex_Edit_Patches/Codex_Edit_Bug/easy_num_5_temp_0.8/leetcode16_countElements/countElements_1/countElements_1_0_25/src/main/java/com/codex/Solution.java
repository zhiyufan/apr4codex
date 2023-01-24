package com.codex;

import java.util.*;

public class Solution {
    public static int countElements(int[] nums) {

        int count = 0;
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length-1; j++) {
                if (nums[j] == nums[i] + 1) {
                    temp = nums[i] + 1;
                    break;
                }
            }
            if (temp != 0) {
                count++;
            }
        }
        return count;
    }
}