package com.codex;

import java.util.*;

public class Solution {
    public static int countElements(int[] nums) {

        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i] + 1)) {
                count++;
            }
        }
        return count;
    }
}