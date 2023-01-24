package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

public class FindMaxSubsequence{
    public static void main(String[] args) {
        int[] nums = {1, 4, 2, 10, 2, 3, 1, 0, 20};
        int[] res = maxSubsequence(nums, 4);
        for (int i : res) {
            System.out.print(i + " ");
        }

    }

    public static int[] maxSubsequence(int[] nums, int k) {


        int[] res = new int[k];
        int sum = 0;
        for (int i = 0; i < k; i++) {
            res[i] = i;
            sum += nums[i];
        }
        int maxSum = sum;
        for (int i = k; i < nums.length; i++) {
            sum -= nums[i-k];
            sum += nums[i];
            if (sum > maxSum) {
                maxSum = sum;
                for (int j = i-k+1; j <= i; j++) {
                    res[j-i+k-1] = j;
                }
            }
        }
        return res;
    }


}
}