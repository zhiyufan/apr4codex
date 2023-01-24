package com.codex;

import java.util.*;

public class Solution {
    public static int[] pivotArray(int[] arr, int pivot) {
        
        int i = 0, j = arr.length-1;
        while (i <= j) {
            if (arr[i] < pivot) {
                i++;
            } else if (arr[j] > pivot) {
                j--;
            } else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return nums;
    }

    
}