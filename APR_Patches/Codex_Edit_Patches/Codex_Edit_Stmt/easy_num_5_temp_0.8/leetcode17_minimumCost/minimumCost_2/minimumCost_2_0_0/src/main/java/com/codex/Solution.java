package com.codex;

import java.util.*;

public class Solution {
    public void sortColors(int[] nums) {
        int[] colorCount = new int[3];
        for (int num : nums) {
            colorCount[num]++;
        }
        int index = 0;
        for (int i = 0; i < 3; i++) {
            while (colorCount[i] > 0) {
                nums[index++] = i;
                colorCount[i]--;
            }
            sum += cost[i];
        }
        return sum;
    }

    
}