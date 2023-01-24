package com.codex;

import java.util.*;

public class Solution {
/*
 * GeeksForGeeks
 * Given an array of integers and a number x, 
 * find the smallest subarray with sum greater than the given value.
 *
 */

public class SmallestSubarrayWithSumGreaterThanX {
    public static int smallestSubarray(int[] array, int target) {
        int start = 0, end = array.length - 1;
        int index = -1;
        int sum = array[0];
        while(end > start) {
            if(sum <= target) {
                end--;
                if(end > start) {
                    sum += array[end];
                }
            } else if (sum >= target) {
                if(end - start < index || index == -1) {
                    index = end - start;
                }
                sum -= array[start];
                start++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(smallestSubarray(array, 15));
    }
}
}