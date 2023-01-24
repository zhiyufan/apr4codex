package com.codex;

import java.util.*;

public class Solution {
    public static int countElements(int[] nums) {
        

        int result = 0, temp = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                    temp++;
                if ((nums[j + 1] == nums[j] + 1) && (temp == nums[j + 1])) {
                    result++;
                    break;
                }
            }
        }
        return result;
    }
}