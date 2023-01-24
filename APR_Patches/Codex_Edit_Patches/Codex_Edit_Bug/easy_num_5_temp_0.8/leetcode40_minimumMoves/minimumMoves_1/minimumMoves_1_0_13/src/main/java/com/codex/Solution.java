package com.codex;

import java.util.*;

public class Solution {
public static int minimumMoves(String s) {

    if (s.length() < 3) return 0;
    int count = 0;
    for (int i = 2; i < s.length(); i++) {
        if (s.charAt(i) == 'X' && s.charAt(i - 1) == 'X' && s.charAt(i - 2) == 'X') {
            count++;
            i += 2;
        }
    }
    return count;
}

public static int minimumMoves(String s) {

    if (s.length() < 3) return 0;
    int count = 0;
    for (int i = 2; i < s.length(); i++) {
        if (s.charAt(i) == 'X' && s.charAt(i - 1) == 'X' && s.charAt(i - 2) == 'X') {
            count++;
            i += 2;
        }
    }
    return count;
}

public static int minimumMoves(String s) {

    if (s.length() < 3) return 0;
    int count = 0;
    for (int i = 2; i < s.length(); i++) {
        if (s.charAt(i) == 'X' && s.charAt(i - 1) == 'X' && s.charAt(i - 2) == 'X') {
            count++;
            i += 2;
        }
    }
    return count;
}

public static int minimumMoves(String s) {

    if (s.length() < 3) return 0;
    int count = 0;
    for (int i = 2; i < s.length(); i++) {
        if (s.charAt(i) == 'X' && s.charAt(i - 1) == 'X' && s.charAt(i - 2) == 'X') {
            count++;
            i += 2;
        }
    }
    return count;
}

public static int minimumMoves(String s) {

    if (s.length() < 3) return 0;
    int count = 0;
    for (int i = 2; i < s.length(); i++) {
        if (s.charAt(i) == 'X' && s.charAt(i - 1) == 'X' && s.charAt(i - 2) == 'X') {
            count++;
            i += 2;
        }
    }
    return count;
}

public static int minimumMoves(String s) {

    if (s.length() < 3) return 0;
    int count = 0;
    for (int i = 2; i < s.length(); i++) {
        if (s.charAt(i) == 'X' && s.charAt(i - 1) == 'X' && s.charAt(i - 2) == 'X') {
            count++;
            i += 2;
        }
    }
    return count;
}

public static int minimumMoves(String s) {

    if (s.length() < 3) return 0;
    int count = 0;
    for (int i = 2; i < s.length(); i++) {
        if (s.charAt(i) == 'X' && s.charAt(i - 1) == 'X' && s.charAt(i - 2) == 'X') {
            count++;
            i += 2;
        }
    }
    return count;
}

public static int minimumMoves(String s) {

    if (s.length() < 3) return 0;
    int count = 0;
    for (int i = 2; i < s.length(); i++) {
        if (s.charAt(i) == 'X' && s.charAt(i - 1) == 'X' && s.charAt(i - 2) == 'X') {
            count++;
            i += 2;
        }
    }
    return count;
}

public static int minimumMoves(String s) {

    if (s.length() < 3) return 0;
    int count = 0;
    for (int i = 2; i < s.length(); i++) {
        if (s.charAt(i) == 'X' && s.charAt(i - 1) == 'X' && s.charAt(i - 2) == 'X') {
            count++;
            i += 2;
        }
    }
    return count;
}

public static int minimumMoves(String s) {

    if (s.length() < 3) return 0;
    int count = 0;
    for (int i = 2; i < s.length(); i++) {
        if (s.charAt(i) == 'X' && s.charAt(i - 1) == 'X' && s.charAt(i - 2) == 'X') {
            count++;
            i += 2;
        }
    }
    return count;
}

public static int minimumMoves(String s) {
    if (s.length() < 3) return 0;
    int count = 0;
    for (int i = 2; i < s.length(); i++) {
        if (s.charAt(i) == 'X' && s.charAt(i - 1) == 'X' && s.charAt(i - 2) == 'X') {
            count++;
            i += 2;
        }
    }
    return count;
}

int[] insertionSort(int arr[])
{
    int i = 0;
    int j = 0;
    int key = 0;
    for (i = 1; i < arr.length; i++) {
        j = i - 1;
        key = arr[i];
        while (arr[j] > key && j >= 0) {
            arr[j + 1] = arr[j];
            j = j - 1;
        }
        arr[j + 1] = key;
    }
    return arr;
}

int[] quick_Sort(int arr[], int low, int n) {
    int lo = low;
    int hi = n;
    if (lo >= n) {
        return arr;
    }
    int mid = arr[(lo + hi) / 2];
    while (lo < hi) {
        while (lo < hi && arr[lo] < mid) {
            lo++;
        }
        while (lo < hi && arr[hi] > mid) {
            hi--;
        }
        if (lo < hi) {
            int T = arr[lo];
            arr[lo] = arr[hi];
            arr[hi] = T;
        }
    }
    if (hi < lo) {
        int T = hi;
        hi = lo;
        lo = T;
    }
    quick_Sort(arr, low, lo);
    quick_Sort(arr, lo == low ? lo + 1 : lo, n);
    return arr;
}

int[] mergeSort(int arr[], int array_size) {
    if (arr.length > 1) {
        int q = arr.length / 2;

        int leftArray[] = new int[q
            }
        }
        return count;
    }

    
}