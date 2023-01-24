package com.codex;

import java.util.*;

public class Solution {
    public static int[] rearrangeArray2(int[] arr) {
        int[] res = new int[arr.length];
        int i = 0;
        int left = 0;
        int right = arr.length - 1;
        while (i <= right) {
            if (i % 2 == 0) {
                res[i] = arr[right];
                right--;
            } else {
                res[i] = arr[left];
                left++;
            }
            i++;
        }
        return res;
    }
}