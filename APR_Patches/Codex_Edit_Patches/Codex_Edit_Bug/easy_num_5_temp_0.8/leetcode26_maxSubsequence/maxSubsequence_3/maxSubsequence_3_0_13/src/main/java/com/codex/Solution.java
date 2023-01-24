package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] nums = new int[]{-1, 4, 5, -6, 7, 8, -9, 1, 2, -3, 4};
        int[] res = maxSubsequence(nums, 4);
        System.out.println(Arrays.toString(res));
    }

    public static int[] maxSubsequence(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) {
            return new int[0];
        }
        
        if (k > nums.length) {
            k = nums.length;
        }
        
        Deque<Integer> deque = new LinkedList<>();
        int sum = 0;
        for (int i = 0; i < k; i++) {
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }
            deque.offerLast(i);
            sum += nums[i];
        }
        
        int maxSum = sum;
        int end = 0;
        for (int i = k; i < nums.length; i++) {
            sum -= nums[i - k];
            while (!deque.isEmpty() && nums[i] > nums[deque.peekLast()]) {
                deque.pollLast();
            }
            if (sum > max) {
                max = sum;
                end = i;
            }
        }
        return Arrays.copyOfRange(nums, end - k + 1, end + 1);
    }

    
}