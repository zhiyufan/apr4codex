package com.codex;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        for (int i = 0; i < s; i++) {
            int n = in.nextInt();
            int dist = in.nextInt();
            int[] rungs = new int[n];
            for (int j = 0; j < n; j++) {
                rungs[j] = in.nextInt();
            }
            System.out.println(addRungs(rungs, dist));
        }
    }

    public static int addRungs(int[] rungs, int dist) {
        int rungsCount = 1;
        int maxReach = rungs[0];
        for (int i = 1; i < rungs.length; i++) {
            if (rungs[i] - maxReach > dist) {
                rungsCount++;
                maxReach = rungs[i - 1];
            }
            maxReach = Math.max(maxReach, rungs[i]);
        }
        return rungsCount;
    }

    
}