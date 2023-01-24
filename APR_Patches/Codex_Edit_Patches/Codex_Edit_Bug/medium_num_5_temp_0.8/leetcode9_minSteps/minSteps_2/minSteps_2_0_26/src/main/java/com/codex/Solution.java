package com.codex;

import java.util.*;

public class Solution {
    public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Long> set = new TreeSet<>();
        for (int i = 0; i < nums.length; ++i) {
            Long floor = set.floor((long) nums[i] + t);
            Long ceiling = set.ceiling((long) nums[i] - t);
            if ((floor != null && floor >= nums[i])
                    || (ceiling != null && ceiling <= nums[i])) {
                return true;
            }
            set.add((long) nums[i]);
            if (set.size() > k) {
                set.remove((long) nums[i - k]);
             }
          }
          return false;
    }

    
}