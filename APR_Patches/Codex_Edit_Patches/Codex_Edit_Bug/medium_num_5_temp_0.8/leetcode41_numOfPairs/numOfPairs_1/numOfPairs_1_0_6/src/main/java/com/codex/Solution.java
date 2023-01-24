package com.codex;

import java.util.*;

public class Solution {
    import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            String[] names = new String[n];
            for (int i = 0; i < n; i++) {
                names[i] = scanner.next();
            }
            String target = scanner.next();
            System.out.println(numOfPairs(names, target));
        }

    public static int numOfPairs(String[] nums, String target) {
        int[] nums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(nums[i]);
        }


        int count = 0;

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
}