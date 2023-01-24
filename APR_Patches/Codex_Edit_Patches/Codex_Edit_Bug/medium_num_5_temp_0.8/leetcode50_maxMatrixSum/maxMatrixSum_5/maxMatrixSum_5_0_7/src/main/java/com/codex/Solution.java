package com.codex;

import java.util.*;

public class Solution {
    public static long maxMatrixSum(int[][] matrix) {
        

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] matrixSum = new int[rows][cols];

        matrixSum[0][0] = matrix[0][0];

        for(int i=1;i<rows;i++) {
            matrixSum[i][0] = matrixSum[i-1][0] + matrix[i][0];
        }

        for(int j=1;j<cols;j++) {
            matrixSum[0][j] = matrixSum[0][j-1] + matrix[0][j];
        }

        for(int i=1;i<rows;i++) {
            for(int j=1;j<cols;j++) {
                matrixSum[i][j] = matrix[i][j] + Math.max(matrixSum[i-1][j],matrixSum[i][j-1]);
            }
        }

        long maxSum = Long.MIN_VALUE;
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                if(maxSum<matrixSum[i][j]) {
                    maxSum = matrixSum[i][j];
                }
            }


///  https://leetcode.com/problems/longest-increasing-subsequence/submissions/

// it is not DP , it is greedy
// here the idea is

// example :  10, 9, 2, 5, 3, 7, 101, 18

// 1.if the number is greater , then we can add the number to the list which is going to be the answer
// 2.if the number is smaller, then we have to replace the elements which are greater than the number
// 3.since the number is smaller , we have to replace the greater number with the number instead of replacing
// the smaller number with the number.

// so here the approach is that we are considering the numbers in ascending order. So the answer will be in descending order

// the answer is 10, 9, 5, 7, 101, 18



    public int lengthOfLIS(int[] nums) {
        
        int n = nums.length;
        
       if(n==0) {
           return 0;
       }
        
        int[] result = new int[n];
        
        result[0]  = nums[0];
        int len = 1;
        
        for(int i=1;i<n;i++) {
            
            if(nums[i]>result[len-1]) {
                result[len++] = nums[i];
            }else {
                // we have to replace the first greater number with the number
                replaceFirstGreaterNumber(result,len,nums[i]);
                
            }
            
            
        }
        
        return len;
    }
    
    public void replaceFirstGreaterNumber(int[] result,int len,int num) {
        
        int l = 0;
        int r = len-1;
        
        while(l<r) {
            
            int mid = l+r>>>1;
            
            if(result[mid]<num) {
                l = mid+1;
            }else {
                r = mid;
            }
        }
        
        result[l] = num;    
        
    }
        }

        return maxSum;
    }
}