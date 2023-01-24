package com.codex;

import java.util.*;

public class Solution {
# Java program to rearrange an array 
# with O(1) extra space 
import java.util.*; 
  
class Rearrange { 
  
    // Function to rearrange an array in 
    // minimum maximum form 
    // @arr : input array 
    // @n : size of array 
    static void rearrange(int[] arr, int n) 
    { 
        // initialize index of first minimum 
        // and first maximum element 
        int max_idx = n - 1, min_idx = 0; 
  
        // store maximum element of array 
        int max_elem = arr[n - 1] + 1; 
  
        // traverse array elements 
        for (int i = 0; i < n; i++) { 
            // at even index : we have to put 
            // maximum element 
            if (i % 2 == 0) { 
                arr[i] += (arr[max_idx] % max_elem) * max_elem; 
                max_idx--; 
            } 
  
            // at odd index : we have to put minimum element 
            else { 
                arr[i] += (arr[min_idx] % max_elem) * max_elem; 
                min_idx++; 
            } 
        } 
  
        // array elements back to it's original form 
        for (int i = 0; i < n; i++) 
            arr[i] = arr[i] / max_elem; 
    } 
  
    // Driver method 
    public static void main(String[] args) 
    { 
        int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }; 
        int n = arr.length; 
        System.out.println("Original Array"); 
        System.out.println(Arrays.toString(arr)); 
        rearrange(arr, n); 
        System.out.println("Modified Array"); 
        System.out.println(Arrays.toString(arr)); 
    } 
} 



    public static int[] rearrangeArray2(int[] nums) {
        
        int n = nums.length;
        int[] average = new int[n];
        for (int i = 1; i < n-1; i++) {
            average[i] = (nums[i-1] + nums[i+1])/2;
        }

        average[0] = nums[1];
        average[n-1] = nums[n-2];

        Arrays.sort(nums);
        Arrays.sort(average);

        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            if (nums[i] >= average[i]) {
                answer[i] = nums[i-1];
            } else {
                answer[i] = nums[i];
            }
        }

        return answer;
    }
}