package com.codex;

import java.util.*;

public class Solution {
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int k = 3;
        System.out.println(Arrays.toString(maxSubsequence(nums, k)));
    }

    public static int[] maxSubsequence(int[] nums, int k) {
        int[] res = Arrays.copyOfRange(nums, 0, k);
        for (int i = 0; i < nums.length - k; i++) {
            if (nums[i + k] > res[k - 1]) {
                res[0] = res[1];
                for (int j = 1; j < k - 1; j++) {
                    res[j] = Math.max(res[j], res[j + 1]);
                }
                res[k - 1] = nums[i + k];
            }
        }
        return res;
    }

}
}