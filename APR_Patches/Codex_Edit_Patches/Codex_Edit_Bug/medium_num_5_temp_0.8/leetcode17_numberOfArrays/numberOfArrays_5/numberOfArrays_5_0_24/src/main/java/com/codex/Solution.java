package com.codex;

import java.util.*;

public class Solution {
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int lower = scanner.nextInt();
        int upper = scanner.nextInt();
        scanner.nextLine();
        int[] differences = new int[n];
        for(int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            int[] nums = new int[input.length];
            for(int j = 0; j < input.length; j++) {
                nums[j] = Integer.parseInt(input[j]);
            }
            differences[i] = nums[1] - nums[0];
        }

        System.out.println(numberOfArrays(differences, lower, upper));
    }

    public static int numberOfArrays(int[] differences, int lower, int upper) {

        int size = differences.length + 1;
        long[][] dp = new long[size][2];
        dp[0][0] = 1;
        dp[0][1] = 1;


        for(int i = 0; i < size; i++) {
            for(int j = 1; j < size; j++) {
                int diff = differences[j - 1];
                dp[j][0] = dp[j - 1][1] + dp[j][0];
                dp[j][1] = dp[j - 1][0] + dp[j][1];
                int min = Math.max(lower - diff, -1000000000);
                int max = Math.min(upper - diff, 1000000000);
                if(max < j || min > j) {
                    dp[j][1] = 0;
                }
            }
            if(i < size - 1) {
                dp[i + 1][0] = 0;
                dp[i][1] = 0;
            }
        }

        return (int) dp[size - 1][1];
    }
}