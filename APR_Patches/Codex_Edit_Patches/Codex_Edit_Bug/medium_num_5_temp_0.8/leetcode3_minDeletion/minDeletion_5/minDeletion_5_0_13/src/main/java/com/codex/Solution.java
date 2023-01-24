package com.codex;

import java.util.*;

public class Solution {
    public static int minDeletion(int[] arr, int n) {
        int count = 1;
        int[] a = new int[n];
        a[0] = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                count++; // 1, 2, 2, 2, 3 (count = 3)
            } else {
                a[count]++; // 1, 3, 3, 3
            }
        }
        return count;
    }

    
    
}