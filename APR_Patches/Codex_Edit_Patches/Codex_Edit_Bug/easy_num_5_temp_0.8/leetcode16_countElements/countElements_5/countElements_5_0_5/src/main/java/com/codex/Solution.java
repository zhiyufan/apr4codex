package com.codex;

import java.util.*;

public class Solution {
class Solution {
    public int[] singleNumber(int[] nums) {
        int result[] = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int count = map.get(nums[i]);
                map.put(nums[i], count + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        int index = 0;
        for (Map.Entry entry : map.entrySet()) {
            if ((Integer) entry.getValue() == 1) {
                if (index == 0) {
                    result[index] = (Integer) entry.getKey();
                } else {
                    result[index] = (Integer) entry.getKey();
            index++;
                }
            }
        }
        return result;
    }

}
}