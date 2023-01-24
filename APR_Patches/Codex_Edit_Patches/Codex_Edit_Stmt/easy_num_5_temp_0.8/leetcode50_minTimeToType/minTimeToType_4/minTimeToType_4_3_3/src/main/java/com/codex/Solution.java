package com.codex;

import java.util.*;

public class Solution {
class Solution {
    
    public int minMoves(int[] nums, int limit) {
         int[] count = new int[(limit << 1) + 1];
        int numberOfPairs = nums.length;
        for (int i = 0; i < nums.length / 2; i++) {
            numberOfPairs--;
            int min = Math.min(nums[i], nums[nums.length - i - 1]);
            int max = Math.max(nums[i], nums[nums.length - i - 1]);
            count[2] += 2;
            count[min + 1]--;
            count[min + max]--;
            count[max + 1]++;
            count[limit + min]++;
        }
        int minMoves = Integer.MAX_VALUE;
        int curr = numberOfPairs;
        for (int i = 2; i <= limit << 1; i++) {
            curr += count[i];
            if (curr < minMoves) {
                minMoves = curr;
            }
        }
}
        return minMoves;
    }
}