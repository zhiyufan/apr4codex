package com.codex;

import java.util.*;

public class Solution {
    public static int countElements(int[] nums) {
        
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] < nums[j] && nums[i] + 1 == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }

   public static int binarySearch(int[] array, int x) {
        int low = 0;
        int high = array.length - 1;
        int middle = (low + high) / 2;
        while (low <= high) {
            if (array[middle] < x) {
                low = middle + 1;
            } else if (array[middle] > x) {
                high = middle - 1;
            } else {
                return middle;
            }
            middle = (low + high) / 2;
        }
        if (low > high) {
            return -1;
        }
        return -1;
    }
}