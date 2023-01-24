package com.codex;

import java.util.*;

public class Solution {
import java.util.Scanner;

public class ReplaceBinaryString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int[] nums = CountInversion(arr, 0, arr.length - 1);
        System.out.println(nums[0]);
    }

    public static int[] CountInversion(int[] arr, int start, int end) {
        if (start == end) {
            int[] base = new int[] { arr[start], 0 };
            return base;
        }
        int mid = start + (end - start) / 2;
        int[] left = CountInversion(arr, start, mid);
        int[] right = CountInversion(arr, mid + 1, end);
        int[] newArray = new int[end - start + 1];
        int idx = 0, p = 0, q = 0;
        int inversion = left[1] + right[1];
        while (p < left.length - 1 && q < right.length - 1) {
            if (left[p] > right[q]) {
                newArray[idx++] = right[q++];
                inversion += left.length - 1 - p;
            } else {
                newArray[idx++] = left[p++];
            }
        }
        while (p < left.length - 1) {
            newArray[idx++] = left[p++];
        }

        while (q < right.length - 1) {
            newArray[idx++] = right[q++];
        }
        
        newArray[idx] = inversion;
        return newArray;
    }

}
}