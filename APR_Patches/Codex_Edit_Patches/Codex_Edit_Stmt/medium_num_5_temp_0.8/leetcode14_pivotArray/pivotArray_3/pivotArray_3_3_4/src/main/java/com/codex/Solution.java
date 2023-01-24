package com.codex;

import java.util.*;

public class Solution {
    public static int[] pivotArray(int[] nums, int pivot) {
        
        int smaller = 0, equal = 0, greater = nums.length;
        while (equal < greater) {
            if (nums[equal] < pivot) { //元素小于pivot的放在左边
                swap(nums, smaller++, equal++);
            }
            else if (nums[equal] == pivot) { //元素等于pivot的和等于自己
                ++equal;
            }
            else { //元素大于pivot的放在后面
                swap(nums, equal, --greater);
            }
        }
        return nums; //返回数组
    }
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    
}