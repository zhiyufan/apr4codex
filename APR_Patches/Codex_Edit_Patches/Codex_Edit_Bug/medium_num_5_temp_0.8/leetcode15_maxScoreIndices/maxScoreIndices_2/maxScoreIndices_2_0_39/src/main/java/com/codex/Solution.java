package com.codex;

import java.util.*;

public class Solution {
/*
We define the following:

A subarray of array  of length  is a contiguous segment from  through  where .
The sum of an array is the sum of its elements.
Given an  element array of integers, , and an integer, , determine the maximum value of the sum of any of its subarrays modulo . For example, Assume  and . The following table lists all subarrays and their moduli:

		sum	%2
[1]	1	1
[2]	2	0
[3]	3	1
[1,2]	3	1
[2,3]	5	1
[1,2,3]	6	0
The maximum modulus is .

Function Description

Complete the maximumSum function in the editor below. It should return a long integer that represents the maximum value of .

maximumSum has the following parameter(s):

a: an array of long integers, the array to analyze
m: a long integer, the modulo divisor
Input Format

The first line contains an integer , the number of queries to perform.

The next  pairs of lines are as follows:
- The first line contains two space-separated integers  and (long), the length of  and the modulo divisor.
- The second line contains  space-separated long integers .

Constraints

All values in  are distinct.
Output Format

For each query, return the maximum value of  as a long integer.

Sample Input

1
5 7
3 3 9 9 5
Sample Output

6
Explanation

The subarrays of array  and their respective sums modulo  are ranked in order of length and sum in the following list:

[]
[3]
[3]
[9]
[9]
[5]
[3,3]
[3,9]
[3,9]
[3,5]
[9,9]
[9,5]
[3,3,9]
[3,9,9]
[3,9,5]
[3,3,9,9]
[3,3,9,5]
[3,9,9,5]
[3,3,9,9,5]
The maximum result occurs for the subarray .
*/


    public static List<Integer> maxScoreIndices(int[] nums) {
        
        int n = nums.length;
        if (n == 0) return new ArrayList<>();
        int[] leftCount = new int[n];
        int[] rightCount = new int[n];
        int cur = 0;
        for (int i = 0; i < n; i++) {
            cur += nums[i];
            leftCount[i] = cur;
        }
        cur = 0;
        for (int i = n - 1; i >= 0; i--) {
            cur += nums[i] ^ 1;
            rightCount[i] = cur;
        }
        int max = 0;
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int left = i == 0 ? 0 : leftCount[i - 1];
            int right = i == n - 1 ? 0 : rightCount[i + 1];
            int sum = left + right;
            if (sum > max) {
                max = sum;
                res = new ArrayList<>();
                res.add(i);
            } else if (sum == max) {
                res.add(i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] arr = 
        { { 1, 2, 3, 4, 5 }, 
          { 2, 1, 4, 3, 5 }, 
          { 1, 2, 3, 5, 4 }, 
          { 3, 2, 1, 5, 4 },
          { 2, 1, 3, 4, 5 }, 
          { 3, 1, 2, 4, 5 } };
        int n = arr.length;
        int m = arr[0].length;
        int[][] dp = new int[n][m];
        for (int i = 0; i < n; i++) {
            dp[i][0] = 1;
            for (int j = 1; j < m; j++) {
                for (int k = 0; k < j; k++) {
                    if (arr[i][k] < arr[i][j])
                        dp[i][j] = Math.max(dp[i][j], dp[i][k] + 1);
                }
            }
        }
        System.out.println(Arrays.deepToString(dp));
    }
    
}