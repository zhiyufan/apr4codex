package com.codex;

import java.util.*;

public class Solution {
    public static int[] sortJumbled(int[] mapping, int[] nums) {
        

        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = nums[i];
        }
        Arrays.sort(res);

        int[] map = new int[10];
        for (int i = 0; i < 10; i++) {
            map[mapping[i]] = i;
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = map[nums[i]];
        }

        Arrays.sort(nums);
        return nums;
    }

   private static int numMovesStonesII(int[] stones) {
        if (stones == null || stones.length <= 2) {
            return 0;
        }
        Arrays.sort(stones);

        int l = 0;
        int r = 0;
        int min = Integer.MAX_VALUE;
        int max = 0;
        int len = stones.length;

        while (r < len) {
            while (r < len && stones[r] - stones[l] + 1 <= len) {
                r++;
            }
            min = Math.min(min, len - r + l);
            max = Math.max(max, stones[r - 1] - stones[l] + 1 - len);
            l++;
        }
        return min + max;
    }
}