package com.codex;

import java.util.*;

public class Solution {
    public static int minMoves(int[] nums) {
        if (nums.length == 0 || nums == null) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
        }

        int moves = 0;
        for (int num : nums) {
            moves += num - min;
        }
        return sb.toString();
    }
}