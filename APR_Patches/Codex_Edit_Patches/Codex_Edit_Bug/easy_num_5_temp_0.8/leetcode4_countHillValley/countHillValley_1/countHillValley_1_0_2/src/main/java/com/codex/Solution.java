package com.codex;

import java.util.*;

public class Solution {
/*
  Author: jacobwg2
  Date:   2019-01-08
*/

import java.util.Arrays;

public class HillValley {

    public static int countHillValley(int[] nums) {
        
        if (nums == null || nums.length < 3) return 0;

        int count = 0;
        if (nums[0] > nums[1] && nums[1] < nums[2]) count++;
        if (nums[0] < nums[1] && nums[1] > nums[2]) count++;

        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i - 1] < nums[i] && nums[i + 1] < nums[i]) count++;
            if (nums[i - 1] > nums[i] && nums[i + 1] > nums[i]) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 1, 7, 8, 11}; // 2
        int[] arr2 = {1, 2, 4, 1, 7, 8, 6}; // 3
        int[] arr3 = {1, 2, 4, 1, 7, 8, 9}; // 3
        int[] arr4 = {1, 2, 4, 1, 7, 8, 7}; // 4
        int[] arr5 = {1, 2, 2, 1, 2, 2, 2}; // 4
        int[] arr6 = {1, 2, 4, 3, 7, 8, 6, 8}; // 3
        int[] arr7 = {1, 2, 3, 3, 2, 1}; // 4
        int[] arr8 = {1, 2, 3, 2, 1}; // 2
        int[] arr9 = {2, 1}; // 0
        int[] arr10 = {1, 2}; // 0
        int[] arr11 = {1, 2, 3}; // 0
        int[] arr12 = {3, 2, 1}; // 0
        int[] arr13 = {3, 2, 1, 3, 2}; // 0
        int[] arr14 = {3, 4, 1, 3, 2}; // 1
        int[] arr15 = {3, 4, 3, 3, 2}; // 2
        int[] arr16 = {1, 2, 3, 2, 5}; // 0

        System.out.println(Arrays.toString(arr1) + ": " + countHillValley(arr1));
        System.out.println(Arrays.toString(arr2) + ": " + countHillValley(arr2));
        System.out.println(Arrays.toString(arr3) + ": " + countHillValley(arr3));
        System.out.println(Arrays.toString(arr4) + ": " + countHillValley(arr4));
        System.out.println(Arrays.toString(arr5) + ": " + countHillValley(arr5));
        System.out.println(Arrays.toString(arr6) + ": " + countHillValley(arr6));
        System.out.println(Arrays.toString(arr7) + ": " + countHillValley(arr7));
        System.out.println(Arrays.toString(arr8) + ": " + countHillValley(arr8));
        System.out.println(Arrays.toString(arr9) + ": " + countHillValley(arr9));
        System.out.println(Arrays.toString(arr10) + ": " + countHillValley(arr10));
        System.out.println(Arrays.toString(arr11) + ": " + countHillValley(arr11));
        System.out.println(Arrays.toString(arr12) + ": " + countHillValley(arr12));
        System.out.println(Arrays.toString(arr13) + ": " + countHillValley(arr13));
        System.out.println(Arrays.toString(arr14) + ": " + countHillValley(arr14));
        System.out.println(Arrays.toString(arr15) + ": " + countHillValley(arr15));
        System.out.println(Arrays.toString(arr16) + ": " + countHillValley(arr16));
    }

}
}