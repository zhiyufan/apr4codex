package com.codex;

import java.util.*;

public class Solution {
    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            String[] arr = s.split(" ");
            if (arr.length == 0) {
                System.exit(0);
            }
            int k = Integer.parseInt(arr[0]);
            if (k >= arr.length || k <= 0) {
                System.exit(0);
            }
            int[] nums = new int[arr.length-1];
            for (int i = 1; i < arr.length; i++) {
                nums[i-1] = Integer.parseInt(arr[i]);
            }
            int[] res = maxSubsequence(nums, k);
            System.out.println("Result: ");
            for (int i = 0; i < k; i++) {
                System.out.print(res[i] + " ");
            }
        }
        
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
    
    
        
    }
    
    import java.util.Scanner;
    
}