package com.codex;

import java.util.*;

public class Solution {
public static long searchArray(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if(arr[mid]==key) {
                return mid;
            }
            else if(arr[mid]>key) {
                high = mid-1;
            }
            else low = mid+1;
        }
        return -1;
    }
}