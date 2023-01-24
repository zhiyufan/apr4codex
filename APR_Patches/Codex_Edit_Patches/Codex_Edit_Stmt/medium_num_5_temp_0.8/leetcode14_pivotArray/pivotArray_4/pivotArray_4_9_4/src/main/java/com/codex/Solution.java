package com.codex;

import java.util.*;

public class Solution {
    public static int[] pivotArray(int[] nums, int pivot) {

        int[] result = new int[nums.length];
        int greater = nums.length - 1;
        int less = -1;
        int equal = 0;
        while (equal <= greater) {
            if (nums[equal] < pivot) {
                result[++less] = nums[equal++];
            } else if (nums[equal] == pivot) {
                equal++;
            } else if (nums[i] > pivot) {
                result[greater--] = nums[i];
            }
        }
        return result;
    }
}