package com.codex;

import java.util.*;

public class Solution {
    public static int[] pivotArray(int[] nums, int pivot) {
        
        int n = nums.length;
        int right = n - 1, left = 0;
		//大于pivot的元素会在pivot左边
		//小于pivot的元素会在pivot右边
		//因此需要两个指针left right
        while (left <= right) {
			//保证left<=right
			//因为left++，right--，所以边界不能为left<right
            while (left <= right && nums[left] < pivot) {
				//如果left元素小于pivot就跳过
                left++;
            }
            while (left <= right && nums[right] > pivot) {
				//如果right元素大于pivot就跳过
                right--;
            }
            if (left <= right) {
				//如果left元素大于pivot，right元素小于pivot，交换两个元素
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
				//移动left right
                left++;
                right--;
            }
        }
		//left比right大1
		//left之前的元素都比pivot小
		//right之后的元素都比pivot大
		//left和right两个位置的元素未比较
        return nums;
    }

    
}