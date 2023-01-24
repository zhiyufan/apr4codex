package com.codex;

import java.util.*;

public class Solution {
public static int[] pivotArray(int[] nums, int pivot) {
    int i = 0;
    int j = nums.length - 1;
    while (i <= j) {
        if (nums[i] == pivot) {
            i++;
        } else if (nums[j] == pivot) {
            j--;
        } else if (nums[i] < pivot && nums[j] > pivot) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        } else if (nums[i] > pivot && nums[j] < pivot) {
            i++;
            j--;
        }
    }

    return nums;
}
}