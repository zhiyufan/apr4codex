package com.codex;

import java.util.*;

public class Solution {
    public static int countElements(int[] nums) {
    int count = 0;
    Arrays.sort(nums);
    int prev = -1;
    for (int x : nums) {
        if (prev != -1 && x == prev + 1) {
            count++;
        } else if (prev == x) {
            // same number, just ignore it
        }
        prev = x;
    }

    return count;
}
}