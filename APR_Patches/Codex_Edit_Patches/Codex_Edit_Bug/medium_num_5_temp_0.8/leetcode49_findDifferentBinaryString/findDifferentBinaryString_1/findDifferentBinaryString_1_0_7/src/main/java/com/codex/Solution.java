package com.codex;

import java.util.*;

public class Solution {
    public static String findDifferentBinaryString(String[] nums) {
        
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 && nums[i].equals("0" + nums[i + 1])) {
                return "1" + nums[i];
            } else if (i == nums.length - 1 && nums[i].equals(nums[i - 1] + "0")) {
                return nums[i] + "1";
            } else if (i != 0 && nums[i].equals(nums[i - 1] + "0") && nums[i].equals("0" + nums[i + 1])) {
                return nums[i] + "1";
            }
        }

        return "";
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of binary strings in the array.");
        int count = sc.nextInt();
        System.out.println("Enter the " + count + " binary numbers.");
        String[] nums = new String[count];
        for (int i = 0; i < count; i++) {
            nums[i] = sc.next();
        }
        System.out.println("The number is " + findDifferentBinaryString(nums));
        sc.close();
    }
}