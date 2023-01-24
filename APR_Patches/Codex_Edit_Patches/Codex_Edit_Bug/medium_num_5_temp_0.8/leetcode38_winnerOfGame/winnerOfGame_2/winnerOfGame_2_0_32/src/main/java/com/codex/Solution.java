package com.codex;

import java.util.*;

public class Solution {

  
import java.util.Scanner;

    public class Solution {

    public static boolean winnerOfGame(String colors) {
        
        if (colors == null || colors.length() == 0) {
            return false;
        }
        if (colors.length() == 1) {
            return true;
        }
        int[][] dp = new int[colors.length() + 1][2];
        dp[1][0] = colors.charAt(0) == 'B' ? 1 : 0;
        dp[1][1] = colors.charAt(0) == 'A' ? 1 : 0;

        for (int i = 2; i <= colors.length(); i++) {
            dp[i][0] = dp[i - 1][0] + (colors.charAt(i - 1) == 'B' ? 1 : 0);
            dp[i][1] = Math.min(
                    dp[i - 1][0] + (colors.charAt(i - 1) == 'A' ? 1 : 0),
                    dp[i - 1][1] + (colors.charAt(i - 1) == 'B' ? 1 : 0)
            );
        }
        return dp[colors.length()][1] != dp[colors.length()][0];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 1; i <= T; i++) {
            int N = in.nextInt();
            in.nextLine();
            String c = in.nextLine();
            if (winnerOfGame(c)) {
                System.out.println("Alice");
            } else {
                System.out.println("Bob");
            }
        }
    }


    
}