package com.codex;

import java.util.*;

public class Solution {
    public static int countElements(int[] nums) {
        
        if (nums == null || nums.length == 0) {
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
    public static void findAllPermutation(String input) {
        findAllPermutation(input, "");
    }

    private static void findAllPermutation(String input, String output) {
        if (input.length() == 0) {
            System.out.print(output + " ");
        }
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            String remaining = input.substring(0, i) + input.substring(i + 1);
            findAllPermutation(remaining, output + c);
        }
    }

    public static void printAllSubString(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                System.out.println(str.substring(i, j));
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();

            String result = isBalanced(s);

            System.out.println(result);
        }

        scanner.close();
    }
}
    }

    
}