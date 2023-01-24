package com.codex;

import java.util.*;

public class Solution {
    public static int minimumDifference(int[] nums, int k) {
        /** You are given a 0-indexed integer array nums, where nums[i] represents the score of the ith student. You are also given an integer k.
         * Pick the scores of any k students from the array so that the difference between the highest and the lowest of the k scores is minimized.
         * Return the minimum possible difference.
         */
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int maxScore = nums[0];
        int minScore = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > maxScore) {
                maxScore = nums[i];
            }
            if (nums[i] < minScore) {
                minScore = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == maxScore) {
                maxHeap.offer(i);
            }
            if (nums[i] == minScore) {
                minHeap.offer(i);
            }
        }
        if (maxHeap.size() > k) {
            maxHeap.poll();
        }
        if (minHeap.size() > k) {
            minHeap.poll();
}