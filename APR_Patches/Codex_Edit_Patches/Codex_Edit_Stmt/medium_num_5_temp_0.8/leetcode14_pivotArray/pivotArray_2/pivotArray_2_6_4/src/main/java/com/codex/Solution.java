package com.codex;

import java.util.*;

public class Solution {
题目描述：

重新排列数组，使得数组元素比指定值小的放在左边，等于指定值的放在中间，比指定值大的放在右边。

举例：

给定 nums = [0, 1, 2, 0, 2, 1, 1]， pivot = 1， 返回 [0, 0, 1, 1, 1, 2, 2]。

class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        
        if (nums == null || nums.length == 0) {
            return nums;
        }
        
        int l = 0;
        int r = nums.length - 1;
        int i = l, j = r;
        while (i <= j) {
            if (nums[i] < pivot) {
                i++;
            } else if (nums[j] < pivot) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
                i++;
                j--;
            } else if (nums[j] > pivot) {
                j--;
            } else {
                j--;
            }
        }
        return Arrays.copyOfRange(nums, l, r + 1);
    }
}
复杂度分析

时间复杂度O(N)O(N)，其中NN为数组元素的个数。

空间复杂度O(N)O(N)，其中NN为数组元素的个数。

方法二：神逻辑，计算出小于pivot的元素的个数，大于等于pivot的元素的个数，最后遍历数组，按照规则插入数组元素，最后再拷贝一下。

public int[] pivotArray(int[] nums, int pivot) {
        if (nums == null || nums.length == 0) {
            return nums;
        }
        int lt = 0;
        int gt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < pivot) {
                lt++;
            } else if (nums[i] > pivot) {
                gt++;
            }
        }

        int l = 0;
        int r = nums.length - 1;
        while (true) {
            while (l < nums.length && nums[l] < pivot) {
                l++;
            }
            while (r >= 0 && nums[r] > pivot) {
                r--;
            }
            if (l >= r) {
                break;
            }
            int tmp = nums[l];
            nums[l] = nums[r];
            nums[r] = tmp;
            l++;
            r--;
        }
        r = nums.length - 1;
        while (true) {
            while (l < nums.length && nums[l] == pivot) {
                l++;
            }
            while (r > l && nums[r] == pivot) {
                r--;
            }
            if (l >= r) {
                break;
            }
            int tmp = nums[l];
            nums[l] = nums[r];
            nums[r] = tmp;
            l++;
            r--;
        }
        return Arrays.copyOfRange(nums, lt, lt + gt + 1);
    }
复杂度分析

时间复杂度O(N)O(N)，其中NN为数组元素的个数。

空间复杂度O(N)O(N)，其中NN为数组元素的个数。

    
    
}