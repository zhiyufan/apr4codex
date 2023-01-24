package com.codex;

import java.util.*;

public class Solution {
public class BinarySearch {
    public static int findIndex(String[] arr, String target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (Integer.parseInt(arr[mid]) == Integer.parseInt(target)) return mid;
            if (Integer.parseInt(arr[mid]) > Integer.parseInt(target)) right = mid - 1;
            else left = mid + 1;
        }
        return -1;
    }

}
}