package com.codex;

import java.util.*;

public class Solution {
public class Main {
    public static int countHillValley(int[] nums) {
        int hills = 0;
        int valleys = 0;
        int i = 1;
        while (i < nums.length - 1) {
            if (nums[i] < nums[i + 1]) {
                while (i < nums.length - 1 && nums[i] <= nums[i + 1]) i++;
                hills++;
            } else if (nums[i] > nums[i + 1]) {  // trick: index out of bound
                while (i < nums.length - 1 && nums[i] >= nums[i + 1]) i++;
                valleys++;
            }
            i++;
        }
        return hills + valleys + 1;
    }


    public static void main(String[] args) {
        int[] input = {1, 2, 1, 1, 2, 1, 2, 1};
        System.out.println(countHillValley(input));
    }
}
}