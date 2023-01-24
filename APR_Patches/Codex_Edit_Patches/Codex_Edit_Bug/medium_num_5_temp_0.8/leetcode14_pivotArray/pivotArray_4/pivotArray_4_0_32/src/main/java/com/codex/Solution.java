package com.codex;

import java.util.*;

public class Solution {

import java.util.Arrays;
import java.util.Scanner;

public class PivotArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nums = in.nextInt();
        int pivot = in.nextInt();
        int[] arr = new int[nums];
        for (int i = 0; i < nums ; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(pivotArray(arr, pivot)));

    }

    public static int[] pivotArray(int[] nums, int pivot) {

        int less = 0;
        int greater = nums.length - 1;
        for (int i = 0; i <= greater; ) {
            if (nums[i] < pivot) {
                swap(nums, less, i);
                i++;
                less++;
            } else if (nums[i] > pivot) {
                swap(nums, i, greater);
                greater--;
            } else {
                i++;
            }
        }
        return nums;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
}