package com.codex;

import java.util.*;

public class Solution {
    public static int minSwaps(int[] nums) {
        /** A swap is defined as taking two distinct positions in an array and swapping the values in them.
         * A circular array is defined as an array where we consider the first element and the last element to be adjacent.
         * Given a binary circular array nums, return the minimum number of swaps required to group all 1's present in the array together at any location.
         */
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(nums[i]==1) count++;
        }
        int count1=0;
        for(int i=0;i<count;i++){
            if(nums[i]==1) count1++;
        }
        int r=count1;
        for(int i=0;i<n-count;i++){
            if(nums[i]==1) r--;
            if(nums[i+count]==1) r++;
            if(r<count1) count1=r;
        }
        return count-count1;
    }

    }