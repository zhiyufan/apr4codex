package com.codex;

import java.util.*;

public class Solution {
public static int[] addKDigits(int[] nums, int k) {
    Arrays.sort(nums);
    int size = nums.length;
    int[] res = new int[k];
    boolean flag = false;
    int pos = 0;
    for (int i = 0; i < size; i++) {
        for (int j = 0; j < k; j++) {
            if (flag) {
                res[j] = nums[i];
                if (j == k - 1) {
                    flag = false;
                }
            } else {
                if (nums[i] != res[j]) {
                    res[j] = nums[i];
                    if (j == k - 1) {
                        flag = false;
                    }
                    break;
                } else {
                    flag = true;
                    continue;
                }
            }
        }
        sum += (pos + k - 1) * k / 2;
        return sum;
    }

    
}