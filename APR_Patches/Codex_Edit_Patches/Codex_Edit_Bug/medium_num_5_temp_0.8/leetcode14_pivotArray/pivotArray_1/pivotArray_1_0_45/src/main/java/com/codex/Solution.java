package com.codex;

import java.util.*;

public class Solution {
    public static int[] pivotArray(int[] nums, int pivot) {
        
        int i = -1, j = nums.length;
        while (i <= j) {
            while (nums[++i] < pivot) {
                if (i == nums.length - 1) {
                    break;
                }
            }
            while (nums[--j] > pivot) {
                if (j == 0) {
                    break;
                }
            }
            if (i >= j) {
                break;
            }
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        return nums;
    }

    

    public static int[] pivotArray(int[] nums, int pivot) {
        
        int i = 0, j = nums.length - 1;
        while (i < j) {
            while (i < j && nums[i] < pivot) {
                i++;
            }
            while (i < j && nums[j] > pivot) {
                j--;
            }
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        return nums;
    }

    
}