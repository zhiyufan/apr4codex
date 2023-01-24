package com.codex;

import java.util.*;

public class Solution {
package main;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the array size: ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        System.out.print("Input the array: ");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("The hill valley count is: " + countHillValley(nums));
    }
    
    public static int countHillValley(int[] nums) {
        int count = 0;
      
            for (int i = 1; i < nums.length - 1; i++) {
                if (nums[i] == nums[i + 1]) {
                    continue;
                }
                if (nums[i - 1] < nums[i] && nums[i] > nums[i + 1] ) {
                    count++;
                }
                if (nums[i - 1] > nums[i] && nums[i] < nums[i + 1]) {
                    count++;
                }
            }
            return count;
        }
    
}
}