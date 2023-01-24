package com.codex;

import java.util.*;

public class Solution {
    public static int minBitFlips(int start, int goal) {
        /** A bit flip of a number x is choosing a bit in the binary representation of x and flipping it from either 0 to 1 or 1 to 0.
         *  For example, for x = 7, the binary representation is 111 and we may choose any bit (including any leading zeros not shown) and flip it. We can flip the first bit from the right to get 110, flip the second bit from the right to get 101, flip the fifth bit from the right (a leading zero) to get 10111, etc.
         *  Given two integers start and goal, return the minimum number of bit flips to convert start to goal.
         */
        int result = 0;
        start ^= goal;
        for (int i = 0; i < start; i++) {
            if (((start >> i) & 1) > 0) {
                result++;
                start ^= (1 << i);
            }
        }
        return result;
    }

    private static int findSmallestDivisor(int[] nums, int threshold) {
        int left = 1;
        int right = (int) 1e6;
        while (left < right) {
            int m = (left + right) / 2, sum = 0;
            for (int i : nums) {
                sum += (i + m - 1) / m;
            }
            if (sum > threshold) {
                left = m + 1;
            } else {
                right = m;
            }
        }
        return left;
    }

    private static void quickSort(int[] nums, int low, int high) {
        if (low < high) {
            int p = partition(nums, low, high);
            quickSort(nums, low, p - 1);
            quickSort(nums, p + 1, high);
        }
    }

    private static int partition(int[] nums, int low, int high) {
        int pivot = nums[high];
        int i = low - 1;
        for (int j = low; j <= high - 1; j++) {
            if (nums[j] < pivot) {
                i++;
                swap(nums, i, j);
            }
        }
        swap(nums, i + 1, high);
        return i + 1;
    }

    private static void mergeSort(int[] nums, int[] temp, int low, int high) {
        if (low < high) {
            int middle = (low + high) / 2;
            mergeSort(nums, temp, low, middle);
            mergeSort(nums, temp, middle + 1, high);
            merge(nums, temp, low, middle, high);
        }
    }

    private static void merge(int[] nums, int[] temp, int low, int middle, int high) {
        for (int i = low; i <= high; i++) {
            temp[i] = nums[i];
        }
        int i = low;
        int j = middle + 1;
        int k = low;
        while (i <= middle && j <= high) {
            if (temp[i] <= temp[j]) {
                nums[k] = temp[i];
                i++;
            } else {
                nums[k] = temp[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            nums[k] = temp[i];
            k++;
            i++;
        }
    }

    private static void heapSort(int[] nums) {
        int n = nums.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(nums, n, i);
        }
        for (int i = n - 1; i >= 0; i--) {
            swap(nums, 0, i);
            heapify(nums, i, 0);
        }
    }

    private static void heapify(int[] nums, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < n && nums[l] > nums[largest]) {
            largest = l;
        }
        if (r < n && nums[r] > nums[largest]) {
            largest = r;
        }
        if (largest != i) {
            swap(nums, i, largest);
            heapify(nums, n, largest);
        }
    }

    private static void countSort(int[] nums) {
        int max = getMax(nums);
        int[] count = new int[max + 1];
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }
        int j = 0;
        for (int i = 0}