package com.codex;

import java.util.*;

public class Solution {
import java.util.Arrays;

public class Exercise1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 7};
        int[] arr1 = {1, 2, 5, 7, 9};
        if (diff2arr(arr, arr1)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static boolean diff2arr(int[] arr, int[] arr1) {
        Arrays.sort(arr);
        Arrays.sort(arr1);
        if (arr.length == arr1.length) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != arr1[i]) {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }

}
}