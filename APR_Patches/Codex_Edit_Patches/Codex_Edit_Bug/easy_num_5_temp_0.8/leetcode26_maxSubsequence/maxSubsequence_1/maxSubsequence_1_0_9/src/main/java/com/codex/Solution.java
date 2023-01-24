package com.codex;

import java.util.*;

public class Solution {
/**
 *
 * Find the k biggest element in an array of n elements
 *
 *
 * @author: Ronan
 *
 */

 
    public static int[] maxSubsequence(int[] nums, int k) {

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < nums.length; i++) {
            while (!stack.isEmpty() && stack.size() + nums.length - i >= k && nums[i] < stack.peek()) {
                stack.pop();
            }
            if (stack.size() < k) {
                stack.push(nums[i]);
            }
        }
        int[] ret = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            ret[i] = stack.pop();
        }
        return ret;
    }



import com.sun.org.apache.regexp.internal.RE;

import java.util.Arrays;

public class Solution {

    public static int[] maxSubsequence(int[] nums, int k) {
        if (k == 0) return new int[0];

        int[] ret = new int[k];
        for (int i = 0; i < nums.length; i++) {
            while (k > 0 && (ret[k - 1] < nums[i] || ret[k - 1] == nums[i])) {
                ret[k - 1] = nums[i];
                k--;

                if (k == 0) return ret;
            }
        }
        return ret;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(maxSubsequence(new int[]{5, 4, 0, 5, 4, 3, 1, 5, 3, 0, 3}, 5)));
        System.out.println(Arrays.toString(maxSubsequence(new int[]{5, 4, 0, 5, 4, 3, 2, 5, 3, 0, 3}, 3)));
        System.out.println(Arrays.toString(maxSubsequence(new int[]{}, 3)));
        System.out.println(Arrays.toString(maxSubsequence(new int[]{1, 3, 4}, 3)));
        System.out.println(Arrays.toString(maxSubsequence(new int[]{1}, 0)));
        System.out.println(Arrays.toString(maxSubsequence(new int[]{1, 1, 1, 1}, 2)));
        System.out.println(Arrays.toString(maxSubsequence(new int[]{1, 1, 3, 3, 1, 1, 4}, 2)));
        System.out.println(Arrays.toString(maxSubsequence(new int[]{1, 2, 3, 4}, 3)));
        System.out.println(Arrays.toString(maxSubsequence(new int[]{1, 3, 2, 4}, 2)));
        System.out.println(Arrays.toString(maxSubsequence(new int[]{1, 3, 2, 4}, 1)));
        System.out.println(Arrays.toString(maxSubsequence(new int[]{1, 2, 3}, 2)));
    }
}
}