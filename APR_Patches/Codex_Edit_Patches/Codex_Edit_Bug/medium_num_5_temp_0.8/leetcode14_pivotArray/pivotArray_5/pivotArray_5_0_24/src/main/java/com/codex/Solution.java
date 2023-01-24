package com.codex;

import java.util.*;

public class Solution {
    public static int[] pivotArray(int[] arr, int pivot) {
        if (arr.length == 0 || arr == null) {
            return arr;
        }
        int n = arr.length;
        int left = 0, right = n - 1;
        while (right >= left) {
            while (right >= left && arr[left] < pivot) {
                left ++;
            }
            while (right >= left && arr[right] > pivot) {
                right--;
            }
            if (right >= left) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return nums;
    }

    
}