package com.codex;

import java.util.*;

public class Solution {
/*
Problem Description

You are given an array of N integers, A1, A2 ,..., AN. You have to determine the number of ways in which we can choose a non-empty subset of integers, B1, B2 ,..., BK such that:

No two elements in the subset B have consecutive values in the original array A.
The number of elements in the subset B is the product of the elements in the subset B.
See the examples for more clarity.



Problem Constraints
1 <= N <= 105

1 <= A[i] <= 105



Input Format
First argument is an integer array A.



Output Format
Return an integer denoting the number of ways we can choose the subset.



Example Input
A = [2, 5, 7]


Example Output
1


Example Explanation
There is only one way to choose the subset {2, 5, 7}. All the elements in the subset have the consecutive values in the original array A.
*/

    public static int sumOfBeauties(int[] nums) {
        
        int sum = 0;
        for(int i = 1; i < nums.length - 1; i++) {
            if(nums[i - 1] < nums[i] && nums[i] < nums[i + 1]) {
                sum += 1; //2
            } else {
                int j = i - 1;
                int k = i + 1;
                while(j >= 0) {
                    if(nums[i] > nums[j]) {
                        break;
                    }
                    j--;
                }
                while(k < nums.length) {
                    if(nums[i] > nums[k]) {
                        break;
                    }
                    k++;
                }
                if(j < 0 && k >= nums.length) {
                    sum += 2; //1
                }
            }
        }
        return sum;
    }

    
}