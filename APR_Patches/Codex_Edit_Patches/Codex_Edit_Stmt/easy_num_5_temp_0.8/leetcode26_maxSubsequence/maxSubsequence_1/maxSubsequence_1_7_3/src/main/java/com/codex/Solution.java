package com.codex;

import java.util.*;

public class Solution {


    public static int[] maxSubsequence(int[] nums, int k) {
        

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < nums.length; i++) {
            while (!stack.isEmpty() && stack.size() + nums.length - i > k && nums[i] < stack.peek()) {
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


    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        int i = a.length() - 1, j = b.length() - 1;
        while (i >= 0 || j >= 0) {
            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }
            sb.append(sum % 2);
            sum /= 2;
        }

        if (sum != 0) {
            sb.append(sum);
        }

        return sb.reverse().toString();
    }








    public int findMin(int[] nums) {
        int lo = 0;
        int hi = nums.length - 1;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (nums[mid] > nums[hi]) {
                lo = mid + 1;
            } else if (nums[mid] == nums[hi]) {
                hi--;
            } else {
                hi = mid;
            }
        }
        return nums[lo];
    }





        return ret;
    }

    
}