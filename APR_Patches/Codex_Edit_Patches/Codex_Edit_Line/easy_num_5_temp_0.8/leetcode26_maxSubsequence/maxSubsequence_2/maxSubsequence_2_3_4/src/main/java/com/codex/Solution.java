package com.codex;

import java.util.*;

public class Solution {
    public static int[] maxSubsequence(int[] nums, int k) {
        

        int[] res = new int[k];
        int sum = 0;
        for (int i = 0; i < k; i++) {
            res[i] = nums[i];
            sum += nums[i];
        }
        int maxSum = sum;
        for (int i = k; i < nums.length; i++) {
            sum -= nums[i-k];
            sum += nums[i];
            if (sum > maxSum) {
                maxSum = sum;
                for (int j = i-k+1; j <= i; j++) {
                    res[j-i+k-1] = nums[j];
                }
            }
        }
        return res;
    }


   
  //   final byte[] byteArray = {1, 2, 3, 4};
  //   final int[] intArray = {5, 6, 7, 8};
  //   ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);
  //   IntBuffer intBuffer = byteBuffer.asIntBuffer();
  //   intBuffer.put(intArray);
  //   for (final int element : byteArray) {
  //       System.out.print(element);
  //   }
  //   System.out.println();
}