package com.codex;

import java.util.*;

public class Solution {
#

    public static int mostFrequent(int[] nums, int key) {
        
        int maxCount = 0;
        int maxNum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == key && nums[i + 1] != key) {
                int count = map.getOrDefault(nums[i + 1], 0);
                map.put(nums[i + 1], count + 1);
                if (count + 1 > maxCount) {
                    maxCount = count + 1;
                    maxNum = nums[i + 1];
                }
            }
        }

        return maxNum;
    }

    def has_duplicates(lst):
    for item in lst:
        if (lst.count(item) > 1):
            return True
    return False

    print(has_duplicates([1, 2, 3, 4, 5]))
    print(has_duplicates([1, 2, 3, 4, 1]))
}