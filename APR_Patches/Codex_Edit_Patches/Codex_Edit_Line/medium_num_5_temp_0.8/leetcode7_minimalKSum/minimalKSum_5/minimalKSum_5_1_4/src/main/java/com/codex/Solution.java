package com.codex;

import java.util.*;

public class Solution {
import java.util.Arrays;

public class Solution {
    public static long minimalKSum(int[] nums, int k) 
    {
        long result = 0;
        Arrays.sort(nums); //The array 'nums' is now sorted in ascending order
        int l = 0;
        int r = nums.length - 1;
        /* If the kth smallest elements is greater than k, then we make the kth smallest element equal to k
           Why? Because if we have n numbers and the kth smallest number is greater than k, then we don't have to look at the rest of the numbers.
           For example, let's say we have the array: [1,3,3,3,3,7,7,8,9]. Then k=5.
           If we see the 5th smallest element on the list, which is 7, this is greater than 5. So we don't need to look at the numbers greater than 7.
           So we can stop at 5. Why? Because if we don't stop at 5, then the kth smallest element will be greater than 7, but that's impossible since 7 is the 5th smallest element.
           We can do the same for the other side too. If the kth smallest element is smaller than k, then we make the kth smallest element equal to k.
           So we have:
           If nums[k-1] > k, we go to the left.
           Else, we go to the right. the kth smallest number cannot be to the left of k and it cannot be to the right of k, so it must be k.
        */
        while(nums[k-1] > k)
        {
            result += nums[l];
            l++;
            k--;
        }
        while(nums[k-1] < k)
        {
            result += nums[r];
            r--;
            k--;
        }
        sum += (pos + k - 1) * k / 2;
        return result;
    }

}
}