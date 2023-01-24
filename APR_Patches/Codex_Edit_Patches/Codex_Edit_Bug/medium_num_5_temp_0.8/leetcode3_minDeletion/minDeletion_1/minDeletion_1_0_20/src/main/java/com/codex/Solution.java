package com.codex;

import java.util.*;

public class Solution {
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            System.out.print("Enter the length of the array:");
            Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();
            int[] nums = new int[size];
            System.out.print("Enter the elements of the array:");
            for (int i = 0; i < size; i++) {
                nums[i] = sc.nextInt();
            }
            System.out.print("Enter the number of elements to be deleted:" + minDeletion(nums));
        }

    public static int minDeletion(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] % 2 == 0) {
                if (nums[i] == nums[i+1]) {
                    count++;
                }
            } else {
                if (nums[i] != nums[i+1]) {
                    count++;
                }
            }
        }
        return count;
    }

}
}