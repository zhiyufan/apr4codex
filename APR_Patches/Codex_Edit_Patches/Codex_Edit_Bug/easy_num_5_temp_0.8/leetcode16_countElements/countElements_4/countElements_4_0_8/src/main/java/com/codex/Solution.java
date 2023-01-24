package com.codex;

import java.util.*;

public class Solution {
    public static int findMissingNumber(int[] nums) {

        if (nums == null || nums.length == 0) return 0;

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        int n = nums.length + 1;
        int totalSum = (n * (n + 1)) / 2;
        return totalSum - sum;
    }

    public static int findMissingNumberWithXOR(int[] nums) {

        if (nums == null || nums.length == 0) return 0;

        int x1 = nums[0];
        int x2 = 1;

        for (int i = 1; i < nums.length; i++) {
            x1 ^= nums[i];
        }

        for (int i = 2; i <= nums.length + 1; i++) {
            x2 ^= i;
        }

        return x1 ^ x2;
    }

    public static void main(String[] args) {

        int[] nums = {2, 3, 1, 5, 4};
        int missingNumber = findMissingNumberWithXOR(nums);
        System.out.println("Missing number is :: " + missingNumber);
    }

}

            return 0;
        }
        Arrays.sort(nums);

        int count = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] > nums[i - 1] && nums[i] < nums[i + 1]) {
                count++;
            }
        }
        return count;
    }

    
}