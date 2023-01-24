package com.codex;

import java.util.*;

public class Solution {
public static int[] pivotArray(int[] nums, int pivot) {
    int i = 0;
    int j = nums.length-1;
    while (i < j) {
        while (nums[i] < pivot && i < nums.length-1) {
            i++;
        }
        return nums;
    }

    
}