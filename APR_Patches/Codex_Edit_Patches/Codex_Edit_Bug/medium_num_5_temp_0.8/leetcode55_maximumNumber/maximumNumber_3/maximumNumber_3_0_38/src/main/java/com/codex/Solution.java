package com.codex;

import java.util.*;

public class Solution {
import java.util.ArrayList;

public class First {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int val = 3;
        System.out.println(maximumNumber(arr, val));
    }

    public static int maximumNumber(int[] arr, int val) {
        int len = arr.length;
        int i = 0;
        int j = len - 1;
        while (i < j) {
            if (arr[i] + arr[j] > val)
                j--;
            else if (arr[i] + arr[j] == val) {
                return arr[i++] + arr[j--];
            } else {
                i++;
            }
        }
        return -1;
    }

}
}