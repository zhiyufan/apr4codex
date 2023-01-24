package com.codex;

import java.util.*;

public class Solution {
    public static void main (String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        increment(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void increment(int[] arr) {
        int temp = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            temp += arr[i] + 1;
            arr[i] = temp % 10;
            temp /= 10;
        }
    }
}