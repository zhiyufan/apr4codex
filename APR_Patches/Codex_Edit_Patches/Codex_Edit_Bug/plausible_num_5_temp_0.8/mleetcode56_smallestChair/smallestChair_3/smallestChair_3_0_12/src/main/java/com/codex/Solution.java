package com.codex;

import java.util.*;

public class Solution {
import java.util.Arrays;


public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 5, 6, 7, 8};
        int[] arr2 = {3, 2, 1, 4, 6};
        System.out.println(missingNumber(arr2));
        System.out.println(missingNumber(arr1));
    }

    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        if(nums[len-1] != len) return len;
        else if(nums[0] != 0) return 0;

        for(int i=1;i<len;i++){
            if(nums[i]!=nums[i-1]+1){
                return nums[i - 1] + 1;
            }
        }

        for (int i = 0; i < chairs.length; i++) {
            if (chairs[i]) {
                targetFriend--;
            }
            if (targetFriend < 0) {
                return i;
            }
        }
        return -1;
    }

    
}