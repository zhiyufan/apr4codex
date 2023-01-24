package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int numDecodings(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        return result;
    }

    private static int getNumberOfOnes(int[] nums, int left, int right) {
        int result = 0;
        for (int i = left; i <= right; i++) {
            if (nums[i] == 1) {
                result++;
            }
        }
        return result;
    }

    private static int getNumberOfZeros(int[] nums, int left, int right) {
        int result = 0;
        for (int i = left; i <= right; i++) {
            if (nums[i] == 0) {
                result++;
            }
        }
        return result;
    }

    
}