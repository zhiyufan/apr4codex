package com.codex;

import java.util.*;

public class Solution {
public static int[] maxSubsequence(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k == 0 || nums.length < k) {
            return new int[0];
        }
        int[] ret = new int[k];
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            while (!list.isEmpty() && list.getLast() < nums[i]) {
                list.removeLast();
            }
            list.addLast(nums[i]);
        }
        ret[0] = list.getFirst();
        for (int i = k; i < nums.length; i++) {
            if (nums[i] > list.getFirst()) {
                list.removeFirst();
                while (!list.isEmpty() && list.getLast() < nums[i]) {
                    list.removeLast();
                }
            ret[i - k + 1] = list.getFirst();
                list.addLast(nums[i]);
            }
        }
        int[] ret = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            ret[i] = stack.pop();
        }
        return ret;
    }

    
}