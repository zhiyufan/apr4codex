package com.codex;

import java.util.*;

public class Solution {
    public static int[] rearrangeArray2(int[] nums) {
        
        int n = nums.length;
        int[] average = new int[n];
        for (int i = 1; i < n-1; i++) {
            average[i] = (nums[i-1] + nums[i+1])/2;
        }

        average[0] = nums[1];
        System.out.print("nums: ");
        for (int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("average: ");
        for (int i : average) {
            System.out.print(i + " ");
        }
        System.out.println();

        average[n-1] = nums[n-2];

        Arrays.sort(nums);
        Arrays.sort(average);

        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            if (nums[n-i-1] >= average[i]) {
                answer[i] = nums[n-i-1];
            } else {
                answer[i] = nums[n-i-1];
            }

            System.out.println("nums[" + i + "]: " + nums[i] + ", average[" + i + "]: " + average[i]);
        }


        return answer;
    }
}