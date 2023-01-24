package com.codex;

import java.util.*;

public class Solution {

public class Test {
    
    public static void main(String[] args) {
        int[] nums = {2,2,2,2,2,2,2};
        int[] ans = rearrangeArray(nums);
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
    
    public static int[] rearrangeArray2(int[] nums) {
        
        double avg = average(nums);
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            if (num == avg) continue;
            list.add(num);
        }

        int[] ans = new int[nums.length];
        int index = 0;
        Collections.sort(list);
        int total = list.size();
        int i = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == avg) {
                ans[i] = list.get(total - 1);
                total--;
            } else {
                ans[i] = list.get(i);
                i++;
            }
        }
        return ans;
    }

    private static double average(int[] nums) {
        double sum = 0.0;
        for (int num : nums) {
            sum += num;
        }
        return sum / nums.length;
    }

}
}