package com.codex;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] p = new int[n];
        for(int p_i=0; p_i < n; p_i++){
            p[p_i] = in.nextInt();
        }
        System.out.println(numberOfWeeks(p));
    }


    public static long numberOfWeeks(int[] milestones){
        int[] dp = new int[milestones.length];
        int max = milestones[0];
        int index = 0;
        for (int i = 0; i < milestones.length; i++) {
            if (milestones[i] > max) {
                max = milestones[i];
                index = i;
            }
        }
        long total = milestones[index];
        for (int i = index - 1; i >= 0; i--) {
            dp[i] = (int) (milestones[i] / (index - i));
            total += dp[i];
        }
        return total;
    }
}