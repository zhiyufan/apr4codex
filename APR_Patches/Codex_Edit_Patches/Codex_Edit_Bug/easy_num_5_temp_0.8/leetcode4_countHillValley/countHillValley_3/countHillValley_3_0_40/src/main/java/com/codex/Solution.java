package com.codex;

import java.util.*;

public class Solution {
// Fix bug
public static void insertNum(int[] nums, int index, int value) {
    for (int i = index; i < nums.length - 1; i++) {
        nums[i + 1] = nums[i];
    }

    nums[index] = value;
}
}