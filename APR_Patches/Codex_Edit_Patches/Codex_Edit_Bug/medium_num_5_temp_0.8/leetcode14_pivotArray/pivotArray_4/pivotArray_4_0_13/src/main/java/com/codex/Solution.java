package com.codex;

import java.util.*;

public class Solution {
    public static int[] pivotArray(int[] nums, int pivot) {
        
        int[] result = new int[nums.length];
        int less = 0;
        int greater = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < pivot) {
                result[less++] = nums[i];
            } else if (nums[i] > pivot) {
                result[greater--] = nums[i];
            }
        }
        while (less <= greater) {
            result[less++] = pivot;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] result = pivotArray(new int[]{1,2,3,5,2,5}, 2);
        for (int num : result) {
            System.out.print(num + "\t");
        }
    }

    

    
}