package com.codex;

import java.util.*;

public class Solution {
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        while (sc.hasNext()) {
            String s = sc.nextLine();
            String[] tmp = s.split(" ");
            int f1 = Integer.parseInt(tmp[0]);
            int f2 = Integer.parseInt(tmp[1]);
            int f3 = Integer.parseInt(tmp[2]);
            int c1 = Integer.parseInt(tmp[3]);
            int c2 = Integer.parseInt(tmp[4]);
            int c3 = Integer.parseInt(tmp[5]);
            int min = Integer.MAX_VALUE;
            for (int i = 0; i <= f1; i++) {
                int tmp1 = i * c1;
                for (int j = 0; j <= f2; j++) {
                    int tmp2 = tmp1 + j * c2;
                    for (int k = 0; k <= f3; k++) {
                        if (i + j + k > min) {
                            break;
                        }
                        if (i + j + k < min) {
                            min = i + j + k;
                        }
                        int tmp3 = tmp2 + k * c3;
                        int d = w(tmp3);
                        if (d <= min) {
                            min = d;
                        }
                    }
                }
            }
            sb.append(min).append("\n");
        }
        System.out.println(sb);

    }

    static int w(int num) {
        int res = 0;
        while (num != 0) {
            if (num % 2 != 0) {
                res++;
            }
            num = num / 2;
        }
        return res;
    }
}

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 0;
        while (sc.hasNext()) {
            t++;
            System.out.println("Case " + t + ":");
            long[] num = new long[5];
            long max = Long.MIN_VALUE;
            for (int i = 1; i <= 4; i++) {
                num[i] = sc.nextInt();
                if (num[i] > max) {
                    max = num[i];
                }
            }
            long res = max * max;
            String result = String.valueOf(res);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < result.length(); i++) {
                if (result.charAt(i) != '0') {
                    sb.append(result.charAt(i));
                }
            }
            System.out.println(sb);
        }
    }
}


public static int minimumOperations(int[] nums) {
        
        int len = nums.length;
        int[][] dp = new int[len][2];
        dp[0][0] = 0;
        dp[0][1] = 1;
        dp[1][0] = dp[1][1] = 1;
        for (int i = 2; i < len; i++) {
            dp[i][0] = dp[i-1][1];
            if (nums[i] != nums[i-1]) {
                dp[i][0] += 1;
            }
            dp[i][1] = Math.min(dp[i-1][0], dp[i-1][1]);
            if (nums[i] != nums[i-1]) {
                dp[i][1] += 1;
            }
        }
        return Math.min(dp[len-1][0], dp[len-1][1]);
    }
}