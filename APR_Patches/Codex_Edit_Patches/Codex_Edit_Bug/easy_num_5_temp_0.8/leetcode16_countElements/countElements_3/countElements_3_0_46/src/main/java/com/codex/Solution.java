package com.codex;

import java.util.*;

public class Solution {
    public static int countElements(int[] nums) {
        int count = Arrays.stream(nums).boxed().collect(Collectors.toSet()).size();
        int result = 0;
        while (count-- > 0) {
            int value = nums[count];
            int index = -1;
            if ((index = Arrays.binarySearch(nums, value + 1)) > -1) {
                result++;
            }
        }
        return result;
    }
}