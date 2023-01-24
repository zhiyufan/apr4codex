package com.codex;

import java.util.*;

public class Solution {
    public static int[] rearrangeArray2(int[] nums) {
        /** You are given a 0-indexed array nums of distinct integers. You want to rearrange the elements in the array such that every element in the rearranged array is not equal to the average of its neighbors.
         * More formally, the rearranged array should have the property such that for every i in the range 1 <= i < nums.length - 1, (nums[i-1] + nums[i+1]) / 2 is not equal to nums[i].
         * Return any rearrangement of nums that meets the requirements.
         */
        int sum = 0;
        int len = nums.length;
        int[] copy = new int[len];
        for (int i = 0; i < len; i++) {
            sum += nums[i];
            copy[i] = nums[i];
        }
        Arrays.sort(copy);
        int avg = sum / nums.length;
        for (int i = 1; i < nums.length - 1; i++) {
            }