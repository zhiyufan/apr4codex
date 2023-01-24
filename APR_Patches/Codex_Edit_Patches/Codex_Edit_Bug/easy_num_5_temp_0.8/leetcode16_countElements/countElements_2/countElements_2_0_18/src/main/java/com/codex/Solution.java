package com.codex;

import java.util.*;

public class Solution {
    public static int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int number : nums) {
            if(set.contains(number)) {
                return number;
            } else {
                set.add(number);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i] + 1)) {
                count += 1;
            }
        }
        return count;
    }

    
}