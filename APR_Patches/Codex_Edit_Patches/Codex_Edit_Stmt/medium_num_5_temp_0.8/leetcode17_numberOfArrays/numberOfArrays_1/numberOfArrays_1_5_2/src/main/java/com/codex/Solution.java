package com.codex;

import java.util.*;

public class Solution {
public class Solution {
  class Solution {
    public int maxNonOverlapping(int[] nums, int target) {
        int res = 0, prefix = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            prefix += nums[i];
            if (map.containsKey(prefix - target)) {
                res++;
                prefix = 0;
                map.clear();
                map.put(0, -1);
            } else {
                map.put(prefix, i);
            }
        }
        return res;
    }

}
}