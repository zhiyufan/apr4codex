package com.codex;

import java.util.*;

public class Solution {
    private static final int MAX_N = 1000000;
    private static final long[] a = new long[MAX_N + 1];
    private static final long M = 1000000007;

    static {
        for (int i = 0; i <= MAX_N; ++i) {
            a[i] = (long) (2 * Math.pow(2, i));
            if (i > 0) {
                a[i] += a[i - 1];
                if (a[i] >= M) {
                    a[i] -= M;
                }
            }
        }
    }

    public static long solve(int n) {
        return a[n];
    }

    public static String findDifferentBinaryString(String[] nums) {

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 && nums[i].equals("0" + nums[i + 1])) {
                return "1" + nums[i];
            } else if (i == nums.length - 1 && nums[i].equals(nums[i - 1] + "0")) 
                return nums[i] + "1";
            } else if (i != 0 && nums[i].equals(nums[i - 1] + "0") && nums[i].equals("0" + nums[i + 1])) {
                return nums[i] + "1";
            }
        }
        return "";
    }

    
}