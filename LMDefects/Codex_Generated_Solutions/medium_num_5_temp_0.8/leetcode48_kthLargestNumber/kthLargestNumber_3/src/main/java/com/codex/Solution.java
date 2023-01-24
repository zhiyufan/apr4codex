package com.codex;

import java.util.*;

public class Solution {
    public static String kthLargestNumber(String[] nums, int k) {
        /** You are given an array of strings nums and an integer k. Each string in nums represents an integer without leading zeros.
         * Return the string that represents the kth largest integer in nums.
         * Note: Duplicate numbers should be counted distinctly. For example, if nums is ["1","2","2"], "2" is the first largest integer, "2" is the second-largest integer, and "1" is the third-largest integer.
         */
        if (nums == null || nums.length == 0) return "";
        PriorityQueue<String> pq = new PriorityQueue<>(new Comparator<String>() {
            @Override
            }