package com.codex;

import java.util.*;

public class Solution {
    public static int[] pivotArray(int[] nums, int pivot) {
        
        int i = 0, j = nums.length-1, l = 0;
        int temp[] = new int[nums.length];
        while(l<nums.length)
        {
            if(nums[l]<pivot)
            {
                temp[i]=nums[l];
                i++;
            }
            else
            {
                temp[j]=nums[l];
                j--;
            }
            l++;
        }
        return temp;
        /*int i = 0, j = nums.length-1;
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
        return nums;*/
    }

    
}