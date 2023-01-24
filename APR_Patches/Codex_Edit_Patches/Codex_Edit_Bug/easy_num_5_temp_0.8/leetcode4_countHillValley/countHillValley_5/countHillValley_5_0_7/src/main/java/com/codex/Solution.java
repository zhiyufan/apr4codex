package com.codex;

import java.util.*;

public class Solution {

    import java.util.*;

    public class Main {

    public static int countHillValley(int[] nums) {
        if (nums == null || nums.length < 3) return 0;
        
        int count = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i - 1] < nums[i] && nums[i + 1] < nums[i]) {
                count++;
            }

            if (nums[i - 1] > nums[i] && nums[i + 1] > nums[i]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nums[] = { 1, 4, 6, 7, 5, 4, 3 };
        System.out.println(countHillValley(nums));

        sc.close();
    }
}
}