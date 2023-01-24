package com.codex;

import java.util.*;

public class Solution {
class Solution {
    public static int countHillValley(int[] nums) {
        // 不要管这个函数的名字，只给你这一个函数的实现体
        // 你可以修改它的实现方式，这样调用这个函数时，也能得到我要的结果
        if (nums == null || nums.length < 3) return 0;
        int count = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i - 1] < nums[i] && nums[i + 1] < nums[i]) count++;
            if (nums[i - 1] > nums[i] && nums[i + 1] > nums[i]) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        // write your code here
        int[] nums = {2, 1, 2, 3, 4, 3, 2};
        System.out.println(countHillValley(nums));
    }
}
}