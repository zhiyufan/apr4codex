package com.codex;

import java.util.*;

public class Solution {
    public static int[] solve(int[] arr, int k) {
         int n = arr.length;
         int[] r = new int[n];
         for (int i = 0; i < n; i++) {
             r[i] = i;
         }
         Arrays.sort(r, (i, j) -> arr[j] > arr[i] ? -1 : 1);
         for (int i = 0; i < n; i++) {
             if (i > 0 && arr[r[i]] == arr[r[i - 1]]) {
                 k++;
             }
             if (k == 0) {
                 break;
             }
         }
         return Arrays.copyOfRange(r, k, n);
    }
}