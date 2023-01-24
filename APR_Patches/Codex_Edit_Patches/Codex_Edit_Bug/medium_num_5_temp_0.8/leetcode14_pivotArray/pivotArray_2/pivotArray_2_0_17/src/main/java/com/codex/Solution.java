package com.codex;

import java.util.*;

public class Solution {
public static void main(String[] args) {
    int[] nums = {5,4,7,8,9};
    pivotArray(nums,4);
    for (int i : nums) {
        System.out.print(i + " ");
    }

}

public static void pivotArray(int[] nums, int pivot) {
    int i = 0, j = nums.length-1;
    while (i <= j) {
        if (nums[i] < pivot) {
            i++;
        } else if (nums[j] > pivot) {
            j--;
        } else {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}
}