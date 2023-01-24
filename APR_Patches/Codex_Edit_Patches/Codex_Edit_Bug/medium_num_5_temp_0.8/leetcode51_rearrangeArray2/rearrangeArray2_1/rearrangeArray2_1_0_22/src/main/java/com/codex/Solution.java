package com.codex;

import java.util.*;

public class Solution {
package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] nums = {6,1,4,5,3,9,0,8,7,2};
        int[] copy = nums.clone();
        
        rearrangeArray(nums);

        Arrays.sort(copy);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != copy[i]) {
                System.out.println("Failed");
                break;
            }
            System.out.println(nums[i]);
        }
    }

    public static void rearrangeArray(int[] nums) {

        int n = nums.length;
        int[] average = new int[n-1];

        for (int i = 0; i < n-1; i++) {
            average[i] = (nums[i]+nums[i+1])/2;
        }

        Arrays.sort(average);

        Arrays.sort(nums);
        Arrays.sort(average);

        for (int i = 0; i < n-1; i++) {
            if (nums[i] == nums[i+1]) {
                i++;
            } else {
                nums[i] = average[i];
            }
        }

        return answer;
    }
}