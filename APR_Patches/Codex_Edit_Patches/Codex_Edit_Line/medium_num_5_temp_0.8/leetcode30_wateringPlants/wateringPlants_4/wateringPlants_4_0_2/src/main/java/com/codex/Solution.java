package com.codex;

import java.util.*;

public class Solution {
public static int wateringPlants(int[] plants, int capacity) {
    
    if (plants.length == 1) {
        return plants[0] <= capacity ? 1 : 2;
    }

    int limit = (capacity * 2) + 1;
    boolean[] dp = new boolean[limit];
    dp[0] = true;
    dp[plants[0]] = true;

    for (int i = 1; i < plants.length; i++) {
        if (plants[i] >= limit) {
            return -1;
        }

        for (int j = 0; j < limit; j++) {
            if (dp[j]) {
                int add = j + plants[i];
                int substract = Math.abs(j - plants[i]);

                if (add < limit) {
                    dp[add] = true;
                }

                if (substract < limit) {
                    dp[substract] = true;
                }
            }
        }
    }

    if (dp[plants[plants.length - 1]]) {
        return 1;
    }

    if (plants[0] + plants[plants.length - 1] <= capacity) {
        return 1;
    }
    if (Math.abs(plants[0] - plants[plants.length - 1]) <= capacity) {
        return 1;
    }

    if (dp[plants[plants.length - 1]]) {

        int steps = 0;
        int curCap = capacity;

        for (int i = 0; i < plants.length; i++) {
            if (curCap < plants[i]) {
                curCap = capacity;
                steps++;
            }

            curCap -= plants[i];
            steps++;

            if (i + 1 < plants.length) {
                if (curCap < plants[i + 1]) {
                    curCap = capacity;
                    steps++;
                }
            }
        }

        return steps;
    }

    
}