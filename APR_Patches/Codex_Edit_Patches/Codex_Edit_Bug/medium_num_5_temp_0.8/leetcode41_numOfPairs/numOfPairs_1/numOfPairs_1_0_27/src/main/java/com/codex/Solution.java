package com.codex;

import java.util.*;

public class Solution {
public class Main {
    public static void main(String[] args) {
        String[] nums = {"12", "24", "35", "70", "88", "120", "155"};
        String target = "70";

        System.out.println("Number of pairs is: " + numOfPairs(nums, target));
    }
    public static int numOfPairs(String[] nums, String target) {
        

        int count = 0;
                    System.out.println("Pair of numbers is: " + nums[i] + "  " + nums[j]);

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]).equals(target)) {
                    count++;
                }
            }
        }
        return count;
    }

    
}