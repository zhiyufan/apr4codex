package com.codex;

import java.util.*;

public class Solution {
public class Main {

    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0};

        int[] result = maxScoreIndices(nums);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
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