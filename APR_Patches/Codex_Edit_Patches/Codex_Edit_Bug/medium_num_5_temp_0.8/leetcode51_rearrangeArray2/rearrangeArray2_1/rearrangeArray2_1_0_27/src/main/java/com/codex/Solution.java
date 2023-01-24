package com.codex;

import java.util.*;

public class Solution {

//https://leetcode.com/discuss/interview-question/383669

    public static int[] rearrangeArray2(int[] nums) {
        int n = nums.length;
        int[] average = new int[n];
        for (int i = 1; i < n - 1; i++) {
            average[i] = (nums[i - 1] + nums[i + 1]) / 2;
        }

        average[0] = nums[1];
        average[n - 1] = nums[n - 2];


        Arrays.sort(nums);
        Arrays.sort(average);

        int[] answer = new int[n];
        for (int i = 0, j = 0; i < n; i++) {
            if (nums[j] >= average[i]) {
                answer[i] = nums[j];
                j++;
            } else {
                answer[i] = nums[j];
                j++;
                i++;
                answer[i] = nums[j];
                j++;
            }
        }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(rearrangeArray2(new int[]{6, 1, 9, 5, 4})));
    }
        return answer;
    }
}