package com.codex;

import java.util.*;

public class Solution {
public int findMissingNumber(int[] nums) {

    int expectedSum = nums.length * (nums.length + 1) / 2;
    int actualSum = 0;
    for (int n : nums) {
        actualSum += n;
    }
    return expectedSum - actualSum;
}
}