package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int[] missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n * (n + 1) / 2;
        for (int x : nums) sum -= x;
        return new int[]{sum, sum + n + 1};
    }
}
}