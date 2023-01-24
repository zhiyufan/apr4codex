package com.codex;

import java.util.*;

public class Solution {
    public static int partition1(int[] nums, int start, int end, int pivot) {
        
        int smaller = start, equal = start, greater = end;
        while (equal < greater) {
            if (nums[equal] < pivot) {
                swap(nums, smaller++, equal++);
            }
            else if (nums[equal] == pivot) {
                ++equal;
            }
            else {
                swap(nums, equal, --greater);
            }
        }
        return smaller;
    }
    public static int partition2(int[] nums, int start, int end, int pivot) {
        
        int smaller = start, greater = end;
        for (int i = start; i < end; i++) {
            if (nums[i] < pivot) {
                swap(nums, smaller++, i);
            }
            else if (nums[i] > pivot) {
                swap(nums, i--, --greater);
            }
        }
        return smaller;
    }
    public static int partition3(int[] nums, int start, int end, int pivot) {
        
        int smaller = start, greater = end-1;
        while (smaller <= greater) {
            if (nums[smaller] < pivot) {
                smaller++;
            }
            else if (nums[greater] >= pivot) {
                greater--;
            }
            else {
                swap(nums, smaller++, greater--);
            }
        }
        return smaller;
    }
    
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    
}