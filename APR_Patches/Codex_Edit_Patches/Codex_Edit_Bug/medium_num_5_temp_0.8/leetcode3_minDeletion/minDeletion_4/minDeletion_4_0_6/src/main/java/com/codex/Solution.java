package com.codex;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        int[] nums1 = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            nums1[i] = scanner.nextInt();
        }
        System.out.println(minDeletion(nums));
        System.out.println(minDeletion(nums1));

    }

    public static int minDeletion(int[] nums) {

        int count = 0;
        for (int i = 0; i < nums.length - 1; i = i + 2) {
            if (nums[i] == nums[i + 1]) {
                count++;
            }
        }
        if (nums.length % 2 == 1) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == nums[i + 1]) {
                    count++;
                }
            }
        }
        return count;
    }

}